import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int you;
        int pc;
        int rock;
        int paper;
        int scissors;

        rock = 0;
        paper = 1;
        scissors = 2;

        System.out.println("ROCK,PAPER,SCISSORRS GAME");
        System.out.println("Choose 0=rock,1=paper,2=scissors");
        you = sc.nextInt();

        while (you > 2) {
            System.out.println("number between 0 and 2");
            you = sc.nextInt();
        }
        if (you == rock)
        {
            System.out.println("You chose ROCK");
        }
        else
        {
            if(you== paper)
            {
                System.out.println("You chose PAPER");
            }
            else
            {
                System.out.println("You chose SCISSORS");
            }
        }
        pc = r.nextInt(3);

        if(pc == rock)
        {
            System.out.println("Pc chose ROCK");
        }
        else
        {
            if(pc == paper)
            {
                System.out.println("Pc chose PAPER");
            }
            else
            {
                System.out.println("Pc chose SCISSORS");
            }
        }

        while (you == pc) {
            System.out.println("draw try again");
            you = sc.nextInt();
            while (you > 2) {
                System.out.println("give number between 0 and 2");
                you = sc.nextInt();
            }
            pc = r.nextInt(3);
            if (you == rock)
            {
                System.out.println("You chose ROCK");
            }
            else
            {
                if(you== paper)
                {
                    System.out.println("You chose PAPER");
                }
                else
                {
                    System.out.println("You chose SCISSORS");
                }
            }
            if(pc == rock)
            {
                System.out.println("Pc chose ROCK");
            }
            else
            {
                if(pc == paper)
                {
                    System.out.println("Pc chose PAPER");
                }
                else
                {
                    System.out.println("Pc chose SCISSORS");
                }
            }
        }


        if (pc==rock)
        {
            if (you==paper)
            {
                System.out.println("You win");
            }
            else
            {
                System.out.println("Pc Win");
            }
        }
        else if (pc==paper)
        {
            if (you==rock)
            {
                System.out.println("Pc win");
            }
            else
            {
                System.out.println("You Win");
            }
        }
        else if (you==rock)
        {
            System.out.println("You Win");
        }
        else
        {
            System.out.println("Pc Win");
        }
    }
}