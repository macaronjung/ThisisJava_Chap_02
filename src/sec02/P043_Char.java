package sec02;

public class P043_Char {

	public static void main(String[] args) {
		
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		int uniCode = c1; //유니코드 얻기
		System.out.println(uniCode);
		
		//char 타입 참고사항
		//char a = ''; //컴파일 에러 발생
		//char b = ' '; //공백(유니코드:32) 저장 가능
		//String s = ""; //빈 문자열 저장 가능
	}

}
