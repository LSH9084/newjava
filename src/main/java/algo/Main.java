package algo;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main q3 = new Main(1999);
		q3.leapYears();
		if(leapYearBoolean) {
			System.out.println("1");
		} else { System.out.println("0");}   
    }
    
    static int leapYear ;
	static boolean leapYearBoolean = false;
	
	public Main(int leapYear) {
		this.leapYear = leapYear;
	}
	
	public void leapYears () {
		if(leapYear ==0) return;
		if((leapYear%4==0)&&((leapYear%100 !=0)||(leapYear%400==0))) {
			leapYearBoolean = true;
		}
	}
	Scanner sc = new Scanner(System.in);
    
}
