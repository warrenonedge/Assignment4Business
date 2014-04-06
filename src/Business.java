
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
		System.out.println("Restaurant "+ String.valueOf(this.busNum)+" Week "+String.valueOf(this.week)+":\n\tTotal Receipts: $"+String.valueOf(this.totalRec)+"\n\t\tFood Receipts: $"+String.valueOf(this.foodReceipt)+"\n\t\tDrink Receipts: $"+String.valueOf(this.drinkReceipt)+"\n\tTaxes Due: $"+String.valueOf(this.taxDue)+"\n");
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
		System.out.println("Hotel "+ String.valueOf(this.busNum)+" Week "+String.valueOf(this.week)+":\n\tTotal Receipts: $"+String.valueOf(this.totalRec)+"\n\tOccupancy: "+String.valueOf(this.occ)+"\n\tTaxes Due: $"+String.valueOf(this.taxDue)+"\n");
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
		System.out.println("Convience Store "+ String.valueOf(this.busNum)+" Week "+String.valueOf(this.week)+":\n\tTotal Receipts: $"+String.valueOf(this.totalRec)+"\n\t\tNewspaper Receipts: $"+String.valueOf(this.newsReceipt)+"\n\t\tOther Receipts: $"+String.valueOf(this.otherReceipt)+"\n\tTaxes Due: $"+String.valueOf(this.taxDue)+"\n");
	}
	
}
