

public class HelloName {



    public static void main(String args[])
    {
        boolean tryout = true;
        System.out.println(returnBoolean(tryout));
        String name = "This Person";
        System.out.println(helloName(name));
    }

    public static boolean returnBoolean(boolean trythis)
    {
        return trythis;
    }

    public static String helloName(String name)
    {
        return "Hello," +name +"!";
    }
}
