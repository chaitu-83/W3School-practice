package javaHowTo;
import java.util.Random;
import  java.lang.String;
import  java.lang.StringBuilder;
import java.util.UUID;

public class numaric_generation {
    public static void main (String args[]) throws  Exception
    {
        Random rand = new Random();

        String str = rand.ints(48, 123)

                .filter(num -> (num<58 || num>64) && (num<91 || num>96))

                .limit(15)

                .mapToObj(c -> (char)c).collect(StringBuffer::new, StringBuffer::append, StringBuffer::append)

                .toString();

        System.out.println("A random alphanumeric string: " + str);


    }

}
