package lesson5;

import java.util.Map;
import java.util.TreeMap;

public class chapter2 {
    public static void main(String[] args) {
        String text = "5, 7, 5, 2, 3, 3, 3, 0, 6, 9,"+
                    ", 8, 2, 6, 7, 4, 8, 4, 8, 2, 4,"+
                    ", 2, 9, 5, 6, 1, 3, 8, 7, 9, 8";
        text = text.replaceAll("[(),.']", "");
        String[] words = text.split(" ");
        TreeMap<String, Integer> tmap = new TreeMap<>();
            for(String word : words){
                if(tmap.get(word)==null){
                    tmap.put(word, 1);
                }else{
                    tmap.put(word, tmap.get(word)+1);
                }
            }
            tmap.entrySet()
                .stream().sorted(Map.Entry
                .<String,Integer>comparingByValue()
                .reversed())
                .forEach(x -> {
                    if(x.getValue()>=1){
                        System.out.println("number " +x.getKey()+" = "
                                + x.getValue());
                    }
                });
    }
}
