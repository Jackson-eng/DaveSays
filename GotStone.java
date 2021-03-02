import java.util.Scanner;
import java.util.Random;

public class GotStone
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String daveSays = "   -  -\n(________)\n\nDave Says:\n";
        String youSay = "\n\nYou Say:\n";
    
        System.out.print(daveSays + "It was my birthday yesterday, I’m sad I didn't get a single piece of stone! Would you get me some stone?" + youSay);
        String imput = scanner.nextLine();
        
        if(imput.contains("OK") || imput.contains("ok") || imput.contains("Ok") || imput.contains("Okay") || imput.contains("okay") || imput.contains("OKAY") || imput.contains("Yes") || imput.contains("YES") || imput.contains("yes") || imput.contains("Yeah") || imput.contains("YEAH") || imput.contains("yeah"))
        {
            int ran = random.nextInt(2);
            
            if(ran == 0)
            {
                System.out.print("\n" + daveSays + "Your so nice, thank you.");
            }
            else
            {
                System.out.print("\n" + daveSays + "I’m glad someone cares!");
            }
        }
        else
        {
            int ran = random.nextInt(3);
            
            if(ran == 0)
            {
                System.out.print("\n" + daveSays + "Please, I just want stone.");
            }
            
            if(ran == 1)
            {
                System.out.print("\n" + daveSays + "Hater.");
            }
            
            if(ran == 2)
            {
                System.out.print("\n" + daveSays + "Give it to me NOW!!! I GOT A KNIFE!!!" + youSay);
                imput = scanner.nextLine();
                
                if(imput.contains("OK") || imput.contains("ok") || imput.contains("Ok") || imput.contains("Okay") || imput.contains("okay") || imput.contains("OKAY") || imput.contains("Yes") || imput.contains("YES") || imput.contains("yes") || imput.contains("Yeah") || imput.contains("YEAH") || imput.contains("yeah"))
                {
                    System.out.print("\n" + daveSays + "Thank you.");
                }
                else
                {
                    System.out.print("\n" + daveSays + "You asked for it!");
                }
            }
        }
    }
}