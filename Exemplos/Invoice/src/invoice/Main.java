
package invoice;

public class Main{
    public static void main(String[] args) {
            Invoice i = new Invoice(123, "Mouse sem fio", 2, 13);
            
        System.out.println("Produto de numero: " + i.getNumero());
        System.out.println("Descrição: " + i.getDescricao());
        System.out.println("Quantidade: " + i.getQuantidade());
        System.out.println("Preço: " + i.getPreco() + "\n");
        System.out.println("Total da fatura: " + i.getInvoiceAmount());
    }
}