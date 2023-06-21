package com.example.models.repos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.models.entities.Training;

@Repository
public interface TrainingRepo extends JpaRepository<Training, Long> {

    Page<Training> findByNamaContainingIgnoreCase(String nama, Pageable pageable);

}
