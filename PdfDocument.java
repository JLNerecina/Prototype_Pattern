public class PdfDocument implements Document {
    private String fileName;
    private String author;
    private int pageCount;

    public PdfDocument() {
        System.out.println("Creating a PDF Document prototype.");
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
        System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
    }

    @Override
    public String getType() {
        return "PDF";
    }

    @Override
    public void printDetails() {
        System.out.println("Type: PDF, File: " + fileName + ", Author: " + author + ", Pages: " + pageCount);
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}