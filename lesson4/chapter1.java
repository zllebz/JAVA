package lesson4;

public class chapter1 {
    public static void main(String[] args) {
        int[] arr = {
            24, 35, 99,  5, 46,  3, 13, 28,  7, 77,
            42, 56,  1, 58, 59,  4, 53, 94, 24, 69,
            41, 17, 98, 84, 83, 54, 34, 76, 18, 27
        };
        System.out.println("Array" );
        System.out.println(" 24  35  99   5  46   3  13  28   7  77\n"+
        " 42  56   1  58  59   4  53  94  24  69\n"+
        " 41  17  98  84  83  54  34  76  18  27" );
        System.out.println("Number that are divisible by 3:" );
           for(int v : arr){
               if (v %3 == 0){
                   System.out.print(v+" ");
               }
           }
           System.out.println(" ");
    }
}
