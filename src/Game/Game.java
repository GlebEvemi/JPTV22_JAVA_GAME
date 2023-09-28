package Game;
import java.util.Random;
import java.util.Scanner;



public class Game {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    private int random_num = rand.nextInt(11);


    public void Run(){
        System.out.println("----Game----");
        int answer = 0;
        System.out.println("Я загадал число, угадай его(от 1 до 10): ");
        while(true) {
            answer = scanner.nextInt();
            if(answer == random_num){
                System.out.println("Поздравляем!");
                System.out.println("Ты угадал!");
                break;
            }
            else{
                System.out.println("Ты проиграл!");
                System.out.println("Попробуй еще раз");
            }
        }




    }

}
