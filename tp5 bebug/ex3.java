import java.util.StringTokenizer;
public class ex3{
    public static void main(String[] args) {
        String phrase="java est amusent";
        StringBuffer sb=new StringBuffer(phrase);
        sb.reverse();
        System.out.println("phrase inversee"+sb);
        StringTokenizer st=new StringTokenizer(phrase,"");
        int c=0;
        while(st.hasMoreTokens()){
            String mot=st.nextToken();
            c=c+1 ;

        }System.out.println("nombres de mot: "+c);



    }    
}