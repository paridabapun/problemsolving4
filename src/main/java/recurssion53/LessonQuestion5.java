package recurssion53;

//WAP to print from n to 1 using recurssion  
public class LessonQuestion5 {

	public static void printt(int n) {
		if (n == 1) {
			System.out.print(1+" ");
			return;
		}
		printt(n - 1);
		System.out.print(n+" ");

	}

	public static void main(String[] args) {
		printt(9);
	}

}
