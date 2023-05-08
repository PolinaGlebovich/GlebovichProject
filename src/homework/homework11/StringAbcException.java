package homework.homework11;

public class StringAbcException extends Exception {
    private String document;

    public StringAbcException(String messageAbc, String document) {
        super(messageAbc);
        this.document = document;
    }

    public String getDocument() {
        return document;
    }
}
