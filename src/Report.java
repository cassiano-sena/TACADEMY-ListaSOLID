//SRP (Single Responsibility Principle
//Classe de Relatório: Crie uma classe Relatorio que gera relatórios de vendas e também
//os imprime.
//Refatore a classe para seguir o SRP, separando a lógica de geração e impressão do
//relatório.
// Report class not following SRP
public class Report {
    public void generateSalesReport() {
        System.out.println("Generating sales report...");
    }
    public void printReport() {
        System.out.println("Printing report...");
    }
}

