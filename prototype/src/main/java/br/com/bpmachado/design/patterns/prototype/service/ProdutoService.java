package br.com.bpmachado.design.patterns.prototype.service;

import br.com.bpmachado.design.patterns.prototype.model.Produto;
import br.com.bpmachado.design.patterns.prototype.model.ProdutoSemLombok;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {



    public Produto criarVariante(String cor, int armazenamento) {

        Produto produto = Produto.builder()
                .nome("Smartphone X")
                .cor("Preto")
                .modelo("X2025")
                .armazenamento(128)
                .garantia(12)
                .preco(2999.90)
                .build();

        Produto variante = produto.toBuilder()
                            .cor(cor)
                            .armazenamento(armazenamento)
                            .build();

        return variante;
    }

    public ProdutoSemLombok criarVarianteSemLombok(String cor, int armazenamento) {

        ProdutoSemLombok produtoSemLombok = new ProdutoSemLombok("Smartphone X", "Preto", "X2025", 128, 12, 2999.90);

        ProdutoSemLombok variante = produtoSemLombok.clone();

        variante.setCor(cor);
        variante.setArmazenamento(armazenamento);

        return variante;
    }


}
