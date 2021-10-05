/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestione_magazzione;

import java.io.Serializable;

/**
 *
 * @author free
 */
public class Prodotto implements Serializable{
    private String nome , categoria;
    private int codice , scorta , scortamin;
    private double prezzo;

    public Prodotto(String nome, String categoria, int codice, int scorta, double prezzo) {
        this.nome = nome;
        this.categoria = categoria;
        this.codice = codice;
        this.scorta = scorta;
        this.prezzo = prezzo;
        this.scortamin=scortamin;
    }
    
    
    public void addScorta (int aggiunta){
        this.scorta += aggiunta;
    }
    
    public void rimuoviScorta (int rimozione){
        this.scorta -= rimozione;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getCodice() {
        return codice;
    }

    public int getScorta() {
        return scorta;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setScorta(int scorta) {
        this.scorta = scorta;
    }
    
    
    
}
