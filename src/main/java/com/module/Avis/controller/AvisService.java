package com.module.Avis.controller;

import com.module.Avis.entity.Avis;
import com.module.Avis.repository.AvisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvisService {
    private AvisRepository avisRepository;

    @Autowired
    public AvisService(AvisRepository avisRepository) {
        this.avisRepository = avisRepository;
    }

    public Avis getAvisById(int id) {
        return avisRepository.findById(id).orElse(null);
    }

    public List<Avis> getAvisByUserId(int userId) {
        return avisRepository.findByUserId(userId);
    }
}
