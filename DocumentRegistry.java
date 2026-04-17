public class DocumentRegistry {
    private PdfDocument pdfPrototype;
    private TextDocument textDocumentPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        this.pdfPrototype = new PdfDocument();
        this.textDocumentPrototype = new TextDocument();
        this.spreadsheetPrototype = new SpreadsheetDocument();
    }

    public Document createPdfDocument(String fileName, String author, int pageCount) {
        PdfDocument cloned = (PdfDocument) pdfPrototype.clone();
        cloned.setFileName(fileName);
        cloned.setAuthor(author);
        cloned.setPageCount(pageCount);
        return cloned;
    }

    public Document createTextDocument(String filePath, String encoding, int wordCount) {
        TextDocument cloned = (TextDocument) textDocumentPrototype.clone();
        cloned.setFilePath(filePath);
        cloned.setEncoding(encoding);
        cloned.setWordCount(wordCount);
        return cloned;
    }

    public Document createSpreadsheetDocument(String spreadsheetName, int rowCount, int columnCount) {
        SpreadsheetDocument cloned = (SpreadsheetDocument) spreadsheetPrototype.clone();
        cloned.setSpreadsheetName(spreadsheetName);
        cloned.setRowCount(rowCount);
        cloned.setColumnCount(columnCount);
        return cloned;
    }
}