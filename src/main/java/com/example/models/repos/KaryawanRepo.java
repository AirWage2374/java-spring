package com.example.models.repos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import com.example.models.entities.Karyawan;

public interface KaryawanRepo extends CrudRepository<Karyawan, Long> {

    Page<Karyawan> findByNamaContainingIgnoreCase(String nama, Pageable pageable);
    
}

