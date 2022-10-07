/*
	5명의 점수를 입력받아 
	모두 출력하고 
	총점과 평균을 구하여 출력 해 봅니다.
*/
package practice;

import java.util.Scanner;
class StudentTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int score[] = new int[5];
		int tot = 0;
		int avg;

		for(int i=0; i<score.length; i++){
			System.out.print((i+1)+"번째 학생의 점수 입력==>");
			score[i] = sc.nextInt();
			tot += score[i];
			avg = tot /score.length;
		}

		avg = tot / score.length;
		
		for(int i=0; i<score.length; i++){
			System.out.print((i+1) + "번 점수:" );
			System.out.println(score[i]);
		}
		System.out.println("총점:" + tot);
		System.out.println("평균:" + avg);

	}
}










