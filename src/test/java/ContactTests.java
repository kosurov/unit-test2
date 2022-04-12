import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ContactTests {
    Contact sut1;

    @BeforeEach
    public void initialize() {
        sut1 = new Contact("Dwight", "+7 (898) 123-45-67");
    }

    @Test
    public void getPhoneNumberTest() {
        String expected = "+7 (898) 123-45-67";
        assertThat(sut1.getPhoneNumber(), equalTo(expected));
    }

    @Test
    public void equalsFalseTest() {
        Contact sut2 = new Contact("Jim", "+7 (989) 555-66-77");
        assertThat(sut1, not(samePropertyValuesAs(sut2)));
    }

    @Test
    public void equalsTrueTest() {
        Contact sut2 = new Contact("Dwight", "+7 (898) 123-45-67");
        assertThat(sut1, samePropertyValuesAs(sut2));
    }

    @Test
    public void toStringReturnsRequiredStringTest() {
        String str = "Dwight | +7 (898) 123-45-67";
        assertThat(sut1, hasToString(str));
    }

    @Test
    public void hasPropertyPhoneNumberTest() {
        assertThat(sut1, hasProperty("phoneNumber"));
    }
}
