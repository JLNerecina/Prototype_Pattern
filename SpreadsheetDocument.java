public class SpreadsheetDocument implements Document {
    private String spreadsheetName;
    private int rowCount;
    private int columnCount;

    public SpreadsheetDocument() {
        System.out.println("Creating a Spreadsheet Document prototype.");
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
        System.out.println("Opening Spreadsheet Document: " + spreadsheetName + " (" + rowCount + " rows, " + columnCount + " columns)");
    }

    @Override
    public String getType() {
        return "Spreadsheet";
    }

    @Override
    public void printDetails() {
        System.out.println("Type: Spreadsheet, Name: " + spreadsheetName + ", Rows: " + rowCount + ", Columns: " + columnCount);
    }

    public void setSpreadsheetName(String spreadsheetName) {
        this.spreadsheetName = spreadsheetName;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }
}