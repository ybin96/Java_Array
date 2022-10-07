package practice;

//자바의 2차원배열에서는 각 행마다 열의 크기가 다를 수 있어요
//그래서 자바에서는 배열의 길이라는 속성을 만들어 두었어요.  ==> length
class DifferentColumnSize
{
	public static void main(String[] args) 
	{
		//int [][]a = new int[3][4];  //모든 행마다 열의크기가 같아요.
		
		int [][]a  = new int[3][];		//행의크기만 정해놓고 열의 크기는 정하지 않았어요.
		a[0] = new int[10];				//0번째 행의 열의크기는 10
		a[1] = new int[2];				//1번째 행의 열의크기는 2
		a[2] = new int[5];				//2번째 행의 열의크기는 5

		int n = 1;
		for(int i=0; i<3; i++){
			for(int j=0; j < a[i].length  ; j++){  //i:2==> a[2].length 5
				a[i][j] = n++;
			}
		}

		
		for(int i=0; i<3; i++){
			for(int j=0; j<a[i].length; j++){
				System.out.printf("%5d", a[i][j]);
			}
			System.out.println();
		}

	}
}
