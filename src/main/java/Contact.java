import java.util.Objects;

public class Contact {
    private final String name;
    private final String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(phoneNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Contact other = (Contact) obj;
        return phoneNumber.equals(other.getPhoneNumber());

    }

    @Override
    public String toString() {
        return name + " | " + phoneNumber;
    }
}
