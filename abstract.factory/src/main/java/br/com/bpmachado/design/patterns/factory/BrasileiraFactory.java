package br.com.bpmachado.design.patterns.factory;

import br.com.bpmachado.design.patterns.product.Brigadeiro;
import br.com.bpmachado.design.patterns.product.Calabresa;
import br.com.bpmachado.design.patterns.product.Pizza;
import br.com.bpmachado.design.patterns.product.Sobremesa;
import org.springframework.stereotype.Component;

@Component("brasileira")
public class BrasileiraFactory implements PizzariaFactory{
    @Override
    public Pizza criarPizza() {
        return new Calabresa();
    }

    @Override
    public Sobremesa criarSobremesa() {
        return new Brigadeiro();
    }
}
