package ex03;

import java.util.Scanner;
/*
 * string 5
 * 
 * stringstringstringstringstring
 */
public class Ex01 {
	
	public static void main(String[] args) {
		//참조 변수 선언
		Scanner scan = new Scanner(System.in);
		
//		문자열 입력 출력해라
//		System.out.println("문자열 입력");
		
//		입력 받아라...next 함수는 빈공백 String 5
//		String str = scan.next();
		
//		System.out.println("반복횟수 입력");
//		int n = scan.nextInt();
		
//		System.out.println("str ="+str);
//		System.out.println("n = "+n);
		
		for (int i = 0; i< 5 ; i = i+1) {
			System.out.print(i);
			System.out.println("일로 옵니다.");
		}
		
}
}