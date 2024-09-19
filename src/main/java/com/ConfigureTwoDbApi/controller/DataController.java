package com.ConfigureTwoDbApi.controller;

import com.ConfigureTwoDbApi.entity.DataEntity;
import com.ConfigureTwoDbApi.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping("/show/{id}")
    public ResponseEntity<?> showEntry(@PathVariable Long id) {
        try {
            Optional<DataEntity> entry = dataService.findById(id);

            if (entry.isPresent()) {
                return new ResponseEntity<>(entry.get(),HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>("Error: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/showAll")
    public ResponseEntity<?> showAll() {
        try {
            List<DataEntity> data = dataService.showALlEntries();
            if (data.isEmpty()) {
                return new ResponseEntity<>("No entries found", HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(data, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("/create")
    public ResponseEntity<?> createEntry(@RequestBody DataEntity entity) {
        try {
            DataEntity savedEntity = dataService.createEntry(entity);
            if (savedEntity != null) {
                return new ResponseEntity<>(savedEntity, HttpStatus.CREATED);
            } else {
                return new ResponseEntity<>("Failed to save the entity", HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e) {
            return new ResponseEntity<>("Error: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

