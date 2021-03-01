import java.util.Scanner;
import java.util.Random;

public class CakeForStrength
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String daveSays = "   -  -\n(________)\n\nDave Says:\n";
        String sickDaveSays = "   ~  ~\n(________)\n\nDave Says:\n";
        String deadDaveSays = "   x  x\n(________)\n\nDave Says:\n";
        String youSay = "\n\nYou Say:\n";
        
        System.out.print(sickDaveSays + "I feel week..." + youSay);
        String imput = scanner.nextLine();
        
        System.out.print("\n" + sickDaveSays + "I need cake for strength! Will you give me some?" + youSay);
        imput = scanner.nextLine();
        
        if(imput.contains("OK") || imput.contains("ok") || imput.contains("Ok") || imput.contains("Okay") || imput.contains("okay") || imput.contains("OKAY") || imput.contains("Yes") || imput.contains("YES") || imput.contains("yes"))
        {
            int ran = random.nextInt(2);
            
            if(ran == 0)
            {
                System.out.print(sickDaveSays + "Quick! Hand it over!" + youSay);
                imput = scanner.nextLine();
                
                System.out.print("\n" + daveSays + "Thanks! Your a life saver!");
            }
            else
            {
                System.out.print("\n" + sickDaveSays + "Is it pink?" + youSay);
                imput = scanner.nextLine();
                
                if(imput.contains("yes") || imput.contains("Yes") || imput.contains("YES") || imput.contains("Yeah") || imput.contains("YEAH") || imput.contains("yeah"))
                {
                    System.out.print("\n" + daveSays + "\"Scarf Scarf\"");
                }
                else
                {
                    System.out.print("\n" + sickDaveSays + "Does it at least have chocolate icing?" + youSay);
                    imput = scanner.nextLine();
                    
                    if(imput.contains("yes") || imput.contains("Yes") || imput.contains("YES") || imput.contains("Yeah") || imput.contains("YEAH") || imput.contains("yeah"))
                    {
                        System.out.print("\n" + daveSays + "It will do\n\"Scarf\"");
                    }
                    else
                    {
                        ran = random.nextInt(2);
                        
                        if(ran == 0)
                        {
                            System.out.print("\n" + sickDaveSays + "I guess I'll have to eat just a chicken, a bowl of milk, and three eggs. It's not quite enought, \"Gasp\" but it will hold me long enough.");
                        }
                        else
                        {
                            System.out.print("\n" + deadDaveSays + "I'm running out of time... Farewell world...");
                        }
                    }
                }
            }
        }
        else
        {
            System.out.print("\n" + deadDaveSays + "I think... I'm going to... \"Choke\" \"gasp\"");
        }
    }
}