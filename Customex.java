package Exception;
import java.util.Scanner;

public class Customex {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);

        System.out.println("Enter your age");
        int age=r.nextInt();

        if(age<18){
            try{
                throw new NoteligibleException ();
            }catch(NoteligibleException e){
                System.out.println("your age is below 18 ,you are not eligible");
            }
        }
    }
    
}
