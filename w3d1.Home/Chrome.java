package week3.day1;

public class Chrome extends Browser {

	public void openIncognito() {
		System.out.println("Print Chrome extends Browser");
	}

	public void clearCache() {
		System.out.println("Print this clear cache");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chrome c = new Chrome();
		c.clearCache();
		c.closerBrowser();
		c.navigateBack();
		c.openIncognito();
		c.openURL();



	}

}
