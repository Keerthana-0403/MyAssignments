package week3.day1;

public class MethodOverRiding extends MethodOverloading{
	public void reportStep(String msg, String status) {
		System.out.println(msg);
		System.out.println(status);
	}

	public static void main(String[] args) {
		MethodOverRiding over= new MethodOverRiding();
		over.reportStep("status", "true");

	}

}
