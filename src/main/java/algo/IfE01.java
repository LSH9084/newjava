package algo;

public class IfE01 {
	public static void main(String[] args) {
//		1번
		int a =1; int b=2;
		if(a<b) System.out.println("<");
		
//		2번
		int c = 0;
		c=100;
		if(c<60) System.out.println("F");
		if(c>=60 && c<70) System.out.println("D");
		if(c>=70 && c<80) System.out.println("C");
		if(c>=80 && c<90) System.out.println("B");
		if(c>=90 && c<=100) System.out.println("A");
		
//		3번
		IfE01 q3 = new IfE01(2012);
		q3.leapYears();
		if(leapYearBoolean) {
			System.out.println("윤년입니다.");
		} else { System.out.println("윤년이 아닙니다.");}
		
//		4번
		IfE01 q4 = new IfE01(1, -1);
		q4.quedrant();
		
//		5번
		IfE01 q5 = new IfE01(23,25);
		q5.clock();
		
//		6번
		IfE01 q6 = new IfE01(11, 24);
		q6.oven();
		System.out.println("남은 분 : "+q6.c);	
		
//		7번
		IfE01 q7 = new IfE01();
		q7.game();
		
		
		
	}
	static int leapYear ;
	static boolean leapYearBoolean = false;
	
	public IfE01(int leapYear) {
		this.leapYear = leapYear;
	}
	
	public void leapYears () {
		if(leapYear ==0) return;
		if((leapYear%4==0)&&((leapYear%100 !=0)||(leapYear%400==0))) {
			leapYearBoolean = true;
		}
	}
	
	int x;
	int y;
	int c;
	
	public IfE01(int x, int y) {
		this.x = x;
		this.y = y;
		this.c = (int)(Math.random()*1000);
	}
	
	public void quedrant() {
		if(x==0 || x>1000 || x<-1000) return;
		if(y==0 || y>1000 || y<-1000) return;
		
		if(x>0 && y>0) {
			System.out.println("1");
		}
		if(x>0 && y<0) {
			System.out.println("2");
		}
		if(x<0 && y<0) {
			System.out.println("3");
		}
		if(x<0 && y>0) {
			System.out.println("4");
		}
	}
	
	public void clock() {
		if(x<0 || x>23) return;
		if(y<0 || y>59) return;
		System.out.println("원래의 알람시간: "+x+":"+y);
		if(y>=45) {
			System.out.println("수정된 알람시간: "+x+":"+(y-45));
		} else {
			System.out.println("수정된 알람시간: "+(x-1)+":"+(y+15));
		}
	}
	
	
	public void oven () {
		if(x<0 || x>23) return;
		if(y<0 || y>59) return;
		
		int d = (c%60);
		int e = (c/60);
		System.out.println("현재 시간 : "+x+" "+y);
		
		if(x+e>23 && d+y<60) {
			System.out.println("종료 시간 : "+(x-(24-e))+" "+(y+d));
			
		}
		if(x+e>23 && d+y>=60){
			System.out.println("종료 시간 : "+(x-(24-e)+1)+" "+(y+(60-d)));
		}
		if(x+e<=23 && d+y<60) {
			System.out.println("종료 시간 : "+(x+e)+" "+(y+d));
		}
		if(x+e<=23 && d+y>=60) {
			System.out.println("종료 시간 : "+x+" "+(y+d));
		}
	}
	
	boolean threeOk =false;
	boolean twoOk =false;
	boolean oneOk = false;
	int x1;
	int x2;
	int x3;
	
	public IfE01() {
		x1 = (int)(Math.random()*6+1);
		x2 = (int)(Math.random()*6+1);
		x3 = (int)(Math.random()*6+1);
		
		if(x1 != x2 && x1 !=x3 && x2 != x3) {
			this.oneOk = true;
			this.x1 = x1;
			this.x2 = x2;
			this.x3 = x3;
		}
		
		if((x1 == x2 && x1 !=x3) || (x2 == x3 && x2 != x1) || (x1 ==x3 && x1 != x2)) {
			this.twoOk = true;
			this.x1 = x1;
			this.x2 = x2;
			this.x3 = x3;
		}
		
		if((x1 == x2) && (x1 == x3) && (x2 == x3)) {
			this.threeOk = true;
			this.x1 = x1;
			this.x2 = x2;
			this.x3 = x3;
		}	
	}
	
	public void game () {
		if(threeOk) {
			System.out.println("모두 같음");
			System.out.println("총 상금 : "+(10000+x1*1000));
		}
		
		if(twoOk) {
			System.out.println("2개 같음");
			if((x1==x2)||(x1==x3)) {
				System.out.println("총 상금 : "+(10000+(x1*100)));
			}
			if(x2==x3) {
				System.out.println("총 상금 : "+(10000+(x2*100)));
			}
		}
		if(oneOk) {
			System.out.println("다 다름");
			if((x1>x2)&&(x1>x3)) {
				System.out.println("총 상금 : "+(x1*100));
			}
			if((x2>x1)&&(x2>x3)) {
				System.out.println("총 상금 : "+(x2*100));
			}
			if((x3>x2)&&(x3>x1)) {
				System.out.println("총 상금 : "+(x3*100));
			}
		}
	}
	
	
}
