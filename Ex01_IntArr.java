package HomeWorks;

import java.util.Scanner;

public class Ex01_IntArr {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập các giá trị của mảng:");
        for (int i = 0; i < intArray.length ; i++) {
            System.out.printf("Phần tử thứ %d\n", i+1 );
            intArray[i]= Integer.parseInt(scanner.nextLine());

        }
        System.out.println("Mảng là:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("%d\t", intArray[i]);

        }
    }
}
