package br.com.bpmachado.design.patterns.builder.model;

public class Carro {
    private String modelo;
    private String cor;
    private String motor;
    private boolean cambioAutomatico;
    private boolean tetoSolar;

    public Carro(String modelo, String cor, String motor, boolean cambioAutomatico, boolean tetoSolar) {
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
        this.cambioAutomatico = cambioAutomatico;
        this.tetoSolar = tetoSolar;
    }

    @Override
    public String toString() {
        return String.format("Carro: %s, Cor: %s, Motor: %s, Câmbio: %s, Teto Solar: %s",
                modelo, cor, motor,
                cambioAutomatico ? "Automático" : "Manual",
                tetoSolar ? "Sim" : "Não");
    }
}
