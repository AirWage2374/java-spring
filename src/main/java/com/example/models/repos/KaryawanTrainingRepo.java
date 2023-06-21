package com.example.models.repos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.entities.KaryawanTraining;

public interface KaryawanTrainingRepo extends JpaRepository<KaryawanTraining, Long> {

    Page<KaryawanTraining> findByKaryawanIdContainingIgnoreCaseAndTrainingIdContainingIgnoreCase(String namaKaryawan,
            String namaTraining, Pageable pageable);
}
