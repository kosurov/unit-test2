public class Main {

    public static void main(String[] args) {
        Contact contact1 = new Contact("Леха", "88124962233");
        Contact contact2 = new Contact("Саня", "88124962289");
        Contact contact3 = new Contact("Варвара", "896623456278");
        Contact contact4 = new Contact("Маша", "89056678432");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addGroup("Друзья");
        phoneBook.addGroup("Работа");

        phoneBook.addContact("Друзья", contact1);
        phoneBook.addContact("Друзья", contact3);
        phoneBook.addContact("Работа", contact1);
        phoneBook.addContact("Работа", contact2);
        phoneBook.addContact("Работа", contact3);
        phoneBook.addContact("Работа", contact4);


        System.out.println(phoneBook.getGroupOfContacts("Друзья"));

        System.out.println(phoneBook.getContactByNumber("896623456278"));
    }
}
