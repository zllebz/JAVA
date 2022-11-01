package lesson2;

import java.util.Scanner;

public class chaper1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if(i >= 80 && i <= 100){
            System.out.println("เกรด A");
        }else if(i >= 70 && i <= 79){
            System.out.println("เกรด B");
        }else if(i >= 60 && i <= 69){
            System.out.println("เกรด C");
        }else if(i >= 50 && i <= 59){
            System.out.println("เกรด D");
        }else if(i >= 0 && i <= 49){
            System.out.println("เกรด F");
        }else{
            System.out.println("error");
        }
    }
}
