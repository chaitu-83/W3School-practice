package javaHowTo;
import java.util.Arrays;

public class sum_of_array {
    public static void main(String args[]) throws Exception {
        int[] myArray1 = { 1,8,9,3,4};
        int sum =0;
        int i;
        for( i=0; i< myArray1.length; i++)
        {
            sum += myArray1[i];
        }
        System.out.println("The Sum Is =" + sum);




    }
}
