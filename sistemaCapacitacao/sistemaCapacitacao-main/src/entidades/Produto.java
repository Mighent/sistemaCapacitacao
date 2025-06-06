package entidades;

public class Produto {

        private String nome;
        private double preco;
        private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuatidade() {
        return quantidade;
    }

    public void setQuatidade(int quatidade) {
        this.quantidade = quatidade;
    }
    public double TotalValueInStock(){
        double total = getQuatidade() * getPreco();
        return (total);
    }
    public void AddProducts(int quantidade){
        this.quantidade += quantidade;
        mostrarInformacao();
    }
    public void RemoveProducts(int quantidade){
        this.quantidade -= quantidade;
        mostrarInformacao();
    }
    public void mostrarInformacao(){
        System.out.println("Nome: "+ getNome()+ "Preço: "+ getPreco()+ "Quantidade: "+ getQuatidade()+ "Total"+ TotalValueInStock());
    }
    public Produto(String nome, double preco, int quantidade){
        this.quantidade = quantidade;
        this.preco = preco;
        this.nome = nome;
    }
    public String toString(){
        return nome
                +", $"
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + "units, Total: $ "
                + String.format("%.2f", TotalValueInStock());
    }
}
