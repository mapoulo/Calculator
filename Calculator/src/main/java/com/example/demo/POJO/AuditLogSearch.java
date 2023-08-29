package com.example.demo.POJO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuditLogSearch {
	
	    private String username;
	    private Date fromDate;
	    private Date toDate;

}
