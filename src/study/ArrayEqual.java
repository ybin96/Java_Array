package study;

class ArrayEqual03 
{
	public static void main(String[] args) 
	{
		int []a = {1,2,3,4,5,6,7};
		int []b = {1,2,3,4,5};

		//코드를 수정하여 바람직한 결과가 나오도록 해 봅니다.
		//완서아면 "1"

		boolean flag = true;
		
		if(a.length != b.length){
			flag = false;
		}else{
			for(int i=0; i<a.length; i++){
				if(a[i] != b[i]){
					flag = false;
					break;
				}
			}
		}

		if(flag == true){
			System.out.println("배열의 내용이 일치합니다.");
		}else{
			System.out.println("배열의 내용이 일치하지 않습니다.");
		}	
	}
}
