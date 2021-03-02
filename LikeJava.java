import java.util.Scanner;

public class LikeJava
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String daveSays = "   -  -\n(________)\n\nDave Says:\n";
        String youSay = "\n\nYou Say:\n";
        
        System.out.print(daveSays + "Do you love Java?" + youSay);
        String imput = scanner.nextLine();
        
        if (imput.contains("yes") || imput.contains("Yes") || imput.contains("YES") || imput.contains("yeah") || imput.contains("Yeah") || imput.contains("YEAH"))
        {
            System.out.print("\n" + daveSays + "Supreme!");
        }
        else
        {
            System.out.print("\n" + daveSays + "Lame!");
        }
    }
}
