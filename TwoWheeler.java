package week1.day2;

public class TwoWheeler {

	int noOfWheels=2;
	short noOfMirrors=2;
	long chasisNumber = 12345678901L;
	boolean isPunctured = true;
	String bikeName = "Pulsar 150";
	double runningKM = 44.50;
	
	public static void main(String[] args) {
		
		TwoWheeler obj = new TwoWheeler();
		int noOfWheels2 = obj.noOfWheels;
		System.out.println(noOfWheels2);
		short noOfMirrors2 = obj.noOfMirrors;
		System.out.println(noOfMirrors2);
		long chasisNumber2 = obj.chasisNumber;
		System.out.println(chasisNumber2);
		boolean isPunctured2 = obj.isPunctured;
		System.out.println(isPunctured2);
		String bikeName2 = obj.bikeName;
		System.out.println(bikeName2);
		double runningKM2 = obj.runningKM;
		System.out.println(runningKM2);
		
	}
	
	
}

