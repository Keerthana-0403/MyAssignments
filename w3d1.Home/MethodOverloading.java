package week3.day1;

public class MethodOverloading {

	public void reportStep(String msg, String status) {
		System.out.println(msg);
		System.out.println(status);
	}


	public void reportStep(String msg, String status, boolean snap) {
		System.out.println(msg);
		System.out.println(status);
		System.out.println(snap);
	}

	public static void main(String[] args) {
		MethodOverloading over= new MethodOverloading();
		over.reportStep("status", "true");
		over.reportStep("snap","false");

	}

}
