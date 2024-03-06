package week1.day2;

public class Browser {
	public String launchBrowser(String browserName) {
		return browserName + "Browsername launched successfully";

	}
	public void loadUrl() {
		System.out.println(" Application URL loaded successfully");
			

	}
	

	public static void main(String[] args) {
		
		Browser bn = new Browser();
		String data = bn.launchBrowser("Edge ");
		System.out.println(data);
		bn.loadUrl();
		
		
	}

}
