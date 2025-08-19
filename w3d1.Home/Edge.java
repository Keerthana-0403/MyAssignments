package week3.day1;

public class Edge extends Browser {


	public void takeSnap() {
		System.out.println("Multilevel Inheritance");
	}

	public void clearCookies() {
		System.out.println("Edge cookies cleared");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edge e = new Edge();
		e.clearCookies();
		e.closerBrowser();
		e.navigateBack();
		e.openURL();



	}

}
