package com.sda.OrangeJavaPL2.restapi;

import com.sda.OrangeJavaPL2.entity.Art;
import com.sda.OrangeJavaPL2.repository.ArtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/art")
public class ArtRestController {

    @Autowired
    private ArtRepository artRepository;

    @GetMapping
    public Iterable<Art> findAll() {
        return artRepository.findAll();
    }

    @PostMapping
    public Art addArt(@RequestBody Art art) {
        return artRepository.save(art);
    }

}