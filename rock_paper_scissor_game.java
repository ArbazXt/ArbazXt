import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor_game {
    public static void main(String[] args) {
        System.out.println("Choose Rock = 0, Paper = 1, Scissor = 2");
        Scanner sc = new Scanner(System.in);
        int yourChoice = sc.nextInt();
        Random rm = new Random();
        int computerChoice = rm.nextInt(3);
        if(yourChoice==computerChoice){
            System.out.println("Draw");
        }
        else if(yourChoice==0 && computerChoice==2 || yourChoice==1 && computerChoice==0 ||
                yourChoice==2 && computerChoice==1 ){
            System.out.println("You win");
        }
        else{
            System.out.println("Computer win");
        }
        if(computerChoice==0){
            System.out.println("Computer choice is Rock");
        }else if(computerChoice==1){
            System.out.println("Computer choice is Paper");
        }else if(computerChoice==2){
            System.out.println("Computer choice is Scissor");
        }

    }
}