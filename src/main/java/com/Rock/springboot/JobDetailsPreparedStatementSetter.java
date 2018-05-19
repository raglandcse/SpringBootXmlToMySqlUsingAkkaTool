package com.Rock.springboot;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;

import com.Rock.springboot.model.JobDetails;

public class JobDetailsPreparedStatementSetter implements ItemPreparedStatementSetter<JobDetails> {

	
   public void setValues(JobDetails details, PreparedStatement ps) throws SQLException {
		
		ps.setString(1,details.getTitle());
		
		ps.setString(2, details.getDate());
		
		ps.setString(3, details.getReferencenumber());
		
		ps.setString(4, details.getUrl());
		
		ps.setString(5,details.getCompany());
		
		ps.setString(6, details.getCity());
		
		ps.setString(7, details.getState());
		
		ps.setString(8, details.getZip());
		
		ps.setString(9, details.getDescription());
		
		ps.setString(10, details.getMajor_category0());
		
		ps.setString(11, details.getMinor_category0());
		
		ps.setString(12, details.getPrice());
		
		ps.setString(13, details.getMobile());
		
		ps.setString(14, details.getUpdated());
		
	}

}