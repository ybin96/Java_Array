package practice;

class MaxTest02 
{
	public static void main(String[] args) 
	{
		int []a = {1,3,10,6,2};
		int max;
		
		//배열의 0번째 요소를 가장 크다고 봅니다.
		max = a[0];
		
		
		//반복문을 이용하여 배열의 요소중에 최대값을 구하여 출력 해 봅니다.
		for(int i=1; i<a.length; i++){
			if(a[i] > max){
				max = a[i];
			}
		}
		
		System.out.println("가장 큰값 : " + max);
	}
}
