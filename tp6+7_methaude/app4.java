import java.util.Scanner;

public class app4 {
    public static int lecteurN(){
        Scanner sc=new Scanner(System.in);
        int n;
        do { 
            System.out.println("donner la taille de tableau");
            n=sc.nextInt();
        } while(n<=0);
        return n;
    }public static void remplirTAB(double [][]M,int n1,int n2){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < n1; i++) {
            for (int j = 0;j < n2; j++) {
                System.out.println("M["+i+"]"+"["+j+"]");
                M[i][j]=sc.nextDouble();
                
            }}
        }public static double  calculesomme(double [][]M, int idc,int n2){
            double s=0;
            for (int i = 0; i < n2; i++) {
                s=s+M[idc][i];
                
            }return s;

        }public static void main(String[] args) {
            int n1;
            n1=lecteurN();
            int n2;
            n2=lecteurN();
           double[][]M=new double[n1][n2];
           remplirTAB(M, n1, n2);
           double s;
           for (int i = 0; i < n1; i++) {
            s=calculesomme(M, i, n2);
             System.out.println("la somme de ligne"+i+ "est ="+s);  
           }
        }
    
    
    
    
    
    
    
    }
