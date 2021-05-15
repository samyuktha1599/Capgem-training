package com.capg.app.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.capg.app.beans.Instructor;
import com.capg.app.dto.InstructorsLocationCountDTO;
import com.capg.app.exception.InstructorNotFoundException;

public class InstructorDAOImpl implements InstructorDAO{
	
	Connection con;
	PreparedStatement ps;
	
	public InstructorDAOImpl(){
		con = DatabaseUtil.con; // no need to create Util Class for all users/ one shared class
	}
	
	
	
	@Override
	public boolean insertInstructor(Instructor instructor)throws SQLException {
		
		boolean isInserted = false;
		
		int code = instructor.getInstructorCode();
		String name = instructor.getName();
		String email = instructor.getEmail();
		String location = instructor.getTrainerLocation();
		int salary = instructor.getSalary();
		int jobStartYear = instructor.getJobStartYear();
		
		
		String query = "insert into Instructor values(?,?,?,?,?,?)";
		
		ps = con.prepareStatement(query);
		ps.setInt(1, code);
		ps.setString(2,name);
		ps.setInt(3, salary);
		ps.setInt(4, jobStartYear);
		ps.setString(5,email);
		ps.setString(6,location);
		
		int i = ps.executeUpdate();
		
		if(i == 1) isInserted = true;
		
		return isInserted;
	}

	@Override
	public Instructor getInstructorByCode(int code) throws InstructorNotFoundException, SQLException {
		String sqlQuery = "select * from instructor where instructorCode="+code;
		ps = con.prepareStatement(sqlQuery);
		ResultSet rs=ps.executeQuery();
		Instructor instructor;
		while(rs.next()) {
			
			int code1=rs.getInt("instructorCode");
			String name=rs.getString("name");
			int salary = rs.getInt("salary");
			int  jobStartYear = rs.getInt("jobStartYear");
			String email = rs.getString("email_id");
			String location = rs.getString("trainer_location");
			if(code1==code)
			{
				instructor= new Instructor(code1, name, salary, jobStartYear, email, location);
				return instructor;
			}
			
		}
		
		
		return null;
	}

	@Override
	public List<Instructor> getInstructors() throws SQLException {
		
		
		String sqlQuery = "select * from instructor";
		ps = con.prepareStatement(sqlQuery);
		
		ResultSet rs = ps.executeQuery();
		List<Instructor> list = new ArrayList<>();
		
		while(rs.next())
		{
			int code = rs.getInt("instructorCode");
			String name = rs.getString("name");
			String email = rs.getString("email_id");
			String location = rs.getString("trainer_location");
			int salary = rs.getInt("salary");
			int jobStartYear = rs.getInt("jobStartYear");
			
		
			list.add(new Instructor(code, name, salary, jobStartYear, email, location));
			
		}
		
		
		return list;
	}

	@Override
	public List<Instructor> getInstructorsByLocation(String trainerLocation) throws SQLException {
		
		String sqlQuery = "select * from instructor where trainer_location = '"+trainerLocation+"'";
		ps = con.prepareStatement(sqlQuery);
		ResultSet rs=ps.executeQuery();
		List<Instructor> list = new ArrayList<>();
		while(rs.next()) {
			
			int code=rs.getInt("instructorCode");
			String name=rs.getString("name");
			int salary = rs.getInt("salary");
			int  jobStartYear = rs.getInt("jobStartYear");
			String email = rs.getString("email_id");
			String location = rs.getString("trainer_location");
		
			if(location.contentEquals(trainerLocation))
			{ 
				list.add(new Instructor(code, name, salary, jobStartYear, email, location));
				
			}
			
		}
		
		return list;
	}
//yet to do
	@Override
	public List<InstructorsLocationCountDTO> getInstructorsCountByLocation() throws SQLException {
		String sqlQuery = "select trainer_location,count(*) from instructor group by trainer_location ";
		ps = con.prepareStatement(sqlQuery);
		ResultSet rs=ps.executeQuery();
		List<InstructorsLocationCountDTO> list = new ArrayList<>();
		while(rs.next()) {
		
			String location = rs.getString("trainer_location");
			int count = rs.getInt("count");
			
			
			list.add(new InstructorsLocationCountDTO(location,count));
		}
		
		return list;
	}

	@Override
	public List<Instructor> getInstructorsBySalary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delteInstructorByCode(int code) throws InstructorNotFoundException, SQLException {
		String sqlQuery="delete from instructor where instructorCode="+code;
		ps=con.prepareStatement(sqlQuery);
		ResultSet rs=ps.executeQuery();
		int i=ps.executeUpdate();
		
		if(i==0) return true;
		return false;
	}

	@Override
	public Instructor updateInstructor(Instructor oldInfoInstructor) {
		// TODO Auto-generated method stub
		return null;
	}

}
