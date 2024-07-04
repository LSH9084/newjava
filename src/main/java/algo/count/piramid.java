package algo.count;

public class piramid {
	public static void main(String[] args) {
		
		int a =4;
		for(int i=0; i<9; i++) {
			for(int j =0; j<9; j++) {
				if(j==a&&i==0) {
					System.out.print("*");
				} else if(i==0&&j!=a){
					System.out.print(" ");
				}
				if(i!=0) {
					if(j<(a-i)) {
						System.out.print(" ");
					} else if(j<=(a+i)) {
						System.out.print("*");
					} else if(j<9) {
						System.out.print(" ");
					}
				}
			}
			if(i>=4) {
				return;
			}
			System.out.println();
			
		
	}
}}
