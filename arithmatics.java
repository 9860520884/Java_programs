import java.util.*;
public class arithmatics {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       
   
    int add,sub,mul,div;
       
       System.out.print("a:");
       int a=sc.nextInt();
       System.out.print("b:");
       int b=sc.nextInt();
       System.out.print("enter the input values:");
       int p=sc.nextInt();

      if(p==1){ //addition

     add=a+b;
      
        System.out.println("addition: "+add);

      }
      else if(p==2){ //addition

        sub=a-b;
       
         System.out.println("substraction: "+sub);
 
       }
       else if(p==3){ //addition

        mul=a*b;
       
         System.out.println("multiplication: "+mul);
 
       }
       else if(p==4){ //addition

        div=a/b;
       
         System.out.println("division: "+div);
 
       }
       else{
        System.out.println("no Value");
       }
    
    }
}
          
       
       
   
       
      
    

