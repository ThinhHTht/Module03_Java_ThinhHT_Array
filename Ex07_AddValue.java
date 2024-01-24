package HomeWorks;

import java.util.Scanner;

public class Ex07_AddValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số phần tử của mảng:");
        int n = scanner.nextInt(); // số phần tử thực tế
        int[] oneWay = new int[n+20];
        System.out.println("Hãy nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Phần tử oneWay[%d]", i);
            oneWay[i] = scanner.nextInt();

        }
        System.out.println("Mảng là:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t", oneWay[i]);

        }
        // addValue
        System.out.println("Nhập vị trí muốn cheèn:");
        int addIndex = scanner.nextInt();
        System.out.println("Nhập giá tri muốn chèn");
        int addValue = scanner.nextInt();

//        for (int i = addIndex; i < n ; i++) {
//            oneWay[i+1] = oneWay[i]; // dịch phần tử sang bên phải 1 vị trí
//
//        }
        for (int i = n-1; i >=addIndex ; i--) {
            oneWay[i+1] = oneWay[i];

        }
        oneWay[addIndex] = addValue;
        // Mảng sau khi chèn:
        System.out.println("Mảng là:");
        for (int i = 0; i <= n; i++) {
            System.out.printf("%d\t", oneWay[i]);

        }

    }
}
