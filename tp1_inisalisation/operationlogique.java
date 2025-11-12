/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class operationlogique{
    public static void main (String[] args) {
        int a=6,b=21;
        boolean res;
        res=a>b;
        System.out.println("a>b?"+res);
        res=!(a>b);
        System.out.println("!(a>b)?"+res);
        res=a<b;
        System.out.println("a<b?"+res);
        res=a==b;
        System.out.println("a==b?"+res);
        res=a!=b;
        System.out.println("a!=b?"+res);
        res=(a<b)&(a==b);
        System.out.println("(a<b)&(a==b)"+res);
        res=(a<b)|(a==b);
        System.out.println("(a<b)|(a==b)"+res);
        res=(a<b)^(a==b);
        System.out.println("(a<b)^(a==b)"+res);
        res=a<b?true:false;
        System.out.println("a<b?true:false"+res);
    }
}