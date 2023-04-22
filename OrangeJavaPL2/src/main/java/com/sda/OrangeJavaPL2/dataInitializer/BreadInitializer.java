package com.sda.OrangeJavaPL2.dataInitializer;

import com.sda.OrangeJavaPL2.entity.Bread;
import com.sda.OrangeJavaPL2.repository.BreadRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor

public class BreadInitializer {
    private final BreadRepository breadRepository;
    @PostConstruct
    public void initBreads() {
        Bread bread = new Bread(1L,"Bagietka",3.5);
        Bread bread1 = new Bread(1L,"Grahamka",1.0);

        breadRepository.addBread(bread);
        breadRepository.addBread(bread1);
    }
}
