package com.mycompany.f290.currencies.main.java.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mycompany.f290.currencies.main.java.model.currencies.PesoArgentino;
import com.mycompany.f290.currencies.main.java.model.currencies.BitCoin;
import com.mycompany.f290.currencies.main.java.model.currencies.Euro;
import com.mycompany.f290.currencies.main.java.model.currencies.Libra;
import com.mycompany.f290.currencies.main.java.model.currencies.Dolar;

/* 
    As anotações do Jackson são utilizadas para proverem funcionalidades extras com minimo esforço
    Neste caso estamos informando que atributos não declarados na classe devem ser ignorados. 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class Moedas {
    
    /* Neste caso, estamos configurando que a propriedade "source" do JSON deverá ser convertida para o atributo "fonte",
        fiz esta alteração para fazer mais sentido o uso de anotações do Jackson.
        Com as anotações neste caso, podemos utilizar qualquer nome de classe e atributo, sem esta anotação o atributo 
        da classe deve ter o mesmo nome do atributo JSON para que a conversão possa ser realizada.
    */
    @JsonProperty("source")
    public String fonte;
    
    @JsonProperty("USD")
    public Dolar dolar;
    
    @JsonProperty("EUR")
    public Euro euro;
    
    @JsonProperty("GBP")
    public Libra libra;
    
    @JsonProperty("ARS")
    public PesoArgentino pesoArgentino;
    
    @JsonProperty("BTC")
    public BitCoin bitCoin;      

    @Override
    public String toString() {
        return "Moedas{" + "source=" + fonte + ", usd=" + dolar + ", eur=" + euro + ", gbp=" + libra + ", ars=" + pesoArgentino + ", btc=" + bitCoin + '}';
    }
    
}


