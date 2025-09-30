package br.com.bpmachado.design.patterns.product;

public class Margherita implements Pizza {
    @Override
    public String preparar() {
        return "Pizza Margherita com molho de tomate e manjericão";
    }
}
