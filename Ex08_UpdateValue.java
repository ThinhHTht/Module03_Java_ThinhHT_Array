package HomeWorks;

import java.util.Scanner;

public class Ex08_UpdateValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số phần tử của mảng:");
        int n = scanner.nextInt();
        int[] oneWay = new int[n];
        System.out.println("Hãy nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Phần tử oneWay[%d]", i);
            oneWay[i] = scanner.nextInt();

        }
        System.out.println("Mảng là:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\n", oneWay[i]);

        }
        // update value
        System.out.println("Nhập chir số của phần tử muoons update");
        int updateIndex = scanner.nextInt();
        System.out.println("Nhập giá trị sau khi thay đổi:");
        int updateValue = scanner.nextInt();
        oneWay[updateIndex] = updateValue;
        // after update:
        System.out.println("Mảng là:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\n", oneWay[i]);

        }


    }
}
