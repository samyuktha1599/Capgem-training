package com.capg.app.ui;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.capg.app.beans.Instructor;
import com.capg.app.dto.InstructorsLocationCountDTO;
import com.capg.app.exception.InstructorNotFoundException;
import com.capg.app.service.InstructorService;
import com.capg.app.service.InstructorServiceImpl;

public class MainClass {
	
	InstructorService service;
	Scanner sc=new Scanner(System.in);
	
	public MainClass() {
		service = new InstructorServiceImpl();
	}
	
	public static void main(String[] args) {
		
		MainClass obj = new MainClass();
		
		while(true)
		{
			
			System.out.println("1. Insert");
			System.out.println("2. Show All");
			System.out.println("3. Get Instructor by code");
			System.out.println("4. Get Instructor by location");
			System.out.println("5. Delete Instructor by code");
			System.out.println("6. Display count of instructors by location");
			System.out.println("0. EXIT");
			
		
			
			int opt =Integer.parseInt(obj.sc.nextLine());
					//new Scanner(System.in).nextInt(); 
			
			
			switch(opt)
			{
			case 1:
				obj.insertInstructorDetailsFromUser();
				break;
			case 2:
				obj.readInstructorDetails();
				break;
			case 3:
				obj.getInstructorByCode();
				break;
			case 4:
				obj.getInstructorByLocation();
				break;
			case 5:
				obj.deleteInstructorByCode();
				break;
			case 6:
				obj.getInstructorByLocation();
				break;
			case 0:
				System.exit(0);
			}
			
			
		}//end while
		
		
	}//end main
	
	public void insertInstructorDetailsFromUser()
	{
		
		// ... write code to read data hope 
		System.out.println("Enter id:");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("Enter name:");
		String name=sc.nextLine();
		System.out.println("Enter salary:");
		int salary=Integer.parseInt(sc.nextLine());
		System.out.println("Enter joining year:");
		int joiningYear=Integer.parseInt(sc.nextLine());
		System.out.println("Enter email id:");
		String email=sc.nextLine();	
		System.out.println("Enter location:");
		String location=sc.nextLine();
		
		Instructor instructor = new Instructor(id, name, salary, joiningYear, email, location);
		try {
			boolean result = service.insertInstructor(instructor);
			
			if(result) System.out.println(" Instructor Added");
			else System.out.println("Contact Admin ...");
		} catch (Exception e) {
			showErr(e);
		}
		
		
	}
	public void readInstructorDetails()
	{
		
		try
		{
			List<Instructor> list = service.getInstructors() ;
			
			list.stream().forEach(instructor->displayInstructor(instructor));
		}
		catch(Exception e)
		{
			showErr(e);
		}
	
	}
	public void getInstructorByCode()
	{
		System.out.println("Enter instructor code:");
		int code=Integer.parseInt(sc.nextLine());
		
		try {
			displayInstructor(service.getInstructorByCode(code));
		} 
		catch (InstructorNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getInstructorByLocation()
	{
		System.out.println("Enter instructor location:");
		String trainerLocation=sc.nextLine();
		try {
			List<Instructor> list = service.getInstructorsByLocation(trainerLocation);
			list.stream().forEach(instructor->displayInstructor(instructor));
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	public void printLocationCount() {
		try {
			List<InstructorsLocationCountDTO> list = service.getInstructorsCountByLocation();
			list.stream().forEach(InstructorLocationCountDTO->displayInstructorCount(InstructorLocationCountDTO));
		}
		catch (Exception e) {
			// TODO: handle exception
			
			showErr(e);
		}
		
	}
	
	public void deleteInstructorByCode()
	{
		System.out.println("Enter instructor code:");
		int code=Integer.parseInt(sc.nextLine());
		boolean result;
		
			try {
				result = service.delteInstructorByCode(code);
				if(result) System.out.println(" Instructor Deleted");
				else System.out.println("Contact Admin ...");
			} 
			catch (InstructorNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
		
		
	}
	
	public void displayInstructor(Instructor instructor)
	{
		
		System.out.println(instructor);
		System.out.println("-------------------------------------------------------");
	}
	public void showErr(Exception e)
	{
		System.out.println("====>> "+e);
	}
	
	public void displayInstructorCount(InstructorsLocationCountDTO instructor)
	{
		
		System.out.println(instructor);
		System.out.println("-------------------------------------------------------");
	}

}
