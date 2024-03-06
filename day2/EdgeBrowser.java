package week1.day2;

public class EdgeBrowser {
	public static void main(String[] args) {
		
		Browser bn = new Browser();
		String data = bn.launchBrowser("Opera ");
		System.out.println( data );
		bn.loadUrl();
		
	}

}
