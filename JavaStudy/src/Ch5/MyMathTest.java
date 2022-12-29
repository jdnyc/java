package Ch5;

//°´Ã¼ÁöÇâ ÇÁ·Î±×·¡¹Ö
class MyMathTest {
	public static void main(String args[]) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L); //double ´ë½Å Long°ªÀ¸·Î È£Ãâ => ÀÚµ¿Çüº¯È¯
		
		System.out.println("add(5L, 3L) = "+result1);
		System.out.println("subtract(5L, 3L) = "+result2);
		System.out.println("multiply(5L, 3L) = "+result3);
		System.out.println("divde(5L, 3L) = "+result4);
	}
}

class MyMath{
	//µ¡¼À
	long add(long a, long b) {
		long result = a+b;
		return result; // = return a+b
	}
	//»¬¼À
	long subtract(long a, long b) {
		return a-b;
	}
	//°ö¼À
	long multiply(long a, long b) {
		return a*b;
	}
	//³ª´°¼À
	double divide(double a, double b) {
		return a/b;
	}
}
