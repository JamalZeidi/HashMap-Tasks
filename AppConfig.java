import java.util.HashMap;
import java.util.Map;

class AppConfig {
    /**
     * TO-DO: Merge 'updatedConfig' into 'mainConfig'.
     * If a key exists in both, the value from 'updatedConfig' should be used.
     \*
     * @param mainConfig The primary configuration map (will be modified).
     * @param updatedConfig The map with new or updated settings.
     */
    public void mergeConfigurations(Map<String, String> mainConfig, Map<String, String> updatedConfig) {
        // Your code here. Use the correct method to merge maps.
        for (String matchFinder : mainConfig.keySet()){

            if(updatedConfig.containsKey(matchFinder)){

              mainConfig.put(mainConfig.get(matchFinder),updatedConfig.get(updatedConfig.keySet()));
                System.out.println(mainConfig.entrySet());
            }else{
                System.out.println(updatedConfig.entrySet());
                System.out.println(mainConfig.entrySet());
            }
        }
    }

    public static void main(String[] args) {
        AppConfig ob = new AppConfig();

        Map<String,String> main = new HashMap<>();
        main.put("ali","ahmad");
        Map<String,String> updates = new HashMap<>();
        updates.put("ali","salim");
        Map<String,String> updated = new HashMap<>();
        updated.put("App","salim");
        Map<String,String> outdated = new HashMap<>();
        outdated.put("App","Abdullah");

        ob.mergeConfigurations(main,updates);

    }
}