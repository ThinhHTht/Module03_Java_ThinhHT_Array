package HomeWorks;

import java.util.Scanner;

public class Ex05_RealTwodimension {
    public static void main(String[] args) {
        System.out.println("Hãy nhập số hàng của mảng:");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        System.out.println("Hãy nhập số cột của mảng:");
        int column = scanner.nextInt();
        float[][] floatArr = new float[row][column];
        // Nhập các giá trị cuar mảng:
        System.out.println("Hãy nhaapj các giá trị của mảng:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Phần tử floatArr[%d][%d]:", i,j);
                floatArr[i][j] = scanner.nextFloat();

            }

        }
        // In ra mảng:
        System.out.println("Mảng là;");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column ; j++) {
                System.out.printf("%f\t", floatArr[i][j]);

            }
            System.out.println("\n");

        }
        // In ra phaanf tử cẵn và tổng của chúng
        float sum = 0F;
        System.out.println("Các phần tử chẵn là:");
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < column; j++) {
                if(floatArr[i][j] % 2 == 0){
                    System.out.printf("%f\t", floatArr[i][j]);
                    sum += floatArr[i][j];
                }

            }
            System.out.println("\nTổng của các phần tử chẵn là:" + sum);


        }
    }
}
