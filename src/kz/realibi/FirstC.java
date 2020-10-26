package kz.realibi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstC extends BaseTask {

    @Override
    void execute(){
        String[] words = text.split(" ");
        Map<String, Integer> wordsMap = new HashMap<>();

        for(String word : words){
            if(wordsMap.containsKey(word)){
                int count = wordsMap.get(word);
                count++;
                wordsMap.remove(word);
                wordsMap.put(word, count);
            }else{
                wordsMap.put(word, 1);
            }
        }

        for(String key : wordsMap.keySet()){
            int count = wordsMap.get(key);
            if(count > 1){
                System.out.println(key + ": " + wordsMap.get(key));
            }
        }

        System.out.println(wordsMap);
    }
}
