
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
	
	public abstract String print();
	
	public class Restaurants extends Business {

		public Restaurants(int businessNum, double totalReceipt, double taxesDue) {
			super(businessNum, taxesDue);
		}

		public String print() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	public class Hotels extends Business {

		public Hotels(int businessNum, double totalReceipt, double taxesDue) {
			super(businessNum, totalReceipt);
		}

		public String print() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	public class ConvStore extends Business {

		public ConvStore(int businessNum, double totalReceipt, double taxesDue) {
			super(businessNum, totalReceipt);
		}

		public String print() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}
