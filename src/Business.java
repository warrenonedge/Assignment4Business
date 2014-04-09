
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
	public int week=0;
		
	public Restaurants(int businessNum) {
		super(businessNum);
	}
	
	public void setReceipt(double foodReceipt, double drinkReceipt){
		this.week += 1;
		this.taxDue = 0;
		this.totalRec = foodReceipt+drinkReceipt;
		this.foodReceipt = foodReceipt;
		this.drinkReceipt = drinkReceipt;
		if (this.drinkReceipt>this.foodReceipt){
			this.taxDue += this.totalRec*0.03;
		}
		this.taxDue += this.drinkReceipt*0.08;
	}

	public void print() {
		System.out.println(String.format("Resaurant %d Week %d:\n\tTotal Receipts: $%.2f\n\t\tFood Receipts: $%.2f\n\t\tDrink Receipts: $%.2f\n\tTaxes Due: $%.2f\n",this.busNum,this.week,this.totalRec,this.foodReceipt,this.drinkReceipt,this.taxDue));

	}
	
}

class Hotels extends Business {
	public int occ;
	public int week=0;

	public Hotels(int businessNum) {
		super(businessNum);
	}
	
	public void setReceipt(double totalReceipt, int occ){
		this.week += 1;
		this.totalRec = totalReceipt;
		this.occ = occ;
		this.taxDue = 0;
		if (this.occ>90){
			this.taxDue += this.totalRec*0.02;
		}
		this.taxDue += this.totalRec*0.06;
	}
	
	public void print() {
		System.out.println(String.format("Hotel %d Week %d:\n\tTotal Receipts: $%.2f\n\t\tOccupancy: %d%%\n\tTaxes Due: $%.2f\n",this.busNum,this.week,this.totalRec,this.occ,this.taxDue));
	}
	
}

class ConvStore extends Business {
	public double newsReceipt;
	public double otherReceipt;
	public int week=0;
	
	public ConvStore(int businessNum) {
		super(businessNum);
	}
	
	public void setReceipt(double newsReceipt, double otherReceipt){
		this.week += 1;
		this.totalRec = newsReceipt + otherReceipt;
		this.newsReceipt = newsReceipt;
		this.otherReceipt = otherReceipt;
		this.taxDue = this.otherReceipt * 0.07;
	}

	public void print() {
		System.out.println(String.format("Convience Store %d Week %d:\n\tTotal Receipts: $%.2f\n\t\tNewspaper Receipts: $%.2f\n\t\tOther Receipts: $%.2f\n\tTaxes Due: $%.2f\n",this.busNum,this.week,this.totalRec,this.newsReceipt,this.otherReceipt,this.taxDue));
	}
	
}
