package calender;

public class Calender {

	public static void main(String args[]){
		System.out.println("�� �� ȭ �� �� �� ��");
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
