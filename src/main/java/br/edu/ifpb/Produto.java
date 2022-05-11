package br.edu.ifpb;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 10/05/2021, 19:04:50
 */
public class Produto {

    private final String descricao;
    private double valor;

    public Produto(String descricao, double valor) {
        this.descricao = descricao;
        this.valor =valor;
    }
    public double valor(){
        return this.valor;
    }
}

