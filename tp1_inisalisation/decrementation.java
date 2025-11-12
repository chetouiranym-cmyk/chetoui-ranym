/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class decrementation{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("donner x=");
        x=sc.nextInt();
        System.out.println("donner y=");
        y=sc.nextInt();
        System.out.println("x="+x+"y="+y);
        x=y++;
        System.out.println("x="+x+"y="+y);
        x=++y;
        System.out.println("x="+x+"y="+y);
        y=x--;
        System.out.println("x="+x+"y="+y);
        y=--x;
        System.out.println("x="+x+"y="+y);
        
        
    }
}

