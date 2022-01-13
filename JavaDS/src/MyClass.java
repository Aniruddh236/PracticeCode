import java.util.Scanner;

class TravelAgencies {

	private  int regNo;
	private String agencyName;
	private String packageType;
	private int price;
	private boolean flightFacility;

TravelAgencies(int regNo,String agencyName,String packageType,int price,boolean flightFacility){

this.regNo = regNo;
this.agencyName = agencyName;
this.packageType = packageType;
this.price = price;
this.flightFacility = flightFacility;}

public void setRegNo(int regNo){this.regNo = regNo; }
public int getRegNo(){return this.regNo;}

public void setAgencyName(String agencyName){this.agencyName = agencyName; return;}
public String getAgencyName(){return this.agencyName;}

public void setPackageType(String packageType){this.packageType = packageType; return;}
public String getPackageType(){return this.packageType;}

public void setPrice(int price){this.price = price; return;}
public int getPrice(){return this.price;}

public void setFlightFacility(boolean flightFacility){this.flightFacility = flightFacility; return;}
public boolean getFlightFacility(){return this.flightFacility;}

}// class 1

class MyClass {

	public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
		TravelAgencies[] agency = new TravelAgencies[4];
		for (int i = 0; i < 4; i++) {

			int regNo = sc.nextInt();
			sc.next();
			String agencyName = sc.next();
			String packageType = sc.next();
			int price = sc.nextInt();
			boolean flightFacility = sc.nextBoolean();
			TravelAgencies ta = new TravelAgencies(regNo, agencyName, packageType, price, flightFacility);
			agency[i] = ta;

		}

		System.out.println("Highest Package ---> " + findAgencyWithHighestPackagePrice());
		int regNo = sc.nextInt();
		String packageType = sc.next();

		TravelAgencies ta = agencyDetailsForGivenIdAndGivenType(regNo, packageType);

		if (ta == null)
			System.out.println("No agency found with this details");
		else {

			System.out.println(ta.getRegNo());
			System.out.println(ta.getAgencyName());
			System.out.println(ta.getPackageType());
			System.out.println(ta.getPrice());
			System.out.println(ta.getFlightFacility());

		}

	}// main

	static int findAgencyWithHighestPackagePrice(TravelAgencies[] travel) {

		int max = 0;
		for (TravelAgencies ta : travel) {

			if (ta.getPrice() > max)
				max = ta.getPrice();
		}

		return max;
	}

	static TravelAgencies agencyDetailsForGivenIdAndGivenType(TravelAgencies[] travel, int regNo, String packageType) {
		TravelAgencies ta ;
		for (TravelAgencies i : travel) {
			if (i.getFlightFacility()) {
				if (i.getRegNo() == regNo && i.getPackageType().equals(packageType)) {
					ta = i;
					return ta;
				}
			}

		}

		return null;
	}

}// class2