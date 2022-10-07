package practice;

import java.util.Scanner;
class CreditCard 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double []data = new double[12];
		double total = 0;
		double avg;

		for(int i=0; i<data.length; i++){
			do{
				System.out.print((i+1)+"월의 카드 사용금액을 입력==>");
				data[i] = sc.nextDouble();
			}while(data[i] < 0);
			total += data[i];
		}
		avg = total / data.length;
		
		
		for(int i=0; i<data.length; i++){
			System.out.print((i+1) + "월 카드 사용금액:");
			System.out.println(data[i] );
		}
		System.out.println("총 사용금액 : " + total);
		System.out.println("평균 사용금액 : " + avg);

		double max = data[0];
		int max_month = 0;

		double min = data[0];
		int min_month = 0;

		for(int i=1; i<data.length; i++){
			if(data[i] > max){
				max = data[i];
				max_month = i;
			}
			
			if(data[i] < min){
				min = data[i];
				min_month = i;
			}
		}
		
		System.out.println("가장 지출이 많았던 월"+ (max_month + 1));
		System.out.println("가장 지출이 적었던 월"+ (min_month + 1));

	}
}
