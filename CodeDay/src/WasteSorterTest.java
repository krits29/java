/**
 * Created by kritisharma on 2/22/20.
 */
import java.util.Scanner;
import java.util.Random;

public class WasteSorterTest
{
    public static WasteSorter sorter = new WasteSorter();

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        boolean play = true;


            System.out.println("Welcome to waste sorter");
            System.out.println("Sort the following items into Recycle (r), Compost (c), or Trash(t)");
            System.out.println("To Quit, press q");

        while(play == true)
        {
            System.out.println("Item: " + sorter.getItem());
            String answer = scan.nextLine();
            if(answer.equals("q"))
            {
                play = false;
            }
            else
            {
                match(answer);
            }
        }

    }

    public static void match(String location)
    {
        Random ness = new Random();

        if(location.equals((sorter.getLocation())))
        {
            int num = ness.nextInt(3) + 1;
            if(num == 1)
            {
                System.out.println("Yup that right!");
            }
            else if(num == 2)
            {
                System.out.println("Correct!");
            }
            else
            {
                System.out.println("Good job!");
            }
        }

        else
        {
            String str;
            if(sorter.getLocation().equals("r"))
            {
                str = "Recycle";
            }
            else if(sorter.getLocation().equals("c"))
            {
                str = "Compost";
            }
            else
            {
                str = "Trash";
            }

            System.out.println("No...its actually " + str);
        }
    }
}
