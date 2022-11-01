package lesson3;

public class chapter1 {
    public static void main(String[] args) {
        String str = "It has survived not only five centuries,"
                + " but also the leap into electronic typesetting,"
                + " remaining essentially unchanged.";
        str = str.toLowerCase();
        int i = str.indexOf('i');
        int countStart = 1;
        while (i >= 0) {

            if(countStart%2 == 0){
                System.out.println("i number " + countStart + " at " + i);
            }

            i = str.indexOf('i', i + 1);
            countStart++;
        }
    }
}
