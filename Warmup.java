
import java.util.Scanner;

public class Warmup {

    public static void main(String[] args){
        boolean go = true;
        while (go = true){
        
        number();
        keepGoing();
        }
    }

        public static int number(int x){

            Scanner scan1 = new Scanner(System.in);
            System.out.println("give me a number 1-10");
            x = scan1.nextInt();
            
            for (int i = 0; i<11; i++){

                System.out.println(x);
            }
            return x;
        }
    
        public static boolean keepGoing(){

            Scanner input = new Scanner(System.in);
            System.out.println("would you like to go again?");
            String answer = input.nextLine();
            if (answer.equals("No") ) {
                go = false;
                
            }



        }


}
