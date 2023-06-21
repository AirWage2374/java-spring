package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.models.entities.Training;
import com.example.models.repos.TrainingRepo;

@Service
public class TrainingService {

    @Autowired
    private TrainingRepo trainingRepo;

    public Training createTraining(Training training) {
        return trainingRepo.save(training);
    }

    public Training updateTraining(Training training) {
        return trainingRepo.save(training);
    }

    public Page<Training> getTrainingsByName(String nama, Pageable pageable) {
        return trainingRepo.findByNamaContainingIgnoreCase(nama, pageable);
    }

    public Training getTrainingById(long id) {
        return trainingRepo.findById(id).orElse(null);
    }
}
