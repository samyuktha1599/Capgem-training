package day7.task1.exception;

public class EmployeeService {
	private String employees[] = {"101001011","102001022","103002011","104003080","105002020","106002080"};
	/*
	 * Note : employee codes are designed in following way: 
	 * a) first 3 digits are employee code
	 * b) next 3 digits are related to their department id.
	 * c) and last 3 digits are the city code of their work location 
	 *     for example 
	 *       011 : Delhi 
	 *       022 : Mumbai 
	 *       080 : Banglore
	 *       020 : Pune
	 * */
	
	public String[] getEmployeeCodes()
	{
		String codes[] = new String[employees.length];
		int count = -1;
	
		for (String empid : employees)
		{
			codes[++count] = empid.substring(0, 3);
			String str=empid.substring(6);
			codes[count]=codes[count].concat(str);
		
		}
		
		return codes;
	}
	 public void getEmployeeCity(String empid) throws CityException
	 {
	
			if(empid.substring(3).contentEquals("011"))
				
			{
				
				System.out.println(" : Delhi");
				
			}
			else if(empid.substring(3).contentEquals("022"))
				
			{
				
				System.out.println(" : Mumbai");
				
			}
			
			
			else if(empid.substring(3).contentEquals("080"))
				
			{
				
				System.out.println(" : Bangalore");
				
			}
			
			else if(empid.substring(3).contentEquals("020"))
				
			{      
				
				System.out.println(" : Pune");
				
			}
			
			
			else
			{
				throw new CityException("Invalid Pincode");
			}
	 }
	


}
