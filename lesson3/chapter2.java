package lesson3;

public class chapter2 {
    public static void main(String[] args) {
        String str = "It has survived not only five centuries,"
        + " but also the leap into electronic typesetting,"
        + " remaining essentially unchanged.";
        
        String[] word = str.split(" ");
        for (String w : word) {
            int count = 0;
            for(int i = 0;i < w.length();i++){
                char a = w.charAt(i);
                if(a == 'e'){
                    count++;
                } 
            }
            if(count >= 2){
                System.out.println(w);
            }
        }
    }
}
