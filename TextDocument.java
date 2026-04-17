public class TextDocument implements Document {
    private String filePath;
    private String encoding;
    private int wordCount;

    public TextDocument() {
        System.out.println("Creating a Text Document prototype.");
    }

    @Override
    public Document clone() {
        try {
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported", e);
        }
    }

    @Override
    public void open() {
        System.out.println("Opening Text Document: " + filePath + " with encoding: " + encoding + " (" + wordCount + " words)");
    }

    @Override
    public String getType() {
        return "Text";
    }

    @Override
    public void printDetails() {
        System.out.println("Type: Text, Path: " + filePath + ", Encoding: " + encoding + ", Words: " + wordCount);
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }
}