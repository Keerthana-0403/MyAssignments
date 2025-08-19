package week3.day2;

public class Amazon extends CanaraBank{

	@Override
	public void recordPaymentDetails() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		Amazon a= new Amazon();
		a.cashOnDelivery();
		a.internetBanking();
		a.upiPayments();
		a.cardPayments();
		a.recordPaymentDetails();
	}

}
