package com.capg.app.service;

import com.capg.app.beans.Instructor;
import com.capg.app.dao.InstructorDAO;
import com.capg.app.dao.InstructorDAOImpl;
import com.capg.app.dto.InstructorsLocationCountDTO;
import com.capg.app.exception.EmailException;
import com.capg.app.exception.InstructorNotFoundException;
import com.capg.app.exception.NameException;

import java.sql.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InstructorServiceImpl implements InstructorService {
	
	InstructorDAO dao;
	
	public InstructorServiceImpl() {
		dao = new InstructorDAOImpl();
	}

	@Override
	public boolean insertInstructor(Instructor instructor)throws SQLException, NameException, EmailException {
		
		boolean isQueryExecuted = false;
		
		// --- call business Server side validations
		
		// call Security layer 
		/*-----------name and email exception-------*/
		String name=instructor.getName();
		if(name.length()>5) isQueryExecuted = dao.insertInstructor(instructor);
		else throw new NameException("Name cannot have less than 5 characters.");
		
		String email=instructor.getEmail();
		String regex = "^[A-Za-z]+[. _]?[0-9[a-z]]+[@][a-z]+[.][a-z]+$"; 
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(email);
		if(matcher.matches()==true) isQueryExecuted = dao.insertInstructor(instructor);
		else throw new EmailException("Invalid email ID");
		// call Logger task
		
		return isQueryExecuted;
	}

	@Override
	public Instructor getInstructorByCode(int code) throws InstructorNotFoundException, SQLException {
		
		return dao.getInstructorByCode(code);
	}

	@Override
	public List<Instructor> getInstructors() throws SQLException{
		
		return dao.getInstructors();
	}

	@Override
	public List<Instructor> getInstructorsByLocation(String trainerLocation) throws SQLException {
		
		return dao.getInstructorsByLocation(trainerLocation);
	}

	@Override
	public List<InstructorsLocationCountDTO> getInstructorsCountByLocation() throws SQLException {
		// TODO Auto-generated method stub
		return dao.getInstructorsCountByLocation();
	}

	@Override
	public List<Instructor> getInstructorsBySalary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delteInstructorByCode(int code) throws InstructorNotFoundException, SQLException {
	
		return dao.delteInstructorByCode(code);
	}

	@Override
	public Instructor updateInstructor(Instructor oldInfoInstructor) {
		// TODO Auto-generated method stub
		return null;
	}


}
