package com.example.demo.controller;

import com.example.demo.model.ProyekLokasi;
import com.example.demo.repository.ProyekLokasiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyek-lokasi")
public class ProyekLokasiController {

    @Autowired
    private ProyekLokasiRepository proyekLokasiRepository;

    @PostMapping
    public ProyekLokasi addProyekLokasi(@RequestBody ProyekLokasi proyekLokasi) {
        return proyekLokasiRepository.save(proyekLokasi);
    }

    @GetMapping
    public List<ProyekLokasi> getAllProyekLokasi() {
        return proyekLokasiRepository.findAll();
    }

    @PutMapping("/{id}")
    public ProyekLokasi updateProyekLokasi(@PathVariable Integer id, @RequestBody ProyekLokasi proyekLokasi) {
        proyekLokasi.setId(id);
        return proyekLokasiRepository.save(proyekLokasi);
    }

    @DeleteMapping("/{id}")
    public void deleteProyekLokasi(@PathVariable Integer id) {
        proyekLokasiRepository.deleteById(id);
    }
}