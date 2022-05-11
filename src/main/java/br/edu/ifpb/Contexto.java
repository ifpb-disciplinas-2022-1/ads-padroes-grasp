package br.edu.ifpb;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 10/05/2021, 19:11:20
 */
public class Contexto {
    private final Venda venda;
    private Pagamento pagamento;

    public Contexto(Venda venda) {
        this.venda = venda;
    }

    public void finalizarVenda(){
        pagamento = new Pagamento(); //tipo de pagamento
        venda.pagar(pagamento);
    }
   public void registrarItem(int quantidade, Produto produto){
        venda.adicionarItem(quantidade, produto, 0);
   }
    //iniciarVenda()
    //registrarItem(produto, quantidade)
    //pagar(quantia)
}
