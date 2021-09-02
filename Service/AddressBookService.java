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
            System.out.println(items);
        }
    }

    //get specific contact with their first name from AddressBook
    private Address getContact(String name) {

        for (Address person : addressBookModel) {
            if (person.getFirstName().equals(name)) {
                return person;
            }
            else {
                System.out.println("Invalid name or no contact exist with this first name");
            }

        }
        return null;
    }


    //editing an existing contact
    public void editContact() {

        System.out.print("\nEnter the first name of contact you want to edit the details for : ");
        String fName = Utility.readString();
        Address person=getContact(fName);
        if (person != null) {


            boolean exit = false;

            while (!exit) {

                System.out.println("Enter your edit option for "+fName+" : ");
                System.out.println("1 for First Name");
                System.out.println("2 for Last Name");
                System.out.println("3 for City");
                System.out.println("4 for State");
                System.out.println("5 for Zip");
                System.out.println("6 for Phone Number");
                System.out.println("7 for Email");
                System.out.println("8 for Exit");

                int editOption = Utility.readInteger();

                switch (editOption) {

                    case 1:
                        System.out.println("Enter new First Name");
                        String nFirstName = Utility.readString();
                        person.setFirstName(nFirstName);
                        break;

                    case 2:
                        System.out.println("Enter new Last Name: ");
                        String nLastName = Utility.readString();
                        person.setLastName(nLastName);
                        break;

                    case 3:
                        System.out.println("Enter new City: ");
                        String nCity = Utility.readString();
                        person.setCity(nCity);
                        break;
                    case 4:
                        System.out.println("Enter new State: ");
                        String nState = Utility.readString();
                        person.setState(nState);
                        break;
                    case 5:
                        System.out.println("Enter new Zip: ");
                        int nZip = Utility.readInteger();
                        person.setZip(nZip);
                        break;
                    case 6:
                        System.out.println("Enter new Phone Number: ");
                        long nPhone = Utility.readLong();
                        person.setPhoneNo(nPhone);
                        break;
                    case 7:
                        System.out.println("Enter new Email: ");
                        String nEmail = Utility.readString();
                        person.setEmail(nEmail);
                        break;
                    case 8:
                        exit=true;
                        break;
                    default:
                        System.out.println("Invalid Input, plz choose from above options");
                }
            }
        }
    }

}