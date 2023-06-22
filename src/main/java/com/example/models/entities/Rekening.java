package com.example.models.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Rekening")

public class Rekening implements Serializable{
    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date created_date;
    private Date deleted_date;
    private Date updated_date;
    private String jenis;
    private String nama;
    private String nomor;
    private Long karyawan_id;
    public Rekening(Long id, Date created_date, Date deleted_date, Date updated_date, String jenis, String nama,
            String nomor, Long karyawan_id) {
        this.id = id;
        this.created_date = created_date;
        this.deleted_date = deleted_date;
        this.updated_date = updated_date;
        this.jenis = jenis;
        this.nama = nama;
        this.nomor = nomor;
        this.karyawan_id = karyawan_id;
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
    public Date getUpdated_date() {
        return updated_date;
    }
    public void setUpdated_date(Date updated_date) {
        this.updated_date = updated_date;
    }
    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNomor() {
        return nomor;
    }
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
    public Long getKaryawan_id() {
        return karyawan_id;
    }
    public void setKaryawan_id(Long karyawan_id) {
        this.karyawan_id = karyawan_id;
    }
}
