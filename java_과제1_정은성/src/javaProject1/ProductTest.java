package javaProject1;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ProductMethod prdMS = new ProductMethod();
		while (true) {
			System.out.println("=".repeat(60));
			System.out.println("상품 관리 프로그램입니다. 원하시는 옵션을 선택해주세요.");
			System.out.println("1. 데이터 전체 확인");
			System.out.println("2. 데이터 삽입");
			System.out.println("3. 데이터 삭제");
			System.out.println("=".repeat(60));
			System.out.print("옵션 선택 >> ");
			int opt = scanner.nextInt();
			
			switch (opt) {
			case 1:
				prdMS.printAll();
				break;
			case 2:
				prdMS.insert();
				break;
			case 3:
				prdMS.delete();
				break;
			default:
				System.out.println("다시 입력해주세요~~");
			}	
		}
	}
}