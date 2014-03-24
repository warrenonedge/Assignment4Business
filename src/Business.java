
public abstract class Business {
	public int busNum;
	public double totalRec;
	public double taxDue;
	
	public Business(int businessNum, double totalReceipt, double taxesDue){
	busNum = businessNum;
	totalRec = totalReceipt;
	taxDue = taxesDue;
	}
	
	public class Restaurants extends Business {

		public Restaurants(int businessNum, double totalReceipt, double taxesDue) {
			super(businessNum, totalReceipt, taxesDue);
		}
		
	}
	public class Hotels extends Business {

		public Hotels(int businessNum, double totalReceipt, double taxesDue) {
			super(businessNum, totalReceipt, taxesDue);
		}
		
	}
	public class ConvStore extends Business {

		public ConvStore(int businessNum, double totalReceipt, double taxesDue) {
			super(businessNum, totalReceipt, taxesDue);
		}
		
	}
}
