package HomeWorks;

import java.util.Scanner;

public class Ex02_RealNumber {
    public static void main(String[] args) {
        System.out.println("Hãy nhập số phần tử của mảng 1 chiều:");
        Scanner scanner = new Scanner(System.in);
        int arrLength = Integer.parseInt(scanner.nextLine());
        float[] floatArray = new float[arrLength];
        System.out.println("Hãy nhập các giá trị của mảng số thực:");
        for (int i = 0; i < arrLength; i++) {

            System.out.printf("Hãy nhập phần tử thứ [%d]", i);
            floatArray[i] = Float.parseFloat(scanner.nextLine());

        }
        float sum = 0F;
        for (int i = 0; i < arrLength; i++) {
            sum += floatArray[i];

        }
        System.out.printf("Trung bình coongj của các giá trị trong mảng là: %f", sum/arrLength);
    }
}
