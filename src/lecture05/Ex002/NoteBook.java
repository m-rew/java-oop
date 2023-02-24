package lecture05.Ex002;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {
    public List<Contact> noteBook;

    public NoteBook() {
        this.noteBook = new ArrayList<Contact>();
    }

    public void addContact(String title, String phoneNumber) {
        this.noteBook.add(new Contact(title, phoneNumber));
    }

    public void delContact() {

    }

    public String getContactAll() {
        if (this.noteBook.size() == 0) {
            return "Пусто\n";
        }

        String result = "";

        for (Contact contact: noteBook) {
            result += noteBook.indexOf(contact) + ". " + contact.getTitle() + ": " + contact.getPhoneNumber() + "\n";
        }

        return result;
    }
}
