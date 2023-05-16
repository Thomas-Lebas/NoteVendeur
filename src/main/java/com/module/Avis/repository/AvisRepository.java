package com.module.Avis.repository;

import com.module.Avis.entity.Avis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AvisRepository extends JpaRepository<Avis, Integer> {
    List<Avis> findByUserId(int userId);
}
