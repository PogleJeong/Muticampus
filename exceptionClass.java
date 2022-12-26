package exception;
import java.io.*; // File object 호출

public class exceptionClass {
	public static void main(String args[]) {
		
		// NULLPointerException
		String str = null;
		try {
			System.out.println(str.length());
		} catch (Exception error){
			System.out.println("string 이 null 입니다.");
		}
		
		// ArrayIndexOutOfBoundsException
		int arr[] = { 1, 2, 3 };
		
		try {
			arr[100] = 2;
		} catch (Exception error){
			System.out.println("배열범위초과");
		}
		
		// FileNotFoundException
		File f = new File("d:\\xxx");
		FileInputStream is;
		try {
			arr[100] = 2;
		} catch (Exception error){
			System.out.println("파일을 찾을 수 없습니다.");
		}
		
		// StringIndexOutOfBoundsException
		String str2 = "java";
		try {
			str2.charAt(100);
		} catch (Exception error){
			System.out.println("String 공간을 벗어난 영역입니다.");
		}
		
		// NumberFormatException
		try {
			int i = Integer.parseInt("123");
		} catch (Exception error) {
			System.out.println("숫자가 아닌 글자가 있습니다.");
		}
	}
}
