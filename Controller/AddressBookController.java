package Controller;

import Service.AddressBookService;
import Utility.Utility;

public class AddressBookController {

    public static void main(String[] args) {
        AddressBookController main = new AddressBookController();
        main.showUserMenu();

        System.out.println("Good Bye");
    }

    public void showUserMenu(){
        AddressBookService service = new AddressBookService(); //service class instance to access service methods
        service.dummyAddCont(); //calling this method to add a dummy contact whose details are predefined.

        boolean exit = false;

        while(!exit) {

            System.out.println("Enter your Choice:\n 1.Add contact\n 2.Edit an existing contact" +
                    "\n 3.Delete a contact \n 4.Get all Contact list\n 5.Exit");

            int choice = Utility.readInteger();
            switch (choice) {
                case 1:
                    service.addPerson();
                    System.out.println(" person added successfully ");
                    break;
                case 2:
                    service.editContact();
                    break;
                case 3:
                    service.deleteContact();
                    break;
                case 4:
                    service.print();
                    break;
                case 5 :
                    exit=true;
                    break;
                default:
                    System.out.println("Enter valid value, plz enter again");
                    break;
            }
        }
    }

}