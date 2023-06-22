package com.example.models.repos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.models.entities.Karyawan;

public interface KaryawanRepo extends JpaRepository<Karyawan, Long> {

    Page<Karyawan> findByNamaContainingIgnoreCase(String nama, Pageable pageable);
    
}

