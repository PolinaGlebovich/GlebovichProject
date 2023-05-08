package homework.homework11;

public class DocEndWithStringException extends Exception {
    private String document;

    public DocEndWithStringException(String messageEndWith, String document) {
        super(messageEndWith);
        this.document = document;
    }

    public String getDocument() {
        return document;
    }


}
