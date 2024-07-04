public class VeryGoodPrinter implements SimplePrinter, Scanner, Fax {
    public void printDocument(String document) {
        System.out.println("Printing: " + document);
    }
    public void scanDocument(String document) {
        System.out.println("Scanning: " + document);
    }
    public void faxDocument(String document) {
        System.out.println("Sending fax: " + document);
    }
}
