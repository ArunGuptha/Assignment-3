

package money;


import java.util.Scanner;


public class money {

	public void Money()

	{
		int count = 0;
		System.out.println("ENTER THE TOTAL MONEY YOU HAVE ! I CAN TELL YOU HOW MANY WOODEN BLOCKS YOU CAN GET!");
		Scanner money = new Scanner(System.in);
		int x = money.nextInt();
		int i = 1;
		while (x != 0) {
			double a = Math.sqrt(x);
			int b = (int) a;
			System.out.println("Dimensions of a Block " + i + " is " + b + "*" + b);
			int c = x - (b * b);
			x = c;
			count++;
			i++;
		}
		System.out.println("NUMBER OF WOODEN BLOCKS YOU CAN GET WITH YOUR MONEY  " + count);
	}
	public static void main(String[] args) {

		money M = new money();
		M.Money();
	}
}