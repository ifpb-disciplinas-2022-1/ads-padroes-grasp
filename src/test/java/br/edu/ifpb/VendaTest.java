package br.edu.ifpb;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VendaTest {
    
    @Test
    public void testVerificarTotal() {
        Venda venda = new Venda();
        double esperado = 10.0;
        Produto produto = new Produto("Café", 10.0);
        venda.adicionarItem(1,produto, 0);
        double resultado = venda.total();
        assertEquals(esperado, resultado, 0.0001);
    }
//    @Test
//    public void testVerificarTotal() {
//        Venda venda = new Venda();
//        double esperado = 10.0;
//        Produto produto = new Produto("Café", 10.0);
//        venda.adicionarItem(
//                new ItemDeVenda(
//                1,produto, 0
//                )
//        );
//        double resultado = venda.total();
//        assertEquals(esperado, resultado, 0.0001);
//    }
}
