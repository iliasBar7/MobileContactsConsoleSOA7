package gr.aueb.cf.mobilecontacts.model;

import java.util.Objects;

public class MobileContact extends AbstractEntity {
    private String firstname;
    private String lastname;
    private String phoneNumber;

    public MobileContact(String firstname, String lastname, String phoneNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Firstname: " + firstname + "," + "Lastname " + lastname + "," + "PhoneNumber " + "," + phoneNumber;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
//        if (!(other instanceof MobileContact that)) return false;
//        MobileContact that = (MobileContact) other;
        // in Java17 το παρακατω κανει δυο πραγματα
        //ελεγχο αν ειναι Instanceof και αν ναι μετα κανει
        //typecast (οπως καναμε πριν την Java 17 με τον παραπανω κωδικα
       if (!(other instanceof MobileContact that)) return false;
        return Objects.equals(getFirstname(), that.getFirstname()) && Objects.equals(getLastname(),
                that.getLastname()) && Objects.equals(getPhoneNumber(), that.getPhoneNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstname(), getLastname(), getPhoneNumber());
    }
}
