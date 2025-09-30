package br.com.bpmachado.design.patterns.prototype.controller;

import br.com.bpmachado.design.patterns.prototype.model.Produto;
import br.com.bpmachado.design.patterns.prototype.model.ProdutoSemLombok;
import br.com.bpmachado.design.patterns.prototype.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;

    @GetMapping("/variante")
    public ResponseEntity<String> gerarVariante(@RequestParam String cor,
                                                @RequestParam int armazenamento) {
        Produto variante = produtoService.criarVariante(cor, armazenamento);
        return ResponseEntity.ok(variante.toString());
    }

    @GetMapping("/varianteSemLombok")
    public ResponseEntity<String> gerarVarianteSemlombok(@RequestParam String cor,
                                                @RequestParam int armazenamento) {
        ProdutoSemLombok variante = produtoService.criarVarianteSemLombok(cor, armazenamento);
        return ResponseEntity.ok(variante.toString());
    }

}
