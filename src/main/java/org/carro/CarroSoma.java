package org.carro;

public class CarroSoma extends CarroDeCorrida {

    public int potencia;

    public CarroSoma(int potencia, int velocidadeMaxima, String nome) {
        super(velocidadeMaxima, nome);
        this.potencia = potencia;
    }

    @Override
    public void acelerar() {
        velocidade += potencia;
        if (velocidade > velocidadeMaxima)
            velocidade = velocidadeMaxima;
    }

}
