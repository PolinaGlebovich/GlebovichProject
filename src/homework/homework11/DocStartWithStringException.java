package homework.homework11;

public class DocStartWithStringException extends Exception {
    private String document;

    public DocStartWithStringException(String messageStartWith, String document) {
        super(messageStartWith);
        this.document = document;
    }

    public String getDocument() {
        return document;
    }
}
