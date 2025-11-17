
import java.util.Scanner;

public class app8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
         do { 
            System.out.println("donner n");
            n=sc.nextInt();
         } while(n<10);
         int[] t=new int[n];
         for(int i=0;i<n;i++){
            do{
                System.out.println("donner un note");
                t[i]=sc.nextInt();
            }while(t[i]>20||t[i]<0);
        }int nb=0;
        for(int i=0;i<n;i++ ){
            if (t[i]>=10){
                 nb=nb+1;
            }
        }System.out.println("le nombre des etudient a la moyenn est"+nb);
    }
}
