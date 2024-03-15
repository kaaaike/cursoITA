package org.pizzaria;

import java.util.HashMap;
import java.util.Map;

public class Principal {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("Queijo");
        pizza1.adicionaIngrediente("Tomate");
        System.out.println("Ingredientes da Pizza 1: " + pizza1.getIngredientes());

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        System.out.println("Valor total do carrinho: R$" + carrinho.getValorTotal());

        System.out.println("Quantidade utilizada de cada ingrediente:");
        HashMap<String, Integer> ingredientesGastos = Pizza.getIngredientes();
        for (Map.Entry<String, Integer> entry : ingredientesGastos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
