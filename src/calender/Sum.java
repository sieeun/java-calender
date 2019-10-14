package calender;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		//입력 : 두 수의 입력을 받는다.
		//출력 : 화면에 두  수의 출력을 받는다.
		int a, b;
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		s1 = sc.next();
		s2 = sc.next();
		System.out.println(s1 + ", " + s2);
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.println(a + ", " + b);
		
		int c = a+b;
		System.out.printf("두 수의 합은 %d입니다.", c);
		
		sc.close();	//열었던 아이는 꼭 클로징을 해줘야 한다.
	}
}
