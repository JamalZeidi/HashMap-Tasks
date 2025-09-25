import java.util.HashMap;
import java.util.Map;

class PhoneBook {
    private Map<String, String> contacts = new HashMap<>();

    public PhoneBook() {
        contacts.put("Alice", "555-1111");
        contacts.put("Bob", "555-2222");
    }

    /**
     * TO-DO: Remove the contact only if the name and number match.
     \*
     * @param name The name of the contact to remove.
     * @param number The phone number that must match for the removal to happen.
     * @return true if the contact was removed, false otherwise.
     */
    public boolean removeContact(String name, String number) {
        // Your code here. Use the remove(key, value) method.
       if(getContacts().keySet().contains(name) && getContacts().values().contains(number)){
           getContacts().remove(name,number);
           return true;
        }
        return false; // Placeholder
    }

    public Map<String, String> getContacts() {
        return contacts;
    }

    public static void main(String[] args) {
        PhoneBook ob = new PhoneBook();
        System.out.println("Before Deletion : "+ob.getContacts());
        System.out.println(ob.removeContact("Bob","555-2222"));
        System.out.println("After Deletion : " + ob.getContacts());
    }
}