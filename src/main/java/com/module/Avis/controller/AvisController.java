package com.module.Avis.controller;


import com.module.Avis.entity.Avis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AvisController {

    private AvisService avisService;

    @Autowired
    public AvisController(AvisService avisService) {
        this.avisService = avisService;
    }

    @GetMapping("/avis/{id}")
    public ResponseEntity<Avis> getAvisById(@PathVariable("id") int id) {
        Avis avis = avisService.getAvisById(id);

        if (avis != null) {
            return ResponseEntity.ok(avis);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/Avis/user/{id_utilisateur}")
    public ResponseEntity<List<Avis>> getAvisByUserId(@PathVariable("id_utilisateur") int userId) {
        List<Avis> avisList = avisService.getAvisByUserId(userId);

        if (!avisList.isEmpty()) {
            return ResponseEntity.ok(avisList);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Avis> createAvis(@RequestBody Avis avis, @RequestHeader("Authorization") String token) {
        // Vérifier l'authenticité du token ici


        Avis nouveauAvis = avisService.createAvis(avis);

        return ResponseEntity.status(HttpStatus.CREATED).body(nouveauAvis);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Avis> updateAvis(@PathVariable("id") int id, @RequestBody Avis avis, @RequestHeader("Authorization") String token) {
        // Vérifier l'authenticité du token ici


        Avis avisMisAJour = avisService.updateAvis(id, avis);

        return ResponseEntity.status(HttpStatus.OK).body(avisMisAJour);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAvis(@PathVariable("id") int id, @RequestHeader("Authorization") String token) {
        // Vérifier l'authenticité du token ici

        avisService.deleteAvis(id);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
