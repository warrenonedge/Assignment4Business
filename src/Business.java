
public abstract class Business {
	protected int busNum;
	protected double totalRec;
	protected double taxDue;
	
	public Business(int businessNum){
		busNum = businessNum;
	}
	
	public Business(int businessNum, double totalReceipt){
		busNum = businessNum;
		totalRec = totalReceipt;
	}
	
	public abstract void print();
}

class Restaurants extends Business {
	public double foodReceipt;
	public double drinkReceipt;
		
	public Restaurants(int businessNum) {
		super(businessNum);
	}
	
	public void setReceipt(double foodReceipt, double drinkReceipt){
		this.totalRec += foodReceipt+drinkReceipt;
		this.foodReceipt += foodReceipt;
		this.drinkReceipt += drinkReceipt;
		if (drinkReceipt>foodReceipt){
			this.taxDue += (this.totalRec*0.03);
		}
		this.taxDue += drinkReceipt*0.08;
	}

	public void print() {
		System.out.println("Restaurant "+ String.valueOf(this.busNum)+" Taxes Due: "+String.valueOf(this.taxDue));
	}
	
}

class Hotels extends Business {

	public Hotels(int businessNum) {
		super(businessNum);
	}
	
	public void setReceipt(double totalReceipt, int occ){
		this.totalRec += totalReceipt;
		if (occ>90){
			this.taxDue += totalReceipt*0.02;
		}
		this.taxDue += totalReceipt*0.06;
	}
	
	public void print() {
		System.out.println("Hotel "+ String.valueOf(this.busNum)+" Taxes Due: "+String.valueOf(this.taxDue));
	}
	
}

class ConvStore extends Business {
	public double newsReceipt;
	public double otherReceipt;
	
	public ConvStore(int businessNum) {
		super(businessNum);
	}
	
	public void setReceipt(double newsReceipt, double otherReceipt){
		this.newsReceipt += newsReceipt;
		this.otherReceipt += otherReceipt;
		this.taxDue += otherReceipt * 0.07;
	}

	public void print() {
		System.out.println("Convience Store "+ String.valueOf(this.busNum)+" Taxes Due: "+String.valueOf(this.taxDue));
	}
	
}
