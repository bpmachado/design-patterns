package br.com.bpmachado.design.patterns.prototype.model;

import br.com.bpmachado.design.patterns.prototype.service.ProdutoService;
import lombok.Data;


public class ProdutoSemLombok implements Cloneable {
        private String nome;
        private String cor;
        private String modelo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    private int armazenamento;
        private int garantia;
        private double preco;

        public ProdutoSemLombok(String nome, String cor, String modelo, int armazenamento, int garantia, double preco) {
            this.nome = nome;
            this.cor = cor;
            this.modelo = modelo;
            this.armazenamento = armazenamento;
            this.garantia = garantia;
            this.preco = preco;
        }

        @Override
        public ProdutoSemLombok clone() {
            return new ProdutoSemLombok(nome, cor, modelo, armazenamento, garantia, preco);
        }

        @Override
        public String toString() {
            return String.format("Produto: %s %s %dGB, Garantia: %d meses, Preço: R$%.2f",
                    nome, cor, armazenamento, garantia, preco);
        }
}
