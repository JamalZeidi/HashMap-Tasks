import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Scoreboard {
    /**
     * TO-DO: Find the name of the player with the highest score.
     * If the map is empty, return null.
     \*
     * @param scores A map of player names to their scores.
     * @return The name of the player with the highest score.
     */
    public String findTopPlayer(Map<String, Integer> scores) {
        if (scores == null || scores.isEmpty()) {
            return null;
        }
        String topPlayer = null;
        int maxScore = -1; // Assuming scores are non-negative

        // Your code here. Iterate through the entrySet to check both key and value.
            for(Map.Entry<String,Integer> entry : scores.entrySet()){
                    if(entry.getValue() > maxScore){
                        maxScore = entry.getValue();
                        topPlayer = entry.getKey();
                    }
            }
        return topPlayer; // Placeholder
    }

    public static void main(String[] args) {
        Scoreboard ob = new Scoreboard();

        Map<String,Integer> result = new HashMap<>();
        result.put("Jamal",200);
        result.put("ALi",123);
        result.put("Salim",700);
        result.put("Abduallah",100);
        result.put("Mohammed",150);


        System.out.println(ob.findTopPlayer(result));




    }
}