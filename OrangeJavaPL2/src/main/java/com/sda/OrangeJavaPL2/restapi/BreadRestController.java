package com.sda.OrangeJavaPL2.restapi;

import com.sda.OrangeJavaPL2.entity.Bread;
import com.sda.OrangeJavaPL2.repository.BreadRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
@RequiredArgsConstructor

public class BreadRestController {
    private final BreadRepository breadRepository;
    //exaample localhost/breads
    @GetMapping("/breads")
    public List<Bread> getAllBreads(){
        return breadRepository.getAllBreads();
    }

}
