interface DataExporter {
    void exportData();

    default void exportToJSON() {
        System.out.println("Exporting data to JSON (default implementation).");
    }
}

class CSVExporter implements DataExporter {
    public void exportData() {
        System.out.println("Exporting data to CSV format.");
    }
}

class PDFExporter implements DataExporter {
    public void exportData() {
        System.out.println("Exporting data to PDF format.");
    }
}

public class data {
    public static void main(String[] args) {
        DataExporter csv = new CSVExporter();
        DataExporter pdf = new PDFExporter();

        csv.exportData();
        csv.exportToJSON();

        pdf.exportData();
        pdf.exportToJSON();
    }
}
