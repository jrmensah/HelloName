import java.util.Scanner;
public class HelloName {



    public static void main(String args[])
    {
        String name = "";
        System.out.println("What is your name?");
        Scanner keyboard = new Scanner(System.in);
        name = keyboard.nextLine();

        System.out.println(helloName(name));
    }

    public static String helloName(String name)
    {
        return "Hello," +name+"!";
    }
}
