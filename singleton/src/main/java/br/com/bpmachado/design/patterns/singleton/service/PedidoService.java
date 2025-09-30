package br.com.bpmachado.design.patterns.singleton.service;

public class PedidoService {
    private final EmailService emailService = EmailService.getInstance();

    public String processar(String cliente){

        emailService.enviar(cliente, "Pedido confirmado,", "Seu pedido foi recebido!");

        return String.format("Pedido processado para o cliente: %s", cliente);
    }


}
