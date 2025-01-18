import java.util.Scanner;
public class Digit_to_num{
	public static void main(String args[]){
		String arr[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a 1 digit number");
		int a = sc.nextInt();
		System.out.println(arr[a]);
	}
}
