package com.sda.OrangeJavaPL2.repository;

import com.sda.OrangeJavaPL2.entity.Bread;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BreadRepository {
    private final IBreadRepository breadRepository;
    public List<Bread> getAllBreads (){
        return (List<Bread>) breadRepository.findAll();
    }
    public void addBread(Bread bread) {breadRepository.save(bread);}
}
