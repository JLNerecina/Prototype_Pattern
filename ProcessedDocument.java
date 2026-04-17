public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        Document pdfDoc1 = registry.createPdfDocument("annual_report_2024.pdf", "Acme Corp", 150);
        pdfDoc1.open();
        pdfDoc1.printDetails();

        Document textDoc = registry.createTextDocument("meeting_notes.txt", "UTF-8", 250);
        textDoc.open();
        textDoc.printDetails();

        Document spreadDoc = registry.createSpreadsheetDocument("sales_data_q1.xlsx", 1000, 20);
        spreadDoc.open();
        spreadDoc.printDetails();

        Document pdfDoc2 = registry.createPdfDocument("summary_report.pdf", "Acme Corp", 30);
        pdfDoc2.open();
    }
}