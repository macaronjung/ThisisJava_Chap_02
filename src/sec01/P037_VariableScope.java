package sec01;

public class P037_VariableScope {

	public static void main(String[] args) {
		
		int v1 = 15;
		
		if(v1>10) {
			int v2 = v1 - 10;
		}
		
		//v2는 if문 안에서의 지역변수이기 때문에 if 밖에서 사용불가
		//int v3 = v1 + v2 + 5;
	}

}
