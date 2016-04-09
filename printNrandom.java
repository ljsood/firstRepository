import java.util.Random;
import java.util.Scanner;
public class printNrandom {
	public static void main (String [] args){
		Scanner kb = new Scanner (System.in);
		Random rd = new Random ();

		System.out.print("How many number do you want to create?: ");
		int N = kb.nextInt();

		double rdN;
		for (int i = 1; i <= N; i++) {
			rdN = rd.nextDouble();
			System.out.println(rdN ); 
		}

	}
}
