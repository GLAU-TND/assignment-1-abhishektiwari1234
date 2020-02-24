package LinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        newLinkedList linkedlist1 = new newLinkedList();
        Action tasks = new Action();
        System.out.println("Press 1 to add a new contact");
        System.out.println("Press 2 to view all contacts");
        System.out.println("Press 3 to search for a contact");
        System.out.println("Press 4 to delete a contact");
        System.out.println("Press 5 to exit program ");
        int choice = Integer.parseInt(scanner.nextLine());
        newLinkedList linkedList1 = null;
        if (choice == 1) {
            tasks.addContact(linkedList1);
            choice = Integer.parseInt(scanner.nextLine());
        }
        if (choice == 2) {
            tasks.viewcontact(linkedList1);
            choice = Integer.parseInt(scanner.nextLine());
        }
        if (choice == 3) {
            tasks.searchContact(linkedList1);
            choice = Integer.parseInt(scanner.nextLine());
        }
        if (choice == 4) {
            tasks.deleteContact(linkedList1);
            choice = Integer.parseInt(scanner.nextLine());
        }
        if (choice == 5) {
            System.out.println("App terminate");
        }
    }
}

