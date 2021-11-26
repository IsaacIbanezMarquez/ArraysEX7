import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n > 20 || n <= 0)
        {
            System.out.println("Invalid number, try again: ");
            n = sc.nextInt();
        }

        int[] numbers = new int [n];
        fillArrayOfIntegers(numbers);
        printArrayOfIntegers(numbers);
    }

    private static void printArrayOfIntegers(int[] numbers)
    {
        System.out.println("The elements are: ");
        System.out.println(Arrays.toString(numbers));
    }

    private static void fillArrayOfIntegers(int[] numbers)
    {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = sc.nextInt();
        }
    }

}
