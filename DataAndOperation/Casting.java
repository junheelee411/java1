
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		System.out.println(a);
		System.out.println(b);
		
		//int c=1.1; -> 손실 일어나서 컴파일 불가
		
		double d =1.1;
		int e =(int)1.1; //명시적으로 변환
		System.out.println(d);
		System.out.println(e);
		
		String f= Integer.toString(1); //정수->문자열
		System.out.println(f.getClass()); //x.getClass 타입 반환
		
	}
}
