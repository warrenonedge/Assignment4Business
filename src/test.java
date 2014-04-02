
public class test {

	public static void main(String[] args) {
		Restaurants Moe = new Restaurants(1);
		Restaurants Joe = new Restaurants(2);
		Moe.setReceipt(14000, 9000);
		Moe.print();
		Moe.setReceipt(12500,12500);
		Moe.print();
		Joe.setReceipt(4000, 3500);
		Joe.print();
		Joe.setReceipt(2500, 3500);
		Joe.print();
		Hotels Ritz = new Hotels(3);
		Ritz.setReceipt(25000, 98);
		Ritz.print();
		Ritz.setReceipt(21500, 88);
		Hotels NotelHotel = new Hotels(4);
		NotelHotel.setReceipt(5500, 93);
		NotelHotel.print();
		NotelHotel.setReceipt(6575, 98);
		NotelHotel.print();
		ConvStore six12 = new ConvStore(612);
		six12.setReceipt(2400, 6000);
		six12.print();
		six12.setReceipt(1700, 5927);
		six12.print();
	}

}
