package t3_제어문;

import java.util.Scanner;
//2번 : 두개의 수를 각각 입력받아서 두개의 수중, 큰수와 작은수를 각각 출력해 주시오.

public class Test6_homework2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su1 = 0;
		String res1 = "";
		
		System.out.print("1번 숫자를 입력하세요!");
		su1 = sc.nextInt();
		
		int su2 = 0;
		String res2 = "";
		
		System.out.print("2번 숫자를 입력하세요!");
		su2 = sc.nextInt();
		
		if (su1 > su2) {
			res1 = "큰수는"+su1+"이고 작은수는" +su2+ " 입니다.";
			
		}
		else if (su2 > su1)  {
			res2 = "큰수는"+su2+"이고 작은수는" +su1+ " 입니다.";
			
		} 

		System.out.println("그러므로" +res1+ "  " +res2+" ");
		
		sc.close();		
	}

}
