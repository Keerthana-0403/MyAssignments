package week3.day1;

public class Safari extends Chrome {

	public void readermode() {
		System.out.println("Safari extends chrome");
	}

	public void fullscreenmode() {
		System.out.println("Print safari");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Safari s = new Safari();
		s.clearCache();
		s.openIncognito();
		s.fullscreenmode();
		s.readermode();

	}

}
