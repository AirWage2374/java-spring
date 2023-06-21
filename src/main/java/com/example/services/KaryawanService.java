package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.entities.Karyawan;
import com.example.models.repos.KaryawanRepo;

@Service
public class KaryawanService {

    @Autowired
    private KaryawanRepo karyawanRepo;

    public Karyawan createKaryawan(Karyawan karyawan) {
        return karyawanRepo.save(karyawan);
    }

    public Karyawan updateKaryawan(Karyawan karyawan) {
        if (karyawanRepo.existsById(karyawan.getId())) {
            return karyawanRepo.save(karyawan);
        } else {
            return null;
        }
    }

    public Karyawan getKaryawanById(long id) {
        return karyawanRepo.findById(id).orElse(null);
    }
}
