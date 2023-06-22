package com.example.models.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "training")

public class Training implements Serializable{
    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date created_date;
    private Date deleted_date;
    private Date updated_date;
    private String nama_penagajar;
    private String tema;
    public Training(Long id, Date created_date, Date deleted_date, Date updated_date, String nama_penagajar,
            String tema) {
        this.id = id;
        this.created_date = created_date;
        this.deleted_date = deleted_date;
        this.updated_date = updated_date;
        this.nama_penagajar = nama_penagajar;
        this.tema = tema;
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
    public String getNama_penagajar() {
        return nama_penagajar;
    }
    public void setNama_penagajar(String nama_penagajar) {
        this.nama_penagajar = nama_penagajar;
    }
    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
}
