package com.Buyogo.Shivam.Traini8.Service;
import com.Buyogo.Shivam.Traini8.DTO.TrainingCenterDTO;
import java.util.List;


public interface TrainingCenterService {
    TrainingCenterDTO createTrainingCenter(TrainingCenterDTO trainingCenterDTO);
    List<TrainingCenterDTO> getAllTrainingCenters();
    TrainingCenterDTO updateTrainingCenter(String centerCode, TrainingCenterDTO trainingCenterDTO);
    void deleteTrainingCenter(String centerCode);
    List<TrainingCenterDTO> findByCourse(String name);
    TrainingCenterDTO findByCentreId(String centreId);
    List<TrainingCenterDTO> findByCentreName(String centerName);
    List<TrainingCenterDTO> findByCapacityBetween(Integer minCapacity, Integer maxCapacity);
}