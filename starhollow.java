import java.util.*;
public class starhollow {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int n=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int m=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1 || j==1 ||i==n || j==m){
                System.out.println("*");
            }
        
            else{
                System.out.print(" ");
            }
        }

    
    System.out.println();
    
}
}
}
