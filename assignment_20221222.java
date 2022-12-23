package function;

import java.util.Arrays;
import java.util.Random;

public class assignment_20221222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 과제1
		System.out.println(EucildeanDistance(1,1,2,2));
		
		// 과제2
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(Arrays.toString(result));
	
		// 과제3
		int[] data = {3,2,9,4,7};
		System.out.println(Arrays.toString(data));
		System.out.println("최대값: "+max(data));
		
		//과제4
		String str = "123";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
		str = "1234o";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
		
		//과제5
		int num1[] = {1,2,3,4,5};
		getDouble(num1);
		
		//과제6
		int num6 =34;
		int num6_2 = 4;
		int result6;

		result6 = getResult(num6,num6_2);
		System.out.printf("\n몫: %d, 나머지: %d", result6);
		
	}
	//과제 1
	static double EucildeanDistance(double x, double y, double x2, double y2) {
		double eucildean = Math.sqrt(Math.pow(x-x2,2)+Math.pow(y-y2, 2));
		eucildean = Math.round(eucildean);
		return eucildean;
	}
	

	//과제2
	static int[] shuffle(int[] array) {
		 int arrLength = array.length; //9
		 
		 Random rd = new Random();
		 for (int i=arrLength-1; 0<i; i--) { //1회차: i=8
			 //swap 할 대상을
			 int pickElement = rd.nextInt(i+1); //1회차 : 바꿀 index 0,1,2,3,4,5,6,7,8중 하나 선택 해서 index 8과 바꾸기
			 
			 //swap
			 int temp = array[i];
			 array[i] = array[pickElement];
			 array[pickElement] = temp;
		 }
		 return array;
	}
	
	//과제3
	static int max(int[] arr) {
		int maxNum = arr[0];
		if (arr==null || arr.length == 0) {
			return -999999;
		}
		for (int arrElement: arr) {
			if (maxNum < arrElement) {
				maxNum = arrElement;
			}
		}
		return maxNum;
	}
	
	//과제4
	
	static boolean isNumber(String str) {
		int charASCI=0;
		for (int i=0; i<str.length();i++) {
			 charASCI = str.charAt(i)-48;
			 if (charASCI <=0 || charASCI>10) {
				 return false;
			 }
		}
		return true;
	}
	
	//과제5
	static void getDouble (int[] numArr) {
		for (int i=0; i<numArr.length; i++) {
			numArr[i] = numArr[i]*2;
		}
		System.out.println(Arrays.toString(numArr));
	}
	
	//과제6
	static int getResult(int num1, int num2) {
		int quotient = num1/num2;
		int remainder = num1%num2;

		return quotient;
	}
}
