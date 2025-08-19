package week3.day1;

public class Browser {

	public void openURL() {
		System.out.println("Open the URL");

	}

	public void closerBrowser() {
		System.out.println("Close the Browser");

	}

	public void navigateBack() {
		System.out.println("Go back to screen");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browserName = "Chrome Google";
		String browserVersion = "Q10";

		Browser b= new Browser();
		b.openURL();


	}


}
