package com.capg.app.service;

import java.util.List;

import com.capg.app.beans.Instructor;
import com.capg.app.dto.InstructorsLocationCountDTO;
import com.capg.app.exception.EmailException;
import com.capg.app.exception.InstructorNotFoundException;
import com.capg.app.exception.NameException;

import java.sql.*;

public interface InstructorService {
	
	public boolean insertInstructor(Instructor instructor)throws SQLException, NameException, EmailException;
	public Instructor getInstructorByCode(int code)throws InstructorNotFoundException, SQLException;  // 1
	public List<Instructor> getInstructors()throws SQLException;
	
	
	public List<Instructor> getInstructorsByLocation(String trainerLocation) throws SQLException;   // 2
	public List<InstructorsLocationCountDTO> getInstructorsCountByLocation() throws SQLException; // group by
	public List<Instructor> getInstructorsBySalary(); // order by ASC 
	
	
	public boolean delteInstructorByCode(int code)throws InstructorNotFoundException, SQLException; // 3
	public Instructor updateInstructor(Instructor oldInfoInstructor);
	
	
}
