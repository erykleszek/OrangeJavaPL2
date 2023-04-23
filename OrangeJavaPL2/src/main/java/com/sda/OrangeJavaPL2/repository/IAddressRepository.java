package com.sda.OrangeJavaPL2.repository;

import com.sda.OrangeJavaPL2.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepository extends JpaRepository<Address, Long> {
}
