package id.artivisi.coba.aplikasicoba.controller;

import id.artivisi.coba.aplikasicoba.dao.KonfigurasiDao;
import id.artivisi.coba.aplikasicoba.entity.Konfigurasi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class HaloController {

    @Autowired private KonfigurasiDao konfigurasiDao;

    @GetMapping("/")
    public Map<String, String> home() {
        Map<String, String> data = new LinkedHashMap<>();
        data.put("waktu", LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        for (Konfigurasi k : konfigurasiDao.findAll()) {
            data.put(k.getNama(), k.getNilai());
        }

        return data;
    }
}
