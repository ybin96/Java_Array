package practice;

class MatrixTest03 
{
	public static void main(String[] args) 
	{
		int [][]a = new int[5][5];

		int n = 1;
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				a[i][j] = n++;
				a[i][4] += a[i][j];
				a[4][j] += a[i][j];
				a[4][4] += a[i][j];
			}
		}

		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				System.out.printf("%5d", a[i][j]);
			}
			System.out.println();
		}
	}
}
