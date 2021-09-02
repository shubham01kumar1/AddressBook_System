package Service;

import Model.Address;
import Utility.Utility;
import java.util.ArrayList;

public class AddressBookService {
    private static ArrayList<Address> addressBookModel = new ArrayList<>();

    // Add contact to addressbook
    public void addPerson() {

        Address person = new Address();

        System.out.println("Enter Your First Name");
        person.setFirstName(Utility.readString());

        System.out.println("Enter Your Last Name");
        person.setLastName(Utility.readString());

        System.out.println("Enter Your city Name");
        person.setCity(Utility.readString());

        System.out.println("Enter Your state Name");
        person.setState(Utility.readString());

        System.out.println("Enter Your phone Number");
        person.setPhoneNo( Utility.readLong() );

        System.out.println("Enter Your zip");
        person.setZip(Utility.readInteger());

        System.out.println("Enter Your email");
        person.setEmail(Utility.readString());

        addressBookModel.add(person);
    }

    //printing all contacts
    public void print(){
        for( Address items:addressBookModel){
            System.out.println(items);;
        }
    }

}