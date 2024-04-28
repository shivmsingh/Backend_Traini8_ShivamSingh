package com.Buyogo.Shivam.Traini8.Controller;

import com.Buyogo.Shivam.Traini8.DTO.TrainingCenterDTO;
import com.Buyogo.Shivam.Traini8.Exception.CustomException;
import com.Buyogo.Shivam.Traini8.Service.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trainingcenters")
public class TrainingCenterController {


    private final TrainingCenterService trainingCenterService;

    @Autowired
    public TrainingCenterController(TrainingCenterService trainingCenterService) {
        this.trainingCenterService = trainingCenterService;
    }

    // Create A Center
    @PostMapping
    public ResponseEntity<TrainingCenterDTO> createTrainingCenter(@RequestBody @Valid TrainingCenterDTO trainingCenterDTO) {
        TrainingCenterDTO createdTrainingCenterDTO = trainingCenterService.createTrainingCenter(trainingCenterDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTrainingCenterDTO);
    }


    // Get All Centers
    @GetMapping
    public ResponseEntity<List<TrainingCenterDTO>> getAllTrainingCenters() {
        List<TrainingCenterDTO> trainingCenterDTOs = trainingCenterService.getAllTrainingCenters();
        return ResponseEntity.ok(trainingCenterDTOs);
    }

    // Get Center by Id
    @GetMapping("/id/{centerId}")
    public ResponseEntity<TrainingCenterDTO> findTrainingCentreById(@PathVariable String centerId) {
        TrainingCenterDTO trainingCenterDTOs = trainingCenterService.findByCentreId(centerId);
        return ResponseEntity.ok(trainingCenterDTOs);
    }

    //
    @GetMapping("/capacity")
    public ResponseEntity<List<TrainingCenterDTO>> findByCapacityBetween(
            @RequestParam(value = "min", required = false) Integer minCapacity,
            @RequestParam(value = "max", required = false) Integer maxCapacity) {
        if (minCapacity == null || maxCapacity == null) {
            throw new CustomException("Please provide both min and max capacity");
        }
        List<TrainingCenterDTO> trainingCenterDTOs = trainingCenterService.findByCapacityBetween(minCapacity, maxCapacity);
        return ResponseEntity.ok(trainingCenterDTOs);
    }

    // Get Center by name
    @GetMapping("/name/{centerName}")
    public ResponseEntity<List<TrainingCenterDTO>> findTrainingCentreByName(@PathVariable String centerName) {
        List<TrainingCenterDTO> trainingCenterDTOs = trainingCenterService.findByCentreName(centerName);
        return ResponseEntity.ok(trainingCenterDTOs);
    }

    // Update Center with Id
    @PutMapping("/{centerCode}")
    public ResponseEntity<TrainingCenterDTO> updateTrainingCenter(
            @PathVariable String centerCode,
            @RequestBody @Valid TrainingCenterDTO trainingCenterDTO) {
        TrainingCenterDTO updatedTrainingCenterDTO = trainingCenterService.updateTrainingCenter(centerCode, trainingCenterDTO);
        return ResponseEntity.ok(updatedTrainingCenterDTO);
    }

    // Delete Center With ID
    @DeleteMapping("/{centerCode}")
    public ResponseEntity<Void> deleteTrainingCenter(@PathVariable String centerCode) {
        trainingCenterService.deleteTrainingCenter(centerCode);
        return ResponseEntity.noContent().build();
    }

    // Get Centers by Courses
    @GetMapping("/course/{course}")
    public ResponseEntity<List<TrainingCenterDTO>> findByCourse(@PathVariable String course) {
        List<TrainingCenterDTO> trainingCenterDTOs = trainingCenterService.findByCourse(course);
        return ResponseEntity.ok(trainingCenterDTOs);
    }

}