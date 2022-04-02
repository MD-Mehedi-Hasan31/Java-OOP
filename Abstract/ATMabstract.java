package com.pondit.Abstract;

public abstract class ATMabstract {
	
	
	 private int amount;
	
	public String getBank(int getBankName) {
		
		
		if(getBankName==1) {
			
			return "Datch Bangla Bank limited";
		}
		else if(getBankName==2) {
			
			return "South East Bank Limited";
		}
		else if(getBankName==3) {
			
			return "NRB Bank Limited";
		}
		else {
			
			return "No Bank Account Yet";
		}
	}
	
	protected void setAmount(int amount) {
		
		this.amount=amount;
		
	}
	
	
	abstract void performPayment();

}
