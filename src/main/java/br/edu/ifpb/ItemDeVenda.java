package br.edu.ifpb;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 10/05/2021, 19:04:27
 */
public class ItemDeVenda {

    private final Produto produto;
    private final int quantidade;
    private final double desconto;
    public ItemDeVenda(int quantidade, Produto produto, double desconto) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }

    public double calcularSubTotal(){
        double valor = this.produto().valor();
        double desconto = this.desconto();
        int quantidade = this.quantidade();
        return valor * quantidade - desconto;
    }

    public Produto produto(){
        return this.produto;
    }
    public int quantidade(){
        return this.quantidade;
    }
    public double desconto() {
        return this.desconto;
    }
}
