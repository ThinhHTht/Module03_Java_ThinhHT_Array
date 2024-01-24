package HomeWorks;

import java.util.Scanner;

public class Ex09_Delete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số phần tử của mảng:");
        int n = scanner.nextInt();
        int[] oneWay = new int[n + 20];
        System.out.println("Hãy nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Phần tử oneWay[%d]", i);
            oneWay[i] = scanner.nextInt();

        }
        System.out.println("Mảng là:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t", oneWay[i]);

        }
        // delete value
        System.out.println("\nNhập chỉ số của phần tử muốn xóa:");
        int deleteIndex = scanner.nextInt();
        for (int i = deleteIndex; i < n; i++) {
            oneWay[i] = oneWay[i+1];

        }

        n = n-1;
        // after update:
        System.out.println("\nMảng là:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t", oneWay[i]);

        }


    }
}
