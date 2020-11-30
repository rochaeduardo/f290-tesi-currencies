package com.mycompany.f290.currencies.main.java;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.mycompany.f290.currencies.main.java.model.Moedas;
import com.mycompany.f290.currencies.main.java.model.Stocks;
import com.mycompany.f290.currencies.main.java.utils.ConversorUtil;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        ConversorUtil conversor = new ConversorUtil();
        // Criar objeto de gerenciamento
        HttpClient httpClient = HttpClient.newHttpClient();

        // Criar uma requisicao Web
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://api.hgbrasil.com/finance/quotations?key=a80da7dd"))
                .build();

        // Recebemos o retorno da requisicao
        var response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        // Exibimos os dados recebidos da API HGBrasil
        System.out.println(response.body());

        ObjectMapper objectMapper = new ObjectMapper();

        // Crianmos um objeto objectNode para poder capturar um nó especídifo em nosso JSON
        ObjectNode node = objectMapper.readValue(response.body(), ObjectNode.class);

        // Seleção do node esecifico currencies com base em nosso modelo de classes
        String result = node.get("results").get("currencies").toString();

        //  Conversão do JSON em objeto do tipo Moedas.
        Moedas moedas = objectMapper.readValue(result, Moedas.class);

        System.out.println("Dollar: " + moedas.dolar.compra);

        //  Exibição do toString() do nosso objeto já convertido a partir 
        System.out.println("Currencies: " + moedas);

        // exbibe a cotação do euro
        System.out.println("EURO:" + moedas.euro);

        // exbibe a cotação do bitcoin
        System.out.println("BITCOIN: " + moedas.bitCoin);

        System.out.println("DOLAR:" + moedas.dolar);

        String results = node.get("results").get("stocks").toString();
        System.out.println("Stocks: " + results);

        System.out.println("Informe valor em R$");
        Double valor = sc.nextDouble();

        conversor.converterDolar(valor, moedas.dolar.compra);

    }
}
