package br.com.bpmachado.design.patterns.singleton.service;

public class EmailService {
    private static EmailService instance;

    EmailService(){}

    public static EmailService getInstance(){
        if(instance==null){
            instance = new EmailService();
        }
        return instance;
    }

    public void enviar(String destino, String assunto, String corpo){
        System.out.println("""
                Enviando e-mail para %s: %s\n""".formatted(destino, assunto));
    }
}
