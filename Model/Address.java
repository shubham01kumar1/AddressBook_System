package Model;

import java.util.ArrayList;

public class Address extends ArrayList<Address> {
    //declaring all fields required of a contacts in AddressBook
    private String firstName;
    private String lastName;
    private long phoneNo;
    private int zip;
    private String city;
    private String state;
    private String email;

    //default Constructor
    public Address() {
    }
    //parameterized constructor
    public Address(String firstName, String lastName, long phoneNo, int zip, String city, String state, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        this.zip = zip;
        this.city = city;
        this.state = state;
        this.email = email;
    }

    //getters and setters to set values and retrieve values
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public double getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Address{" +
                "firstName='" + firstName + '\'' +
                ", lastNAme='" + lastName + '\'' +
                ", phoneNo=" + phoneNo +
                ", zip=" + zip +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
