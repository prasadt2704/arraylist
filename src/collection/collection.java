package collection;

import java.util.Date;
import java.util.Scanner;

public class collection {

	public String country;
	public String denomination;
	public int yearOfMinting;
	public int currVal;
	public Date acqDate;


	
	
	
	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getDenomination() {
		return denomination;
	}


	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}


	public int getYearOfMinting() {
		return yearOfMinting;
	}


	public void setYearOfMinting(int yearOfMinting) {
		this.yearOfMinting = yearOfMinting;
	}


	public int getCurrVal() {
		return currVal;
	}


	public void setCurrVal(int currVal) {
		this.currVal = currVal;
	}


	public Date getAcqDate() {
		return acqDate;
	}


	public void setAcqDate(Date acqDate) {
		this.acqDate = acqDate;
	}


	public collection()
	{
		
	}
	
	
	
	
	public collection(String country, String denomination, int yearOfMinting, int currVal, Date acqDate) {
		super();
		this.country = country;
		this.denomination = denomination;
		this.yearOfMinting = yearOfMinting;
		this.currVal = currVal;
		this.acqDate = acqDate;
	}


	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Country:");
		this.country=sc.next();
		System.out.println("Enter Denomination:");
		this.denomination=sc.next();
		System.out.println("Enter year of minting:");
		this.yearOfMinting=sc.nextInt();
		System.out.println("Enter current values:");
		this.currVal=sc.nextInt();
		this.acqDate=new Date();
				
	}
	
	public void display()
	{
		System.out.println("Country:"+this.country);
		System.out.println("Denomination:"+this.denomination);
		System.out.println(" year of minting:"+this.yearOfMinting);
		System.out.println("current values:"+this.currVal);
		System.out.println("Date:"+this.acqDate);
	}
	
}
