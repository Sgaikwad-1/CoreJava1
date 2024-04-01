package com.eb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eb.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
Address findByZipCode(String id) ;
}