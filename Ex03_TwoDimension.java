package HomeWorks;

import java.util.Scanner;

public class Ex03_TwoDimension {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số dòng của mảng:");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập số cột cuar mảng:");
        int column = Integer.parseInt(scanner.nextLine());
        int[][] twoDimension = new int[row][column];
        System.out.println("Hãy nhập các phần tử của mảng 2 chiều:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Phần tuwr: [%d][%d]\n", i,j);
                twoDimension[i][j]= Integer.parseInt(scanner.nextLine());
            }

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("%d\t", twoDimension[i][j]);

            }
            System.out.println("\n");

        }
    }
}
