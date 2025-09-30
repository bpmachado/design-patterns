package br.com.bpmachado.design.patterns.factory;

import br.com.bpmachado.design.patterns.product.Pizza;
import br.com.bpmachado.design.patterns.product.Sobremesa;

public interface PizzariaFactory {
    Pizza criarPizza();
    Sobremesa criarSobremesa();
}
