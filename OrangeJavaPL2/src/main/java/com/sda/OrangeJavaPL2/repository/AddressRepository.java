package com.sda.OrangeJavaPL2.repository;

import com.sda.OrangeJavaPL2.entity.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Repository
public class AddressRepository {

    private final IAddressRepository addressRepository;

    public void addAddress(Address address){
        addressRepository.save(address);
    }

    public Set<Address> getAllAddresses(){
        return addressRepository.findAll()
                .stream()
                .collect(Collectors.toSet());
    }
}
