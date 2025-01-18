import java.util.Scanner;
public class MinMax{
	public static void main(String args[]){
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++){
			int a = sc.nextInt();
			min = Math.min(min, a);
			max = Math.max(max, a);
		}
		System.out.println("Minimum = " + min + " Maximum = " + max);
	}
}
