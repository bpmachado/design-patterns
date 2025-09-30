package br.com.bpmachado.design.patterns.prototype.model;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Builder(toBuilder = true)
@Data
public class Produto{
    private String nome;
    private String cor;
    private String modelo;
    private int armazenamento;
    private int garantia;
    private double preco;

    public Produto(String nome, String cor, String modelo, int armazenamento, int garantia, double preco) {
        this.nome = nome;
        this.cor = cor;
        this.modelo = modelo;
        this.armazenamento = armazenamento;
        this.garantia = garantia;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("Produto: %s %s %dGB, Garantia: %d meses, Preço: R$%.2f",
                nome, cor, armazenamento, garantia, preco);
    }
}
