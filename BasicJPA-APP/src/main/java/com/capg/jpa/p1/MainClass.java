package com.capg.jpa.p1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainClass {
	

		public static void main(String[] args) {
			
			Configuration cfg = new Configuration();
			SessionFactory factory = cfg.configure().buildSessionFactory(); 
			
			System.out.println("1");
			
			Session session = factory.openSession();// jdbc -> coonection object
			Transaction t = session.beginTransaction();
			
			// ---- write code for data base operation ----
			
		Account a = new Account();
			Account b = new Account();
		
			a.setAccountHolderName("Tom");
			a.setBalance(10000);
			Address ad=new Address(120,"Bangalore","Karnataka");
			a.setAddress(ad);
			Address office=new Address(80,"Bangalore","Karnataka");
			a.setOffice_address(office);
			
			
			session.save(a);  // insert into Account .....
			
	/*		a=(Account)session.get(Account.class, 2); //retrieve data
			a.setAccountHolderName("Jai");    //update data
			a.setBalance(2500);
			
		//-----------------	update-----------------
			a=(Account)session.get(Account.class, 2);
			a.setAccountHolderName("Jai");    //update data
			a.setBalance(2500);
			session.saveOrUpdate(a);
		
		//----------------delete----------------
			b=(Account)session.get(Account.class,5);
			session.delete(b);    //get data and delete
			System.out.println(a);
			
			*/
			//System.out.println("  -->> Data Saved ..");
			t.commit();
			
			
			
			
			
			session.close();
			System.out.println("All Done");
			
			
		}

}
