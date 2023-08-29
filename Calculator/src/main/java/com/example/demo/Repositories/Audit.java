package com.example.demo.Repositories;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Audit extends JpaRepository<com.example.demo.Models.Audit, Long>{
	
    List<com.example.demo.Models.Audit> findByUsernameAndCreatedAtBetween(String username, LocalDate fromDate, LocalDate toDate);


}
