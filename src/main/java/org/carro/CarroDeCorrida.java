package org.carro;

public abstract class CarroDeCorrida {

    public int velocidade;
    public int velocidadeMaxima;
    public String nome;

    public CarroDeCorrida(int velocidadeMaxima, String nome) {
        this.velocidade = 0;
        this.velocidadeMaxima = velocidadeMaxima;
        this.nome = nome;
    }

    public abstract void acelerar();

    public void frear() {
        velocidade = velocidade /2;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public String getNome() {
        return nome;
    }
}
