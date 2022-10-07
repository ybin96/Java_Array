package practice;

class ThreeDArray
{
	public static void main(String[] args) 
	{
		int [][][]a = new int[2][3][4];
		//					  면 행 열



		//첫번째 면에는 모두 0을 저장하고 
		//두번째 면에는 모두 1을 저장해 봅시다.
		for(int	i=0 ; i<2; i++){			//면
			for(int j=0; j<3; j++){			//행
				for(int k=0; k<4; k++){		//열
					a[i][j][k] = i;
				}
			}
		}


		for(int i=0; i<2; i++){
			for(int j=0; j<3; j++){
				for(int k=0; k<4; k++){
					System.out.printf("%5d", a[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}

	}
}
