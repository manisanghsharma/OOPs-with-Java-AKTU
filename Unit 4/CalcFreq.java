import java.util.HashMap;
import java.util.Map;

/**
 * CalcFreq
 */
public class CalcFreq {

    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap();
        String[] words = {"if", "it", "is", "to", "be", "it", "is", "up", "to", "me", "to", "delegate"};
        for (String word : words) {
            Integer freq = map.get(word);
            System.out.println(freq);
            map.put(word, (freq == null) ? 1 : freq + 1);
            }

            System.out.println(map);

        }
        


    }
