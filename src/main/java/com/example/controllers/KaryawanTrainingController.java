package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.models.entities.KaryawanTraining;
import com.example.services.KaryawanTrainingService;

@RestController
@RequestMapping("/v1/training-karyawan")
public class KaryawanTrainingController {

    @Autowired
    private KaryawanTrainingService karyawanTrainingService;

    @PostMapping
    public ResponseEntity<KaryawanTraining> insertKaryawanTraining(@RequestBody KaryawanTraining karyawanTraining) {
        KaryawanTraining createdKaryawanTraining = karyawanTrainingService.createKaryawanTraining(karyawanTraining);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdKaryawanTraining);
    }

    @GetMapping("/list")
    public ResponseEntity<Page<KaryawanTraining>> getKaryawanTrainingByNamaAndTraining(
            @RequestParam(value = "namaKaryawan", required = false) String namaKaryawan,
            @RequestParam(value = "namaTraining", required = false) String namaTraining,
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "size", defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<KaryawanTraining> karyawanTrainings = karyawanTrainingService
                .getKaryawanTrainingByNamaAndTraining(namaKaryawan, namaTraining, pageable);
        return ResponseEntity.ok(karyawanTrainings);
    }

    // Metode lain seperti delete, dll.
}
