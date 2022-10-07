package study;

class ArrayTest02 
{
	public static void main(String[] args) 
	{
		int []a = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;  //실행시에 오류발생

		/*
			Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
			at ArrayTest02.main(ArrayTest02.java:9)
		*/

	}
}
