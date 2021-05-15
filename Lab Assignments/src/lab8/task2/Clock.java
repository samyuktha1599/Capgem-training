package lab8.task2;

public class Clock implements Runnable{
	
	public static void main(String[] args) {
		System.out.println(" == My Clock ==");
		
		int hours = 0;
		int min = 0;
		int sec = 0;
		
		
		while(hours<24)
		{
			min = 0;
			while(min<60)
			{
				sec = 0;
				while(sec<60)
				{
					
						System.out.println(hours+" : "+min+" : "+sec);
						try {
							Thread.sleep(100);
						} 
						catch (InterruptedException e) {
							
							System.out.println(e);
						}
						
					
						
				
					sec++;
				}
				min++;
					
			}
			hours++;
		}
		
		
		
		
		
		
	}

	@Override
	public void run() {
		
		
	}

}
