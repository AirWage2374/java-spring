package com.example.models.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "karyawan")

public class Karyawan implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date created_date;
    private Date deleted_date;
    private Date updated_date;
    private String alamat;
    private Date dob;
    private String jk;
    private String nama;
    private String status;
    public Karyawan(long id, Date created_date, Date deleted_date, Date updated_date, String alamat, Date dob, String jk,
            String nama, String status) {
        this.id = id;
        this.created_date = created_date;
        this.deleted_date = deleted_date;
        this.updated_date = updated_date;
        this.alamat = alamat;
        this.dob = dob;
        this.jk = jk;
        this.nama = nama;
        this.status = status;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
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
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public String getJk() {
        return jk;
    }
    public void setJk(String jk) {
        this.jk = jk;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setDetailKaryawan(DetailKaryawan detailKaryawan) {
    }
}
