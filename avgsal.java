import java.util.Scanner;

public class avgsal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int max=-1;
        int min=999999;
        for(int i =0 ; i<s.length;i++){
            if(Integer.parseInt(s[i])>=max){
                max=Integer.parseInt(s[i]);
            }
            if(Integer.parseInt(s[i])<=min){
                min=Integer.parseInt(s[i]);
            }
        }
        int sum=0;
        for(int i =0 ;i<s.length;i++){
            if(Integer.parseInt(s[i])==max || Integer.parseInt(s[i])==min){
                sum+=Integer.parseInt(s[i]);
            }
        }
        System.out.println(sum/(s.length-2));
    }
}
