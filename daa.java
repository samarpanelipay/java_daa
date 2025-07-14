import java.util.*;
public class daa{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            String[] s=sc.next().split(",");
            for(int i = 0;i<s.length;i++){
                System.out.println(Integer.parseInt(s[i])+10);
            }
        }
    }
}