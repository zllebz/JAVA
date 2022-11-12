package lesson9;

import java.util.Scanner;

public class chapter1 {
    public static void main(String[] args) {
        for (;;) {
            Scanner sc = new Scanner(System.in);
            System.out.println("กด n เพื่อคำนวณ e ปิดโปรแกรม ");
            System.out.print("N/E : ");
            String a = sc.nextLine();
            String bb = "";
            if ("n".equals(a) || "N".equals(a)) {

                try {
                    System.out.print("ใส่ส่วนสูง(cm) = ");
                    float h = sc.nextInt();

                    System.out.print("ใส่น้ำหนัก(kg) = ");
                    int w = sc.nextInt();
                    float h2 = (h / 100);
                    float sum = (w / (h2 * h2));
                    System.out.println("ค่าดัชนีมวลกายของคุณ = " + sum);
                    if (sum >= 24) {
                        System.out.println(" You are overweight");
                    } else if (sum > 20 && sum < 24) {
                        System.out.println(" You are normal");
                    } else if (sum <= 20) {
                        System.out.println(" You are skinny");
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }

            }
            if ("e".equals(a) || "E".equals(a)) {
                System.out.println("Finished");
                break;
            }
        }
    }
}
