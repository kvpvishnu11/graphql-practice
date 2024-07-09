package com.tcs.graphpractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.graphpractice.entity.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Long> {

}
