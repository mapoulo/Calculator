package com.example.demo.Services;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositories.Audit;
import com.example.demo.Models.*;

@Service
public class AuditService {
	
	@Autowired
	private Audit service;
	
	public com.example.demo.Models.Audit saveAudit(com.example.demo.Models.Audit audit){
		return service.save(audit);
	} 
	
	public List<com.example.demo.Models.Audit> findByUsernameAndCreatedAtBetween(String username, LocalDate fromDate, LocalDate toDate) {
		return service.findByUsernameAndCreatedAtBetween(username, fromDate, toDate);
	}

}
