package org.pizzaria;

import java.util.HashMap;

public class Pizza {

    private String ingrediente;
    private static HashMap<String, Integer> ingredientes = new HashMap<>();

    public void adicionaIngrediente(String ingrediente) {
        contabilizaIngrediente(ingrediente);
    }

    public void contabilizaIngrediente(String ingrediente) {
        ingredientes.put(ingrediente, ingredientes.getOrDefault(ingrediente, 0) + 1);
    }

    public static HashMap<String, Integer> getIngredientes() {
        return new HashMap<>(ingredientes);
    }

    public static int getQuantidadeIngredientes() {
        return ingredientes.values().stream().mapToInt(Integer::intValue).sum();
    }

    public int getPreco(){
        int totalIngredientes = ingredientes.values().stream().mapToInt(Integer::intValue).sum();

        if (totalIngredientes <= 2){
            return 15;
        } else if (totalIngredientes >= 3 && totalIngredientes <= 5){
            return 20;
        } else {
            return 23;
        }
    }
}
