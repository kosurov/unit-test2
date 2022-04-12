import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class PhoneBookTests {
    @Test
    public void getContactByNumberTest() {
        // arrange
        PhoneBook phoneBook = new PhoneBook();
        Contact user = new Contact("Dwight", "+7 (898) 123-45-67");
        // act
        phoneBook.addContact("Freaks", user);
        Contact result = phoneBook.getContactByNumber("+7 (898) 123-45-67");
        // assert
        assertThat(user, samePropertyValuesAs(result));
    }

    @Test
    public void hasContactInGroupTest() {
        // arrange
        PhoneBook phoneBook = new PhoneBook();
        Contact user = new Contact("Dwight", "+7 (898) 123-45-67");
        // act
        phoneBook.addContact("Freaks", user);
        Set<Contact> group = phoneBook.getGroupOfContacts("Freaks");
        // assert
        assertThat(group, hasItem(user));
    }

    @Test
    public void hasNoContactInGroupTest() {
        // arrange
        PhoneBook phoneBook = new PhoneBook();
        // act
        phoneBook.addGroup("Friends");
        Set<Contact> group = phoneBook.getGroupOfContacts("Friends");
        // assert
        assertThat(group, emptyCollectionOf(Contact.class));
    }
}
