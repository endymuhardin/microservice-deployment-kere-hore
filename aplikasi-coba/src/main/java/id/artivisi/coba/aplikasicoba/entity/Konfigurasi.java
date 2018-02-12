package id.artivisi.coba.aplikasicoba.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity @Data
public class Konfigurasi {
    @Id
    private String id;
    private String nama;
    private String nilai;
}
