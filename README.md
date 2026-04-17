# Document Prototype Design Pattern

**Implementation of the Prototype Design Pattern in Java**

This repository demonstrates the **Prototype Design Pattern** by implementing the exact class diagram provided in the original task.

## 📋 Task Implemented

The program creates a **Document Registry** that holds three prototype objects:
- `PdfDocument`
- `TextDocument`
- `SpreadsheetDocument`

Instead of using `new` to create each document (which would be expensive in real scenarios), the registry **clones** these prototypes and customizes the clones with specific data.

The implementation produces **exactly** the following console output:

```
Creating a PDF Document prototype.          //Executed in the constructor
Creating a Text Document prototype.         //Executed in the constructor
Creating a Spreadsheet Document prototype.  //Executed in the constructor

Opening PDF Document: annual_report_2024.pdf by Acme Corp (150 pages)
Type: PDF, File: annual_report_2024.pdf, Author: Acme Corp, Pages: 150

Opening Text Document: meeting_notes.txt with encoding: UTF-8 (250 words)
Type: Text, Path: meeting_notes.txt, Encoding: UTF-8, Words: 250

Opening Spreadsheet Document: sales_data_q1.xlsx (1000 rows, 20 columns)
Type: Spreadsheet, Name: sales_data_q1.xlsx, Rows: 1000, Columns: 20

Opening PDF Document: summary_report.pdf by Acme Corp (30 pages)
```

## 🧬 Design Pattern Explained

The **Prototype Pattern** is used when creating new objects is costly or complex.  
Instead of creating objects from scratch, we:
1. Create a set of **prototype** objects once (in the constructor of `DocumentRegistry`)
2. **Clone** them whenever we need a new instance
3. Customize only the cloned copy

**Key Benefits Demonstrated:**
- Fast object creation through cloning
- Clean separation between prototype creation and usage
- Easy extension (adding new document types requires minimal changes)
- No tight coupling to concrete classes

## 📁 Project Structure

```
document-prototype-laboratory/
├── ProcessedDocument.java      ← Main class (entry point)
├── DocumentRegistry.java       ← Manages prototypes and cloning
├── Document.java               ← Common interface for all documents
├── PdfDocument.java
├── TextDocument.java
├── SpreadsheetDocument.java
└── README.md
```

## 🚀 How to Run

```bash
javac *.java
java ProcessedDocument
```

The program will display the exact output shown above.

---

**Simple, clean, and fully functional implementation of the Prototype Design Pattern.**  
Perfect for learning, interviews, or reference.  
Star ⭐ if it helped you understand the pattern!
