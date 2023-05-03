
import java.util.*;

public class NumberArray {

    private static void reverseSort(int arr[])
    {
        for(int i =0; i < arr.length; i++)
        {
            arr[i] = (arr[i] * -1);
        }
        Arrays.sort(arr);
        for(int i =0; i < arr.length; i++)
        {
            arr[i] = (arr[i] * -1);
        }
    }

    private static void getCount(int arr[]) {
        int count = 1;
        System.out.printf("Number Count\n");
        for (int i = 0, length = arr.length; i < length; i++) {
            if (i < length - 1) {
                if (arr[i] == arr[i + 1]) {
                    count++;
                }
            } else {

                System.out.printf("%6d%6d\n", arr[i], count);
            }
            if (i < length - 1 && arr[i] != arr[i + 1]) {

                System.out.printf("%6d%6d\n",  arr[i], count);
                count = 1; // no plus
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many entries are in the array? *up to 50");

        int[] numberArray = new int[input.nextInt()];



        System.out.println("Enter in Array Numbers: ");
        for(int i = 0; i < numberArray.length; i++)
        {
            numberArray[i] = input.nextInt();
        }

        reverseSort(numberArray);

        getCount(numberArray);

    }
}

