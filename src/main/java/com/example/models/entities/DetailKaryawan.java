package com.example.models.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "detail_karyawan")

public class DetailKaryawan implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nik;
    private String npwp;
    private Long id_karyawan;
    
    public DetailKaryawan(Long id, String nik, String npwp, Long id_karyawan) {
        this.id = id;
        this.nik = nik;
        this.npwp = npwp;
        this.id_karyawan = id_karyawan;
    }

    public static Long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNik() {
        return nik;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNpwp() {
        return npwp;
    }
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public Long getId_karyawan() {
        return id_karyawan;
    }
    public void setId_karyawan(Long id_karyawan) {
        this.id_karyawan = id_karyawan;
    }
}

