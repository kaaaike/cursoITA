package org.pizzaria;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Pizza> pizzas;
    double total = 0;

    public CarrinhoDeCompras() {
        this.pizzas = new ArrayList<>();
        this.total = 0;
    }
    public void adicionarPizza(Pizza pizza) {
        // Verifica se a pizza tem ingredientes antes de adicioná-la ao carrinho
        if (pizza.getQuantidadeIngredientes() > 0) {
            pizzas.add(pizza);
        } else {
            System.out.println("Não é possível adicionar uma pizza sem ingredientes ao carrinho.");
        }
    }

    public double getValorTotal() {
        for (Pizza pizza : pizzas) {
            total += pizza.getPreco();
        }
        return total;
    }
}
