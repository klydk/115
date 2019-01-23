/*
Write a method called printPowersOfN that accepts a base and an exponent as arguments and prints each power of the base from base0 (1) up to that maximum power, inclusive. For example, consider the following calls:
printPowersOfN(4, 3);
printPowersOfN(5, 6);
printPowersOfN(-2, 8);
These calls should produce the following output:
1 4 16 64
1 5 25 125 625 3125 15625
1 -2 4 -8 16 -32 64 -128 256
*/

public class printPowersOfN {
    public static void main(String[] args) {
	printPowersOfN(4, 3);
    }

    public static void printPowersOfN(int x, int n) {
	for (int i=0; i<=n; i++) {
	    System.out.print((int) Math.pow(x, i) + " ");
	}
	System.out.println();
    }

}