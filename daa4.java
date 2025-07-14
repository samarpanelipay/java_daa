import java.util.*;

public class daa4{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] s=sc.next().split(",");
        for(int i=0;i<s.length;i++){
            if(Integer.parseInt(s[i])%2==0){
                System.out.print(s[i]+" ");
            }
        }
    }
}