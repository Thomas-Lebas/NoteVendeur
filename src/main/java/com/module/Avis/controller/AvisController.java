package com.module.Avis.controller;


import com.module.Avis.entity.Avis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
        // Code pour récupérer l'avis avec l'ID spécifié depuis la base de données ou une autre source
        Avis avis = avisService.getAvisById(id);

        if (avis != null) {
            return ResponseEntity.ok(avis);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/Avis/user/{id_utilisateur}")
    public ResponseEntity<List<Avis>> getAvisByUserId(@PathVariable("id_utilisateur") int userId) {
        // Code pour récupérer tous les avis de l'utilisateur avec l'ID spécifié depuis la base de données ou une autre source
        List<Avis> avisList = avisService.getAvisByUserId(userId);

        if (!avisList.isEmpty()) {
            return ResponseEntity.ok(avisList);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
