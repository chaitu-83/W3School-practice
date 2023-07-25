package javaHowTo;

public class reverse_String {
    public static void main(String args[]) throws  Exception
    {
        String originalStr = " Hello";
        String reversedStr = "";

       for(int i = 0 ; i < originalStr.length(); i++)
       {
           reversedStr = originalStr.charAt(i) + reversedStr;
       }
        System.out.println( " reverserd string : " + reversedStr);
    }



}
