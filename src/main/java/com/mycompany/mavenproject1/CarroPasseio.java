package com.mycompany.mavenproject1;

public class CarroPasseio extends Veiculo {

    private String cor;
    private String Modelo;

    public CarroPasseio(String cor, String Modelo, int peso, int VelocMax, float Preco) {
        super(peso, VelocMax, Preco);
        this.cor = cor;
        this.Modelo = Modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

}
