package javaHowTo;
import java.util.Arrays;
import java.lang.String;

public class arraylist {
    public static void main(String args[]) throws  Exception
    {
       String s ="Welcome to Java";
       int countwords = s.split("\\s").length;
        System.out.println(countwords);
       char[] chars = s.toCharArray();
        //System.out.println(chars.length);
       // char c =s.charAt(2);
       // System.out.println(c);
        char[] chars1 = new char[7];
        s.getChars(0,7,chars1,0);
        System.out.println(chars1);
    }
}
