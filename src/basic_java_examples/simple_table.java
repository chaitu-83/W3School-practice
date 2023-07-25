package basic_java_examples;
import java.util.Scanner;

public class simple_table {
    public static void main(String args[])throws  Exception
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = in.nextInt();
        for(int i=0;i<=10;i++)
        {

            System.out.println(num + "* "+ i + " ="+ num * i);
        }

    }
}
