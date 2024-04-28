package com.Buyogo.Shivam.Traini8.Service;

import com.Buyogo.Shivam.Traini8.DTO.TrainingCenterDTO;
import com.Buyogo.Shivam.Traini8.Entity.TrainingCenter;
import com.Buyogo.Shivam.Traini8.Exception.CustomException;
import com.Buyogo.Shivam.Traini8.Exception.ResourceNotFoundException;
import com.Buyogo.Shivam.Traini8.Repository.TrainingCenterRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrainingCenterServiceImpl implements TrainingCenterService {


    private final TrainingCenterRepository trainingCenterRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public TrainingCenterServiceImpl(TrainingCenterRepository trainingCenterRepository, ModelMapper modelMapper) {
        this.trainingCenterRepository = trainingCenterRepository;
        this.modelMapper = modelMapper;
    }

    // Create A Training Center
    @Override
    public TrainingCenterDTO createTrainingCenter(TrainingCenterDTO trainingCenterDTO) {

        if (trainingCenterRepository.existsByCenterCode(trainingCenterDTO.getCenterCode())) {
            // Handle the case where a record with the same centerCode already exists
            throw new CustomException("Training center with the same centerCode already exists.");
        }

        TrainingCenter trainingCenter = modelMapper.map(trainingCenterDTO, TrainingCenter.class);
        trainingCenter.setCreatedOn(Instant.now().toEpochMilli());
        TrainingCenter savedTrainingCenter = trainingCenterRepository.save(trainingCenter);
        return modelMapper.map(savedTrainingCenter, TrainingCenterDTO.class);
    }

    // Get All Training Centres
    @Override
    public List<TrainingCenterDTO> getAllTrainingCenters() {
        List<TrainingCenter> trainingCenters = trainingCenterRepository.findAll();
        return trainingCenters.stream()
                .map(trainingCenter -> modelMapper.map(trainingCenter, TrainingCenterDTO.class))
                .collect(Collectors.toList());
    }

    // Get Center By CenterId
    @Override
    public TrainingCenterDTO findByCentreId(String centerId) {
        TrainingCenter TrainingCenter = trainingCenterRepository.findTrainingCenterByCenterCode(centerId)
                .orElseThrow(() -> new ResourceNotFoundException("Training center not found"));
        return modelMapper.map(TrainingCenter, TrainingCenterDTO.class);
    }

    @Override
    public List<TrainingCenterDTO> findByCentreName(String centerName) {
        List<TrainingCenter> trainingCenters = trainingCenterRepository.findByCenterNameContainingIgnoreCase(centerName);

        return trainingCenters.stream()
                .map(trainingCenter -> modelMapper.map(trainingCenter, TrainingCenterDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<TrainingCenterDTO> findByCapacityBetween(Integer minCapacity, Integer maxCapacity) {
        List<TrainingCenter> trainingCenters = trainingCenterRepository.findByStudentCapacityBetween(minCapacity, maxCapacity);
        return trainingCenters.stream()
                .map(trainingCenter -> modelMapper.map(trainingCenter, TrainingCenterDTO.class))
                .collect(Collectors.toList());
    }

    // Update Center by Id
    @Override
    public TrainingCenterDTO updateTrainingCenter(String centerCode, TrainingCenterDTO trainingCenterDTO) {
        TrainingCenter existingTrainingCenter = trainingCenterRepository.findTrainingCenterByCenterCode(centerCode)
                .orElseThrow(() -> new ResourceNotFoundException("Training center not found"));

        Long createdOn = existingTrainingCenter.getCreatedOn();
        modelMapper.map(trainingCenterDTO, existingTrainingCenter);
        existingTrainingCenter.setCenterCode(centerCode);
        existingTrainingCenter.setCreatedOn(createdOn);
        TrainingCenter updatedTrainingCenter = trainingCenterRepository.save(existingTrainingCenter);
        return modelMapper.map(updatedTrainingCenter, TrainingCenterDTO.class);
    }

    // Delete Center
    @Override
    @Transactional
    public void deleteTrainingCenter(String centerCode) {
        if (!trainingCenterRepository.existsByCenterCode(centerCode)) {
            throw new ResourceNotFoundException("Training center not found");
        }
        trainingCenterRepository.deleteByCenterCode(centerCode);
    }

    // Get Centers By Course Offered
    @Override
    public List<TrainingCenterDTO> findByCourse(String name) {
        List<TrainingCenter> trainingCenters = trainingCenterRepository.findByCoursesOfferedContainingIgnoreCase(name);
        return trainingCenters.stream()
                .map(trainingCenter -> modelMapper.map(trainingCenter, TrainingCenterDTO.class))
                .collect(Collectors.toList());
    }

}