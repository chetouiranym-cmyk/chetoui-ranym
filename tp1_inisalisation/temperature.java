/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class temperature
{
	public static void main(String[] args) {
	    Double t;
	    Scanner sc=new Scanner(System.in);
		System.out.println("doner la tempurature en celsius");
		t=sc.nextDouble();
		t=t+273.15;
		System.out.println("la tempurature est"+t+"k");
	}
}
