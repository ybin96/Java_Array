package study;

class ArrayCopy02 {
	public static void main(String[] args) 
	{
		int []a = {1,2,3,4,5};
		int []b = new int[a.length];
		
		//a배열의 요소를 모두 b배열의 요소로 복사 해 봅니다.
		for(int i=0; i<a.length; i++){
			b[i] = a[i];
		}
		a[0]= 100;
		System.out.println("a배열의 요소");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		System.out.println("b배열의 요소");
		for(int i=0; i<b.length; i++){
			System.out.print(b[i]+ " ");
		}
	}
}
