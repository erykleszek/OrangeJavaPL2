package com.sda.OrangeJavaPL2.service;

import com.sda.OrangeJavaPL2.entity.Bread;
import com.sda.OrangeJavaPL2.repository.BreadRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BreadService {

    private final BreadRepository breadRepository;

    public List<Bread> getAllBreads() {
        return breadRepository.getAllBreads();
    }


    public ResponseEntity addBread(Bread bread) {
        if (bread == null) {
            return ResponseEntity
                    .status(404)
                    .build();
        } else if (bread.getName().equals("kajzerka")) {
            throw new IllegalArgumentException("ByczQ, kajzerka to na niedziele");
        }
        else {
            breadRepository.addBread(bread);
            return ResponseEntity
                    .status(201)
                    .build();
        }
    }
}
