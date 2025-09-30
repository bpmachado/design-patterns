package br.com.bpmachado.design.patterns.builder.builder;

import br.com.bpmachado.design.patterns.builder.model.Carro;

public class CarroBuilder {
    private String modelo;
    private String cor;
    private String motor;
    private boolean cambioAutomatico;
    private boolean tetoSolar;

    public CarroBuilder comModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public CarroBuilder comCor(String cor) {
        this.cor = cor;
        return this;
    }

    public CarroBuilder comMotor(String motor) {
        this.motor = motor;
        return this;
    }

    public CarroBuilder comCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
        return this;
    }

    public CarroBuilder comTetoSolar(boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
        return this;
    }

    public Carro build() {
        return new Carro(modelo, cor, motor, cambioAutomatico, tetoSolar);
    }

}
