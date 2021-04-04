package p1;

public class Stock {
     private String stockName;
     private int stockPrice;
     
    public  Stock(String name,int price)
     {
    	 stockName=name;
    	 stockPrice=price;
    	 }




	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}
    
	public int PriceChange(float percentage,boolean action)
	{
		if(action)
		{
			stockPrice=(int) (stockPrice+(percentage*stockPrice/100));
		}
		return stockPrice;
	}
	
}
