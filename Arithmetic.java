package Exception;

public class Arithmetic {
     public static void main(String[] args) {
        
        int a=0;
        try{
                    System.out.println(10/a);

        }catch(ArithmeticException e){
            System.out.println("It's worng give the correct number");
        }
    }
    
}