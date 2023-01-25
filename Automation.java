package week4.day1;
//Abstraction
public class Automation extends MultipleLangauge implements Language,TestTool{

	
	@Override
	public void ruby() {
		System.out.println("2nd Multiple language used is ruby");
		
	}

	public void selenium() {
		System.out.println("The tool used is Selenium");
		
	}

	public void java() {
		System.out.println("The language used is java");
		
	}

public static void main(String[] args) {
     Automation a=new Automation();
     a.java();
     a.selenium();
     a.python();
     a.ruby();
    		 

	}



}
