package com.example.demo.controller;

import com.example.demo.model.Lokasi;
import com.example.demo.repository.LokasiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lokasi")
public class LokasiController {

    @Autowired
    private LokasiRepository lokasiRepository;

    @PostMapping
    public Lokasi addLokasi(@RequestBody Lokasi lokasi) {
        return lokasiRepository.save(lokasi);
    }

    @GetMapping
    public List<Lokasi> getAllLokasi() {
        return lokasiRepository.findAll();
    }

    @PutMapping("/{id}")
    public Lokasi updateLokasi(@PathVariable Integer id, @RequestBody Lokasi lokasi) {
        lokasi.setId(id);
        return lokasiRepository.save(lokasi);
    }

    @DeleteMapping("/{id}")
    public void deleteLokasi(@PathVariable Integer id) {
        lokasiRepository.deleteById(id);
    }
}