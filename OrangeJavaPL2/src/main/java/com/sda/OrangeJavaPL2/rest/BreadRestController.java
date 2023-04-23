package com.sda.OrangeJavaPL2.rest;

import com.sda.OrangeJavaPL2.entity.Address;
import com.sda.OrangeJavaPL2.entity.Bread;
import com.sda.OrangeJavaPL2.repository.AddressRepository;
import com.sda.OrangeJavaPL2.service.BreadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(path = "/api/breads")
@RequiredArgsConstructor
public class BreadRestController {

    private final BreadService breadService;

    // example:    localhost:<port>/api/breads
    @GetMapping()
    public List<Bread> getAllBreads() {
        return breadService.getAllBreads();
    }


    //PostMapping without mapping error codes returning to client
//    @PostMapping()
//    void addBread(@RequestBody Bread bread) { // @RequestBody to map to bread
//        breadRepository.addBread(bread);
//    } //
    @PostMapping()
    ResponseEntity addBread(@RequestBody Bread bread) {
        return breadService.addBread(bread);
    }
}