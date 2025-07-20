import java.util.*;
public class switchher {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any number: ");
        int button=sc.nextInt();
        switch(button){
            case 1:System.out.println("Hello Village");
            break;
            case 2:System.out.println("Hello City");
            break;
            case 3:System.out.println("Hello District");
            break;
            case 4:System.out.println("Hello India");
            break;
            default:System.out.println("Invalid reference");
            
        }
        

    }
    
}
