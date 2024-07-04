//ISP (Interface Segregation Principle)
//Classe de Impressora: Dada uma interface Impressora com métodos
//imprimirDocumento, escaneiarDocumento, faxearDocumento,
//crie interfaces mais específicas para cada funcionalidade.
public interface Printer {
    void printDocument(String document);
    void scanDocument(String document);
    void faxDocument(String document);
}