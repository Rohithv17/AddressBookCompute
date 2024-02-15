package com.bridgelabz.addressbookprob;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<ContactList> contacts = new ArrayList<>();
    public Scanner scanner = new Scanner(System.in);
    public void addContactFromConsole() {
        System.out.println("Enter Additional contact details");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.print("State: ");
        String state = scanner.nextLine();
        System.out.print("ZIP Code: ");
        String zip = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        ContactList newContact = new ContactList(firstName, lastName, address, city, state, zip, phoneNumber, email);
        contacts.add(newContact);
    }
    public void displayContacts(){
        for(ContactList contact : contacts){
            contact.displayContact();
            System.out.println();
        }}
}
