package javaHowTo;
import java.lang.Math;
import java.util.Random;
import java.util.Arrays;
import java.lang.String;

public class random_Numbers {

   // public static String randomString(int length)
  //  {
  //      char[] ALPHANUMERIC
   //             ="abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();

  //      StringBuilder random = new StringBuilder();

   //     for(int i =0; i < length; i++) {
    //        int index = (int) (Math.random(ALPHANUMERIC)) ;
    //        random.append(ALPHANUMERIC[index]);
     //   }
     //   return random.toString();
   // }





    public static void main(String args[]) throws Exception
    {

       // System.out.println("First Random Number :" + Math.random());
       // System.out.println("Second Random Number :" + Math.random());
        int min= 200;
        int max=400;
       // System.out.println("random Double value"+min + " " + max);
      //  double a = Math.random() * (max-min+1)+min;
      //  System.out.println(a);
      //  System.out.println("random int value"+min + " " + max);
      //  int b = (int) Math.random() * (max-min+1)+min;
      //  System.out.println(b);
      //  random_Numbers objR = new random_Numbers();

      Random random = new Random();
        int x = random.nextInt(100);

      //  System.out.println(x);
      //  float y = random.nextFloat();
     //   System.out.println(y);
     //   double d = random.nextDouble();
      //  System.out.println(d);
      //  boolean b = random.nextBoolean();
     //   System.out.println(b);
        //String alphnumber = "ahklm0987";
       // int length = alphnumber.length();
      //  random1.append(length);
       // System.out.println(random1);
       // System.out.println(alphnumber);
       // System.out.println(alphnumber.toString());




    }

}
