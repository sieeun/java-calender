package calender;

public class Calender {

	public static void main(String args[]){
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		int date = 0;
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 7; j++){
				date++;
				System.out.print(date + " ");
			}
			System.out.println("");
		}
	}
}
