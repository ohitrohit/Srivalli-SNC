package basics;

import java.util.Scanner;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;





public class Lounchchromebrower1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter brower to be launched:");
	    String brower =sc.next();
	    
		switch(brower){
	     case"Chrome": ChromeDriver driver = new ChromeDriver();break;
	     case"Edge":   EdgeDriver driver1 = new EdgeDriver();break;
	     default:System.out.println("enter brower name");break;
	}

}
}
