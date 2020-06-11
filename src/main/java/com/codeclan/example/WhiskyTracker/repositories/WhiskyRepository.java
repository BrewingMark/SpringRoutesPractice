package com.codeclan.example.WhiskyTracker.repositories;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WhiskyRepository extends JpaRepository<Whisky, Long> {

    List<Whisky> findByName(String name);
    List<Whisky> findByDistilleryId(Long distillery_id);
    List<Whisky> findByYear(Integer year);
    List<Whisky> findByAge(Integer age);
//    List<Whisky> findByDistilleryIdAndAge(Long distillery_id, Integer age);

}
