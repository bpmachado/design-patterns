package br.com.bpmachado.design.patterns.service;

import br.com.bpmachado.design.patterns.factory.PizzariaFactory;
import br.com.bpmachado.design.patterns.product.Pizza;
import br.com.bpmachado.design.patterns.product.Sobremesa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@RequiredArgsConstructor
@Service
public class PedidoService {
    private final Map<String, PizzariaFactory> pizzariaFactoryMap;

    public String realizarPedido(String estilo){
        PizzariaFactory pizzariaFactory = pizzariaFactoryMap.get(estilo);

        if(pizzariaFactory == null){
            throw new RuntimeException("Estilo de Pizza não encontrado!");
        }

        Pizza pizza = pizzariaFactory.criarPizza();
        Sobremesa sobremesa = pizzariaFactory.criarSobremesa();

        return String.format(
                "Pedido realizado com sucesso!\n\nPizza: %s\nSobremesa: %s",
                pizza.preparar(),
                sobremesa.preparar());
    }
}
