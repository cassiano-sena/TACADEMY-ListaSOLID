//OCP (Open/Closed Principle)
//Sistema de Descontos: Implemente uma classe Pedido que aplica um desconto
//baseado na categoria do cliente (por exemplo, estudante, idoso).
//Use herança e polimorfismo para permitir que novos tipos de descontos sejam
//adicionados sem modificar a classe Pedido.
// Base class for discount
public abstract class Discount {
    public abstract double applyDiscount(double amount);
}

