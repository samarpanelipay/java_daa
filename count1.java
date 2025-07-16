import java.util.Scanner;

public class count1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i = 0 ; i<m ; i ++){
            for(int j = 0 ; j< n ; j++){
                arr[i][j] =sc.nextInt();
            }
        }
        count(m,n,arr);
    }
    public static void count(int m,int n,int arr[][]){
        int new_arr[]=new int[m];
        for(int i = 0 ; i<m ;i++){
            int count = 0;
            for (int j=0;j<n;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            new_arr[i]=count;
        }
        for(int i = 0 ; i < new_arr.length ; i++)
            System.out.println(new_arr[i]);
        int arr1[][]=new int[m][n];
        for(int i = 0 ; i < m ; i++){
            int c = new_arr[i];
            if(c==0){
                continue;
            }
            for(int j = 0 ; j< n ; j++){
                if(j<n-c){
                    arr1[i][j]=0;
                }
                else{
                    arr1[i][j]=1;
                }
            }
        }
        for(int k = 0 ; k<m ; k ++){
            for(int l = 0 ; l < n ; l++){
                System.out.print(arr1[k][l]+" ");
            }
            System.out.println();
        }
    }
}