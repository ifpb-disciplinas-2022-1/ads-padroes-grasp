package br.edu.ifpb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 10/05/2021, 20:04:51
 */
public class Venda {

    private List<ItemDeVenda> itens = new ArrayList<>();
    private LocalDate criadaEm = LocalDate.now();

    public void pagar(Pagamento pagamento){
        double total = total(); //calculando o total
        pagamento.executar(total); //executando o pagamento
    }
    public double total(){
        return itens.stream()
                .map(ItemDeVenda::calcularSubTotal)
                .reduce(0.0, (item, acumulador) -> item+acumulador);
//        double total = 0;
//        for (ItemDeVenda item:itens){
//            total  += item.calcularSubTotal();
//        }
//        return total;
    }

    public void adicionarItem(int quantidade, Produto produto, double desconto){
        this.itens.add(
                new ItemDeVenda(quantidade, produto, desconto)
        );
    }

//    public void adicionarItem(ItemDeVenda item){
//        this.itens.add(item);
//    }

}

