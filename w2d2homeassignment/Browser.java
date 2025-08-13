package w2d2homeassignment;

public class Browser {

	public void launchBrowser(String browserName) {
		// TODO Auto-generated method stub
		System.out.println(browserName + "browser launched successfully");

	}
	public String loadUrl() {
		String url= "browser launched successfully";
		return url;
	}
	public static void main(String[] args) {
		Browser b = new Browser();
		b.launchBrowser("Chrome");
		b.loadUrl();
	}

}
