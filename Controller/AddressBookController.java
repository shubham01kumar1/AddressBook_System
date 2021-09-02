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
            System.out.println("Enter your Choice:\n 1.Add Person\n 2.Get all Conatacts\n 3.Exit");
            int choice = Utility.readInteger();
            switch (choice) {
                case 1:
                    service.addPerson();
                    System.out.println("person added sucessfully");
                    break;
                case 2:
                    service.print();
                    break;
                case 3 :
                    exit=true;
                    break;
                default:
                    System.out.println("Enter valid value");
                    break;
            }
        }
    }

}