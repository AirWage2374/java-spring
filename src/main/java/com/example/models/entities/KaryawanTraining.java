package com.example.models.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "karyawan_training")

public class KaryawanTraining implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date created_date;
    private Date deleted_date;
    private Date updtaed_date;
    private Date tanggal_training;
    private String karyawan_id;
    private String training_id;
    public KaryawanTraining(Long id, Date created_date, Date deleted_date, Date updtaed_date, Date tanggal_training,
            String karyawan_id, String training_id) {
        this.id = id;
        this.created_date = created_date;
        this.deleted_date = deleted_date;
        this.updtaed_date = updtaed_date;
        this.tanggal_training = tanggal_training;
        this.karyawan_id = karyawan_id;
        this.training_id = training_id;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getCreated_date() {
        return created_date;
    }
    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }
    public Date getDeleted_date() {
        return deleted_date;
    }
    public void setDeleted_date(Date deleted_date) {
        this.deleted_date = deleted_date;
    }
    public Date getUpdtaed_date() {
        return updtaed_date;
    }
    public void setUpdtaed_date(Date updtaed_date) {
        this.updtaed_date = updtaed_date;
    }
    public Date getTanggal_training() {
        return tanggal_training;
    }
    public void setTanggal_training(Date tanggal_training) {
        this.tanggal_training = tanggal_training;
    }
    public String getKaryawan_id() {
        return karyawan_id;
    }
    public void setKaryawan_id(String karyawan_id) {
        this.karyawan_id = karyawan_id;
    }
    public String getTraining_id() {
        return training_id;
    }
    public void setTraining_id(String training_id) {
        this.training_id = training_id;
    }
}
