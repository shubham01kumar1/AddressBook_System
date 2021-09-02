package Controller;

import Service.AddressBookService;
import Utility.Utility;

public class AddressBookController {

    public static void main(String[] args) {
        AddressBookController main = new AddressBookController();
        main.showUserManu();

        System.out.println("Good Bye");
    }

    public void showUserManu(){
        AddressBookService service = new AddressBookService();

        boolean exit = false;

        while(!exit) {
            System.out.println("Enter your Choice:\n 1.Add contact\n 2.Edit an existing contact\n 3.Get all Contact list\n 4.Exit");
            int choice = Utility.readInteger();
            switch (choice) {
                case 1:
                    service.addPerson();
                    System.out.println(" person added sucessfully ");
                    break;
                case 2:
                    service.editContact();
                    break;
                case 3:
                    service.print();
                    break;
                case 4 :
                    exit=true;
                    break;
                default:
                    System.out.println("Enter valid value, plz enter again");
                    break;
            }
        }
    }

}