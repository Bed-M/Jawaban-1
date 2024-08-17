package com.example.demo.controller;

import com.example.demo.model.Proyek;
import com.example.demo.repository.ProyekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyek")
public class ProyekController {

    @Autowired
    private ProyekRepository proyekRepository;

    @PostMapping
    public Proyek addProyek(@RequestBody Proyek proyek) {
        return proyekRepository.save(proyek);
    }

    @GetMapping
    public List<Proyek> getAllProyek() {
        return proyekRepository.findAll();
    }

    @PutMapping("/{id}")
    public Proyek updateProyek(@PathVariable Integer id, @RequestBody Proyek proyek) {
        proyek.setId(id);
        return proyekRepository.save(proyek);
    }

    @DeleteMapping("/{id}")
    public void deleteProyek(@PathVariable Integer id) {
        proyekRepository.deleteById(id);
    }
}