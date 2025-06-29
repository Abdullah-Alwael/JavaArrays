import java.util.Arrays;
import java.util.Scanner;

public class JavaArrays {
    public static void main(String[] args) {
//        1.Write a Java program to test if the first and the last element of an array of
//        integers is the same. The length of the array must be greater than or equal to
//        2

        int[] arrOfInts = {50, -20, 0, 30, 40, 60, 10};
        System.out.println("is the first and last element the same (equal) in the following list?");
        System.out.println(Arrays.toString(arrOfInts));

        if (arrOfInts[0] == arrOfInts[arrOfInts.length-1]) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

//        2.Write a Java program to find the numbers greater than the average of the
//        numbers of a given array.

        int[] moreThanAverage = {1, 4, 17, 7, 25, 3, 100};

        System.out.println("numbers greater than average in the following list are:");
        System.out.println(Arrays.toString(moreThanAverage));

        int sum = 0;
        float average;

        for (int n: moreThanAverage){
            sum +=n;
        }

        average = (float) sum/moreThanAverage.length;
        for (int n: moreThanAverage){
            if (n > average){
                System.out.print(n+" ");
            }
        }
        System.out.println();
        System.out.println("The average is = "+average);

//        3.Write a Java program to get the larger value between first and last
//        element of an array of integers.

        Scanner input = new Scanner(System.in);

        System.out.println("Finding largest value between first and last:");
        System.out.println("How many elements to check?");

        int length = input.nextInt();
        int[] largestFirstLast = new int[length];

        System.out.println("enter the elements: ");

        for (int i = 0; i <= largestFirstLast.length-1; i++) {
            System.out.println("enter "+(i+1)+ " element:");
            largestFirstLast[i] = input.nextInt();
        }

        if (largestFirstLast[0] > largestFirstLast[largestFirstLast.length-1]){
            System.out.println("The largest element is the first one = "+largestFirstLast[0]);
        } else {
            System.out.println("The largest element is the last one = "+largestFirstLast[largestFirstLast.length-1]);
        }


    }
}
