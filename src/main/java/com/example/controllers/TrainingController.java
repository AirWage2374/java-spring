package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.models.entities.Training;
import com.example.services.TrainingService;

@RestController
@RequestMapping("/v1/training")
public class TrainingController {

    @Autowired
    private TrainingService trainingService;

    @PostMapping
    public ResponseEntity<Training> insertTraining(@RequestBody Training training) {
        Training createdTraining = trainingService.createTraining(training);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTraining);
    }

    @PutMapping
    public ResponseEntity<Training> updateTraining(@RequestBody Training training) {
        Training updatedTraining = trainingService.updateTraining(training);

        if (updatedTraining != null) {
            return ResponseEntity.ok(updatedTraining);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/list")
    public ResponseEntity<Page<Training>> getTrainingsByName(@RequestParam("nama") String nama,
                                                             @RequestParam(value = "page", defaultValue = "0") int page,
                                                             @RequestParam(value = "size", defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Training> trainings = trainingService.getTrainingsByName(nama, pageable);
        return ResponseEntity.ok(trainings);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Training> getTrainingById(@PathVariable("id") long id) {
        Training training = trainingService.getTrainingById(id);

        if (training != null) {
            return ResponseEntity.ok(training);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
