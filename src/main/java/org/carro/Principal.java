package org.carro;

public class Principal {

    public static void main(String[] args) {

        Corrida corridaDaAmizade = new Corrida(2000);
        corridaDaAmizade.adicionaCarro(new CarroSoma(10, 110, "Pálio"));
        corridaDaAmizade.adicionaCarro(new CarroSoma(8, 140, "Saveiro"));
        corridaDaAmizade.adicionaCarro(new CarroMult(1.7, 100, "Captiva"));
        corridaDaAmizade.adicionaCarro(new CarroMult(1.4, 120, "Punto"));
        corridaDaAmizade.umDoisTresEJa();
    }
}