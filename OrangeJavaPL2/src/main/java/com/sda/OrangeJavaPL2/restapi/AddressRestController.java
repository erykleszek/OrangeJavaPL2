package com.sda.OrangeJavaPL2.restapi;

import com.sda.OrangeJavaPL2.entity.Address;
import com.sda.OrangeJavaPL2.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping(path = "/api")
@RequiredArgsConstructor
public class AddressRestController {

    private final AddressRepository addressRepository;

    @GetMapping(path = "/addresses")
    public Set<Address> getAllAddresses(){
        return addressRepository.getAllAddresses();
    }
}
