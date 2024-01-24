package HomeWorks;

import java.util.Scanner;

public class Ex06_FindNumber {
    public static void main(String[] args) {
        System.out.println("Nhập số phần tử của mảng 1 chiều:");
        Scanner scanner = new Scanner(System.in);
        int arrLength = scanner.nextInt();
        int[] integerArr = new int[arrLength];
        System.out.println("Hãy nhập các phần tử của mảng:");
        for (int i = 0; i < arrLength; i++) {
            System.out.printf("Phần tử integerArr[%d]:", i);
            integerArr[i] = scanner.nextInt();

        }
        // In mảng ra:
        System.out.println("Mảng là:");
        for (int i = 0; i < arrLength; i++) {
            System.out.printf("%d\t", integerArr[i]);

        }
        // find number
        System.out.print("\nHãy nhập giá trị cần tìm:");
        int findNumber = scanner.nextInt();
        int sum = 0;
        System.out.print("Chỉ số của các phần tử giống với số cần tìm là:\t");
        for (int i = 0; i < arrLength; i++) {
            boolean isSame = false;
            if(integerArr[i] == findNumber){
                isSame = true;
                sum += integerArr[i];
            }
            if(isSame) {
                System.out.printf("%d\t", i);
            }

        }
        System.out.println("Tổng các giá trị bằng với số cần tìm laf:" + sum);
        
    }
}
