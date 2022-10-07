package study;

class ArrayTest05 
{
	public static void main(String[] args) 
	{
		String []name = {"홍길동", "이순신", "유관순", "김유신", "강감찬"};

		//인덱스 반복문을 이용하여 배열의 요소를 모두 출력해 봅니다.
		for(int i=0; i<name.length; i++){
			System.out.println(name[i]);
		}
		System.out.println("-----------------------------------------");

		//for-each 반복문을 이용하여 배열의 요소를 모두 출력해 봅니다.
		for(String data : name){
			System.out.println(data);
		}

	}
}
