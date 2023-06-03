package homework.homework17;
import java.util.List;

public class Document {
   private String email;
   private String phoneNumber;
   private List<String> documents;

    public Document(String email, String phoneNumber, List<String> documents) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.documents = documents;
    }

    public Document() {

    }

    public void setDocuments(List<String> documents) {
        this.documents = documents;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<String> getDocument() {
        return documents;
    }

    @Override
    public String toString() {
        return "Document{" +
                "email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", document=" + documents +
                '}';
    }
}
