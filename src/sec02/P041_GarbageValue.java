package sec02;

public class P041_GarbageValue {

	public static void main(String[] args) {

		byte var1 = 125;
		int var2 = 125;
		
		//반복문 처리
		for(int i=0; i<5; i++) {
			var1++;
			var2++;
			System.out.println("var1 : " + var1);
			System.out.println("var2 : " + var2);
			
		// byte 변수 127을 넘어가는 순간 최소값인 -128로 돌아감
		}
	}

}
