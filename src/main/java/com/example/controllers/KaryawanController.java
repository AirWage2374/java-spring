package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.models.entities.Karyawan;
import com.example.services.KaryawanService;

@RestController
@RequestMapping("/v1/karyawan")
public class KaryawanController {

    @Autowired
    private KaryawanService karyawanService;

    @PostMapping
    public ResponseEntity<Karyawan> insertKaryawan(@RequestBody Karyawan karyawan) {
        Karyawan createdKaryawan = karyawanService.createKaryawan(karyawan);

        return ResponseEntity.status(HttpStatus.CREATED).body(createdKaryawan);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Karyawan> updateKaryawan(@PathVariable("id") Long id, @RequestBody Karyawan karyawan) {
        karyawan.setId(id);
        Karyawan updatedKaryawan = karyawanService.updateKaryawan(karyawan);

        if (updatedKaryawan != null) {
            return ResponseEntity.ok(updatedKaryawan);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Karyawan> getKaryawanById(@PathVariable("id") Long id) {
        Karyawan karyawan = karyawanService.getKaryawanById(id);

        if (karyawan != null) {
            return ResponseEntity.ok(karyawan);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
