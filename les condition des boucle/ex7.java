/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class ex7{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int x;
	    do{
	    System.out.println("donner nombre ");
	    x=sc.nextInt();}while(x==0);
	    if(x%2==0){
	        System.out.println(x +"est paire");
	    }
	    else{
	        System.out.println(x+"est impaire");
	    }
	}}