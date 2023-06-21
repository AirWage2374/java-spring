package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.models.entities.KaryawanTraining;
import com.example.models.repos.KaryawanTrainingRepo;

@Service
public class KaryawanTrainingService {

    @Autowired
    private KaryawanTrainingRepo karyawanTrainingRepo;

    public KaryawanTraining createKaryawanTraining(KaryawanTraining karyawanTraining) {
        return karyawanTrainingRepo.save(karyawanTraining);
    }

    public Page<KaryawanTraining> getKaryawanTrainingByNamaAndTraining(String namaKaryawan, String namaTraining,
            Pageable pageable) {
        return karyawanTrainingRepo.findByKaryawanIdContainingIgnoreCaseAndTrainingIdContainingIgnoreCase(namaKaryawan,
                namaTraining, pageable);
    }
}
