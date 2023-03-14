package com.mycompany.mavenproject1;

public class Caminhao extends Veiculo{
    
    private float Toneladas; //carga máxima
    private int AlturaMax;
    private int Comprimento; 

    public Caminhao(float Toneladas, int AlturaMax, int Comprimento, int peso, int VelocMax, float Preco) {
        super(peso, VelocMax, Preco);
        this.Toneladas = Toneladas;
        this.AlturaMax = AlturaMax;
        this.Comprimento = Comprimento;
    }

    public float getToneladas() {
        return Toneladas;
    }

    public int getAlturaMax() {
        return AlturaMax;
    }

    public int getComprimento() {
        return Comprimento;
    }

    public void setToneladas(float Toneladas) {
        this.Toneladas = Toneladas;
    }

    public void setAlturaMax(int AlturaMax) {
        this.AlturaMax = AlturaMax;
    }

    public void setComprimento(int Comprimento) {
        this.Comprimento = Comprimento;
    }
    
}
