package br.com.bpmachado.design.patterns.builder.controller;

import br.com.bpmachado.design.patterns.builder.builder.CarroBuilder;
import br.com.bpmachado.design.patterns.builder.model.Carro;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carro")
public class CarroController {
    @GetMapping
    public ResponseEntity<String> criarCarro() {
        Carro carro = new CarroBuilder()
                .comModelo("Sedan LX")
                .comCor("Preto")
                .comMotor("2.0 Turbo")
                .comCambioAutomatico(true)
                .comTetoSolar(true)
                .build();
        return ResponseEntity.ok("Carro criado com sucesso: "+ carro);
    }
}
