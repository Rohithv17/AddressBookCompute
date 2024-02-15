import com.bridgelabz.addressbookprob.ContactList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ContactList contact1 = new ContactList("Rohith", "Venkatesh", "123 Main Street", "Chennai", "Tamilnadu", "12345", "97865", "rohith123@gmail.com");
        ContactList contact2 = new ContactList("Rahul", "Vignesh", "3rd Main Street", "Salem", "Karnataka", "77980", "76667", "rv1246@email.com");
        contact1.displayContact();
        contact2.displayContact();
        }
    }
