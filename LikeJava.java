import java.util.Scanner;

public class LikeJava
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String daveSays = "   -  -\n(________)\nDave Says:\n";
        
        System.out.println(daveSays + "Do you love Java?\n\nYou Say:");
        String imput = scanner.nextLine();
        
        if (imput.contains("yes") || imput.contains("Yes") || imput.contains("YES"))
        {
            System.out.println("\n" + daveSays + "Supreme!");
        }
        else
        {
            System.out.println("\n" + daveSays + "Lame!");
        }
    }
}