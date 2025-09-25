import java.util.HashMap;
import java.util.Map;

class StudentRegistry {
    /**
     * TO-DO: Invert the given map.
     * The keys of the original map should become the values of the new map,
     * and the values should become the keys.
     \*
     * @param studentIdToName A map from student ID (Integer) to student name (String).
     * @return A new map from student name (String) to student ID (Integer).
     */
    public Map<String, Integer> invertMap(Map<Integer, String> studentIdToName) {
        Map<String, Integer> nameToStudentId = new HashMap<>();
        // Your code here. Iterate over the entrySet of the original map.
        for(Integer studentIds : studentIdToName.keySet()){
           nameToStudentId.put(studentIdToName.get(studentIds),studentIds);
        }


        return nameToStudentId; // Placeholder
    }

    public static void main(String[] args) {
        StudentRegistry object = new StudentRegistry();
            Map<Integer,String> studentId = new HashMap<>();
            studentId.put(1,"ahmad");
            studentId.put(2,"Jamal");
            studentId.put(3,"Ali");
            studentId.put(4,"Faisal");
        System.out.println(object.invertMap(studentId));

    }
}