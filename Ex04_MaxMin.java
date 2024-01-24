package HomeWorks;

import java.util.Scanner;

public class Ex04_MaxMin {
    public static void main(String[] args) {
        System.out.println("Hãy nhập số phần tử của mảng số nguyên");
        Scanner scanner = new Scanner(System.in);
        int arrLength = Integer.parseInt(scanner.nextLine());
        int[] arrNumbers = new int[arrLength];
        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.printf("Nhập phần tuwr arrNumbers[%d]", i);
            arrNumbers[i] = Integer.parseInt(scanner.nextLine());
        }
        ;
        System.out.println("Mảng là:");

        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.printf("%d\t", arrNumbers[i]);

        }
        ;
        int max = arrNumbers[0];
        for (int i = 1; i < arrNumbers.length; i++) {
            if (arrNumbers[i] > max) {
                max = arrNumbers[i];
            }

        }
        ;
        System.out.println("\nGiá trị lớn nhất là:" + max);

        int min = arrNumbers[0];
        for (int i = 1; i < arrNumbers.length; i++) {
            if (arrNumbers[i] < min) {
                min = arrNumbers[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất là:" + min);

    }
}
