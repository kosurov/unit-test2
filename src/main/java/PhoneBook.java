import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

    private Map<String, Set<Contact>> groupsOfContacts = new HashMap<>();

    public void addGroup(String groupName) {
        if (groupsOfContacts.containsKey(groupName)) {
            System.out.println("Такая группа уже существует!");
        } else {
            groupsOfContacts.put(groupName, new HashSet<>());
        }
    }

    public void addContact(String groupName, Contact contact) {
        Set<Contact> group;
        if (groupsOfContacts.containsKey(groupName)) {
            group = groupsOfContacts.get(groupName);
        } else {
            group = new HashSet<>();
        }
        group.add(contact);
        groupsOfContacts.put(groupName, group);
    }

    public Set<Contact> getGroupOfContacts(String groupName) {
        return groupsOfContacts.get(groupName);
    }

    public Contact getContactByNumber(String phoneNumber) {
        Map<String, Contact> allContacts = new HashMap<>();
        for (Set<Contact> group : groupsOfContacts.values()) {
            for (Contact contact : group) {
                allContacts.put(contact.getPhoneNumber(), contact);
            }
        }
        return allContacts.get(phoneNumber);
    }
}
