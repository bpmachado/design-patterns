package br.com.bpmachado.design.patterns.controller;

import br.com.bpmachado.design.patterns.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
@RequiredArgsConstructor
public class PedidoController {

    private final PedidoService pedidoService;

    @GetMapping
    public ResponseEntity<String> pedir(@RequestParam String estilo) {
        String resultado = pedidoService.realizarPedido(estilo);
        return ResponseEntity.ok(resultado);
    }
}
