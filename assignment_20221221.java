package main;

import java.util.Scanner;

public class assignment_20221221 {

	public static void main(String[] args) {
		
		// 1번과제
		int numSum=0;
		for (int num=1; num <= 1000; num++) {
			numSum = num + numSum;
		}
		System.out.printf("1부터 1000사이 수의 합은 %d\n",numSum);
		
		// 2번과제
		Scanner sc = new Scanner(System.in);
		System.out.print(">> ");
		
		while (true) {
			int inputNum = sc.nextInt();
			
			if (inputNum < 0 || inputNum >= 100) {
				System.out.println("올바른 범위를 다시 입력해주세요");
				continue;
			}
			System.out.printf("입력한 수는 %d보다 크고 %d보다 작다.\n", inputNum/10 * 10, (inputNum/10 + 1) * 10);
			break;
		}
		
		//3번과제
		for (int i=0; i<=8; i++) {
			System.out.println("*".repeat(5));
		}
		
		//4q번과제
		for (int a=1; a<=5; a++) {
			System.out.print("*".repeat(a));
			for (int b=5; b>=0; b--) {
				System.out.print(" ".repeat(b));
			}
			System.out.println();
		}
		
		for (int c=4; c>=1; c--) {
			System.out.print("*".repeat(c));
			for (int d=1; d<=5; d++) {
				System.out.print(" ".repeat(d));
			}
			System.out.println();
		}
		
		//5번과제
		for (int i=1; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
		}
		
		//6번과제
		System.out.print("구구단 몇 단? >> ");
		int i = sc.nextInt();
		
		for (int j=1; j<=9; j++) {
			System.out.printf("%d * %d = %d\n", i, j, i*j);
		}
		
		
		//7번과제
		int oddNum = 0;
		int evenNum = 0;
		for (int num = 1; num <= 100; num++) {
			if (num % 2 == 0) {
				evenNum += num;
			}
			else {
				oddNum += num;
			}
		}
		System.out.printf("1부터 100사이 짝수의 합은: %d\n",evenNum);
		System.out.printf("1부터 100사이 홀수의 합은: %d\n",oddNum);
		
		// 보너스 과제
		
		System.out.println("[ 10진수 변환기 ]");
		int decNum = sc.nextInt();
		System.out.println("2진수 >> "+ Integer.toBinaryString(decNum));
		System.out.println("8진수 >> "+ Integer.toOctalString(decNum));
		System.out.println("16진수 >> "+ Integer.toHexString(decNum));
		
		System.out.println("[ 2진수 변환기 ]");
		String binNum = sc.next();
		System.out.println("2진수 >> "+Integer.valueOf(binNum,2));

		System.out.println("[ 8진수 변환기 ]");
		String octNum = sc.next();
		System.out.println("8진수 >> "+Integer.valueOf(octNum,8));
		
		System.out.println("[ 16진수 변환기 ]");
		String hexNum = sc.next();
		System.out.println("16진수 >> "+ Integer.valueOf(hexNum,16));
		sc.close();
	}

}
