
import java.util.Scanner;


public  class methde{
public static double puissance(int  n,int x){
    double p=1;
    for (int i = 1; i <= x; i++) {
        p=p*n;


        
    }
    return p;




}
public static int fact(int n){
    int f=1;
    for (int i = 1; i <= n; i++) {
        f=f*i;

        
    }
    return f;

}
public static int  lecteur(){
    
        Scanner sc=new Scanner (System.in);
        int n;
        do {
            System.out.println("donner un entier"); 
           n=sc.nextInt();
            
        } while (n<0);
        return n ;
        
    }
     public static Boolean parite(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }

    }
     public static int compter(int n){
        String ch;
        ch=String.valueOf(n);
        return(ch.length());
    }
     public static double  somme(int n){
      double s;
        s=0;
        for (int i = 1; i <=n; i++) {
            s=s+ Math.pow(i,2);
           
            
        }
         return s;
        
     }  public static boolean  armstrong(int  n){
     double s;
     int u,d,c;
    double b = n;

        u= n %10;
        c=n/100;
        d=(n /10) %10;
       
        
        s= Math.pow(u,3)+Math.pow(d,3)+Math.pow(c,3);
        if(s==b){
            return true;

        }
        else{
            return false;
        }
        
        
     } 
     /* bolean test=(s==b)?True:false;
     return test;*/
}