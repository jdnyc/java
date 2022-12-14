package Ch4;


public class Array15 {
	//배열
	public static void main(String[] args) {
		//String 배열 예제
		String[] names = {"Kim", "Park", "Yi"}; //선언과 초기화
		
		//names 배열 요소 출력
		for (int i = 0; i < names.length; i++) 
			System.out.println("names["+i+"]:"+names[i]);
			
		String tmp = names[2]; //배열 세번째 요소 tmp에 저장
		
		System.out.println("tmp:" + tmp);
		
		names[0] = "Yu"; //배열의 첫번째 요소 Yu로 변경
		
		for(String str : names) //향상된 for문
			System.out.println(str);
	}

}
