package study;

class	ArrayTest03 
{
	public static void main(String[] args) 
	{
		/*
		int []a;				//배열을 선언
		a = new int[3];			//배열을 생성
			
		a[0] = 10;				//배열의 요소를 초기화
		a[1] = 20;
		a[2] = 30;*/

		int []a = {10,20,30};  //배열을 선언함과 동시에 초기화

		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}

		System.out.println("-----------------------------------");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		//System.out.println(a[3]);

		System.out.println(a.length);
		//System.out.println(a[a.length]);
		/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        at ArrayTest03.main(ArrayTest03.java:17)*/

	
	}
}
