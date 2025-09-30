package br.com.bpmachado.design.patterns.singleton;

import br.com.bpmachado.design.patterns.singleton.service.PedidoService;

import static spark.Spark.*;

public class SingletonApplication {

	public static void main(String[] args) {
        PedidoService pedidoService = new PedidoService();

        post("/pedido", (req, res) -> {
            String cliente = req.queryParams("cliente");
            return pedidoService.processar(cliente);
        });

        get("/", (req, res) -> ("Microserviço ativo com singleton "));
	}

}
