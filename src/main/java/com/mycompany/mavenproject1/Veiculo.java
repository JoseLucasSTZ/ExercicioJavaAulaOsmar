package com.mycompany.mavenproject1;

public class Veiculo {

    private int peso; //Em quilos
    private int VelocMax; //km/h
    private float Preco;

    public Veiculo(int peso, int VelocMax, float Preco) {
        this.peso = peso;
        this.VelocMax = VelocMax;
        this.Preco = Preco;
    }

    public int getPeso() {
        return peso;
    }

    public int getVelocMax() {
        return VelocMax;
    }

    public float getPreco() {
        return Preco;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setVelocMax(int VelocMax) {
        this.VelocMax = VelocMax;
    }

    public void setPreco(float Preco) {
        this.Preco = Preco;
    }

}
