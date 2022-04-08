package week3.day2;

public class Automation extends MultipleLanguage implements Language, TestTool {
	public static void main(String[] args) {
		Automation automate = new Automation();
		automate.java();
		automate.Selenium();
		automate.python();
		automate.ruby();
		
	}
	
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}
	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby");
	}

}
