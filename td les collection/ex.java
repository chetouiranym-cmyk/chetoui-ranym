
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("doner n");
        int n=sc.nextInt();
        ArrayList<String>livres=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("doner titre de livres");
            String liv=sc.next();
            livres.add(liv);}
         Collections.sort(livres);
         Iterator<String> it=livres.iterator();
          while(it.hasNext()){
            String el2= it.next();
            if(el2.toUpperCase().startsWith("A")){
                it.remove();
                
            }
             
         }
    }
}