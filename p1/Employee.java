package p1;

public class Employee {

	private int empId;
	private String empName;
	private int salary;
	private String projectName;
	private int exp;

	
	
	
	
	




	public Employee(int id, String name, int salary2, String project, int experience) {
		empId=id;
		empName=name;
		salary=salary2;
		projectName=project;
		exp=experience;
		
	}




	public int getEmpId() {
		return empId;
	}




	public void setEmpId(int empId) {
		this.empId = empId;
	}




	public String getEmpName() {
		return empName;
	}




	public void setEmpName(String empName) {
		this.empName = empName;
	}




	public int getSalary() {
		return salary;
	}




	public void setSalary(int salary) {
		this.salary = salary;
	}




	public String getProjectName() {
		return projectName;
	}




	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}




	public void Salary()
	{
	    int s=getExp();
	    if(s<3)
	    {
	    	int sal=getSalary();
	    	if(sal>3000)
	    	{
	    		System.out.println("Salary is high");
	    	}
	    }
	    
	    else{
	    	int sal=getSalary();
	       if(sal>20000) {
	    	System.out.println("Error");}
	    }
	}




	public int getExp() {
		return exp;
	}




	public void setExp(int exp) {
		this.exp = exp;
	}
	
	


	
}
