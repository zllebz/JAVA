package lesson2;

import java.util.Scanner;

public class chapter3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String space = "";
        int i ;
        do{
        System.out.print("Number : ");
        i = sc.nextInt();
        for (int num = 1; num <= i; num++) {
            for (int h = 1; h < num; h++) {
                System.out.print(" ");
            }
            for (int w = num; w <= i; w++) {
                System.out.print("*");
            }
            System.out.println();
        }    
        }while(i >= 1);
    }
}
