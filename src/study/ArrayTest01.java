package study;

class ArrayTest01 
{
	public static void main(String[] args) 
	{
		int []age;			//배열의 선언	 int <-- 배열의 자료형,  age <--- 배열의 이름
		age = new int[5];	//배열의 생성            5<-- 배열의 크기

		//age[0], age[1], age[2], age[3], age[4]    <--- 배열의 요소
		//0,1,2,3,4,								<--- 배열의 인덱스

		age[0] = 27;
		age[1] = 28;
		age[2] = 28;
		age[3] = 27;
		age[4] = 27;
		
		int tot =  0;
		//tot = age[0] + age[1] + age[2] + age[3] + age[4];
		
		for(int i=0; i<=age.length; i++){    // age.length <-- 배열의 길이
			tot += age[i];
		}
		
		int avg;
		avg = tot / age.length;

		System.out.println("나이의 총합:" + tot);
		System.out.println("나이의 평균:" + avg);

	}
}
