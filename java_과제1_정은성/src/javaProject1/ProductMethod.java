package javaProject1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductMethod {
	private List<Product> prdList = new ArrayList<Product>();
	private int prdNo;
	
	
	Scanner scanner = new Scanner(System.in);
	public ProductMethod() {
		prdNo = 3; // 초기 세개 제품 이후로 추가하면 상품번호가 4부터 시작되어 들어감
		Product initProduct1 = new Product(1,"노트북",1200000,2021,"삼성");
		Product initProduct2 = new Product(2,"모니터",300000,2021,"LG");
		Product initProduct3 = new Product(3,"마우스",30000,2020,"로지텍");
		prdList.add(initProduct1);
		prdList.add(initProduct2);
		prdList.add(initProduct3);
	}
	public void insert() {
		String prdName = null;
		int prdPrice = 0;
		int prdYear = 0;
		String prdMaker = null;
		
		System.out.print("상품명 >>");
		prdName = scanner.next();
		while (true) {
			try {
				System.out.print("가격 >>");
				prdPrice = scanner.nextInt();
				break;
			} catch(Exception e) {
				scanner.nextLine();
				System.out.println("다시 입력해주세요");
			}
		}
		while (true) {
			try {
				System.out.print("연도 >>");
				prdYear = scanner.nextInt();
				break;
			} catch(Exception e) {
				scanner.nextLine();
				System.out.println("다시 입력해주세요");
			}
		}
		System.out.print("제조사 >>");
		prdMaker = scanner.next();
		
		prdNo = prdNo + 1;
		Product product = new Product(prdNo, prdName, prdPrice, prdYear, prdMaker);
		
		prdList.add(product);
	}
	
	public void delete() {
		int deleteIndex = 0;
		int prdYear = 0;
		
		System.out.println("삭제하실 상품번호를 입력해주세요");
		while (true) {
			
			try {
				System.out.print("상품번호 >>");
				deleteIndex = scanner.nextInt(); 
				break;
			} catch(Exception e) {
				scanner.nextLine();
				e.printStackTrace();;
				System.out.println("다시 입력해주세요");
			}
		}
		deleteIndex = search(deleteIndex);
		
		if (deleteIndex == -1) {
			System.out.println("해당 번호의 상품을 찾을 수 없습니다");
			return;
		}
		
		
		prdList.remove(deleteIndex);
		prdNo = prdNo - 1;
		
		// 중간에 상품이 삭제되면 이후 상품들의 상품번호가 당겨짐
		for(int i=deleteIndex; i < prdList.size(); i++) {
			Product product = prdList.get(i);
			product.setPrdNo(product.getPrdNo()-1); // private No를 수정
		}
	}
	
	public int search(int index) {
		int found = -1;
		for(int i=0; i<prdList.size(); i++) {
			Product product = prdList.get(i);
			if(product.getPrdNo() == index) {
				found = i;
			}
		}
		return found;
	}
	
	public void printAll() {
		if (prdList.size() == 0) {
			System.out.println("\n\n");
			System.out.println("데이터가 존재하지 않습니다.");
			System.out.println("\n\n");
			return;
		}
		System.out.println("\n\n");
		System.out.println("=".repeat(60));
		System.out.println("상품번호\t상품명\t가격\t연도\t제조사");
		System.out.println("=".repeat(60));
		for (Product product : prdList) {
			System.out.print(product.toString());
		}
		System.out.println("=".repeat(60));
		System.out.println("\n\n");
	}
}
