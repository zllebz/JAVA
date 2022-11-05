package lesson4;

import java.util.Scanner;

public class chapter2 {
    public static void main(String[] args) {
        int[] arr = {
            24, 35, 99,  5, 46,  3, 13, 28,  7, 77,
            42, 56,  1, 58, 59,  4, 53, 94, 24, 69,
            41, 17, 98, 84, 83, 54, 34, 76, 18, 27
        };
        System.out.println("Array" );
        System.out.println(" 24  35  99   5  46   3  13  28   7  77\n" +
        " 42  56   1  58  59   4  53  94  24  69\n" +
        " 41  17  98  84  83  54  34  76  18  27" );
        Scanner scan = new Scanner(System.in);
        System.out.print("Enternumber = ");
        int number = scan.nextInt();
            while(number >= 3 && number <= 7){
                System.out.println("Number that are divisible by " 
                        + number + " : ");
                for(int v : arr){
                    if(number >= 3 && number <= 7){
                        if(v %number == 0){
                            System.out.print(v+" ");
                        }
                    }
                }
                System.out.print("\nEnternumber = ");
                number = scan.nextInt();}
    }
}
