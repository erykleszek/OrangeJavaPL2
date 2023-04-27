package com.sda.OrangeJavaPL2.dataInitializer;

import com.sda.OrangeJavaPL2.entity.Bread;
import com.sda.OrangeJavaPL2.entity.BreadType;
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
        Bread bread = new Bread("Bagietka", BreadType.WHEAT,3.5);
        Bread bread1 = new Bread("Grahamka",BreadType.MULTIGRAIN,1.0);

        breadRepository.addBread(bread);
        breadRepository.addBread(bread1);
    }
}
