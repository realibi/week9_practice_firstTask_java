package kz.realibi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstB extends BaseTask {

    @Override
    void execute(){
        Map<Character, Integer> lettersMap = new HashMap<>();

        for(char letter : text.toCharArray()){
            if(lettersMap.containsKey(letter)){
                int count = lettersMap.get(letter);
                count++;
                lettersMap.remove(letter);
                lettersMap.put(letter, count);
            }else{
                lettersMap.put(letter, 1);
            }
        }

        System.out.println(lettersMap);
    }
}
