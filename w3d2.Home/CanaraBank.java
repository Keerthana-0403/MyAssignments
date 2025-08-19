package week3.day2;

public abstract class CanaraBank implements Payment {

	public abstract void recordPaymentDetails();

	public void cashOnDelivery() {
		System.out.println("cash on delivery");

	}

	public void upiPayments() {
		System.out.println("upi payment");

	}

	public void cardPayments() {
		System.out.println("cad payment");

	}

	public void internetBanking() {
		System.out.println("internet banking");

	}

}

