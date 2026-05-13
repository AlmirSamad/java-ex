package ArrayELista;

public class ProdutoTeste {
    private String nome;
    private double price;
    private int estoque;


    public ProdutoTeste(String nome, double price) {
        this.nome = nome;
        this.price = price;
    }

    public String getNome() {
        return nome;
    }

    public double getPrice() {
        return price;
    }

    public int getEstoque() {
        return estoque;
    }

    @Override
    public String toString() {
        return "ProdutoTeste{" +
                "nome='" + nome + '\'' +
                ", price=" + price +
                ", estoque=" + estoque +
                '}';
    }
}
