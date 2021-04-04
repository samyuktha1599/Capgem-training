package p1;

public class StockTrackingApp {
	public static void main(String[] args) {
		Stock st=new Stock("a",20000);
		Stock st1=new Stock("b",50000);
		Stock st2=new Stock("c",30000);
		
		System.out.println(st.getStockName());
		
		
		System.out.println(st.getStockPrice());
		st.PriceChange(20,true);
		System.out.println("Increased price is :"+st.getStockPrice());
	
System.out.println(st1.getStockName());
		
		System.out.println(st1.getStockPrice());
		st1.PriceChange(80,true);
		System.out.println("Increased price is :"+st1.getStockPrice());
		
	}

}
