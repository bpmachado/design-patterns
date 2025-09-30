package br.com.bpmachado.design.patterns.factory;

import br.com.bpmachado.design.patterns.product.Margherita;
import br.com.bpmachado.design.patterns.product.Pizza;
import br.com.bpmachado.design.patterns.product.Sobremesa;
import br.com.bpmachado.design.patterns.product.Tiramisu;
import org.springframework.stereotype.Component;

@Component("italiana")
public class ItalianaFactory implements PizzariaFactory{


    @Override
    public Pizza criarPizza() {
        return new Margherita();
    }

    @Override
    public Sobremesa criarSobremesa() {
        return new Tiramisu();
    }
}
