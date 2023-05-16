package com.module.Avis.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Avis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titre;
    private String description;
    private int note;
    private int userId;

}
