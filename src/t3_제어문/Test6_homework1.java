package t3_제어문;

import java.util.Scanner;
//1번 : 수를 입력받아서 홀수 인지 짝수인지를 판별하시오.
public class Test6_homework1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su = 0;
		String res = "";
		
		System.out.print("숫자를 입력하세요!");
		su = sc.nextInt();
		
		if ((su % 2) >=1) {
			res = "홀수";
			
		}
		else  {
			res = "짝수";
			
		} 

		System.out.println("숫자는 "+su+" 는 "+res+" 입니다.");
		
		sc.close();
	}

}
