package Exception;

public class Arithmetic {
     public static void main(String[] args) {
        
        System.out.println("Planed start");

        try{System.out.println(2);
        System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println("Responsible Exception:"+e);
        }
        System.out.println("Planed stop");
    }
    
}