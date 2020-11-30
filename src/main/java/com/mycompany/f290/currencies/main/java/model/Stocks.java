
package com.mycompany.f290.currencies.main.java.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mycompany.f290.currencies.main.java.model.stocks.BMFBOVESPA;
import com.mycompany.f290.currencies.main.java.model.stocks.CAC40;
import com.mycompany.f290.currencies.main.java.model.stocks.NASDAQStockMarket;
import com.mycompany.f290.currencies.main.java.model.stocks.Nikkei225;

/**
 *
 * @author Eduardo Rocha
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stocks {


    @JsonProperty("IBOVESPA")
    public BMFBOVESPA bmfBovespa;

    @JsonProperty("NASDAQ")
    public NASDAQStockMarket nasdaq;

    @JsonProperty("CAC")
    public CAC40 cac;

    @JsonProperty("NIKKEI")
    public Nikkei225 nikkei;

    @Override
    public String toString() {
        return "Stocks{ bmfBovespa=" + bmfBovespa + ", nasdaq=" + nasdaq + ", cac=" + cac + ", nikkei=" + nikkei + '}';
    }

}
