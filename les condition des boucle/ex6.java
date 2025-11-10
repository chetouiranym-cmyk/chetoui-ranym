/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.


*******************************************************************************/
import java.util.Scanner;
public class ex6{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int i,nl,j;
	    do{
	    System.out.println("donner nombre de ligne");
	    nl=sc.nextInt();}while(nl<0);
	    System.out.println("enter the number of lines:"+nl);
        for(i=1;i<=nl;i++){
            for (j=i;j<=nl ;j++ ){ 
	            System.out.print("* ");
                
            }
            System.out.println();
        }
	        }
	    }
	

