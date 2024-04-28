package com.Buyogo.Shivam.Traini8.Repository;


import com.Buyogo.Shivam.Traini8.Entity.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TrainingCenterRepository extends JpaRepository<TrainingCenter, String> {
    boolean existsByCenterCode(String centerCode);
    void deleteByCenterCode(String centerCode);
    Optional<TrainingCenter> findTrainingCenterByCenterCode(String centerCode);
    List<TrainingCenter> findByCoursesOfferedContainingIgnoreCase(String coursesOffered);
    List<TrainingCenter> findByCenterNameContainingIgnoreCase(String name);
    List<TrainingCenter> findByStudentCapacityBetween(Integer minCapacity, Integer maxCapacity);
}