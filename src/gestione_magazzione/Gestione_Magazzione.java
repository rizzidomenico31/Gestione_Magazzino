/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestione_magazzione;

import java.util.ArrayList;

/**
 *
 * @author free
 */
public class Gestione_Magazzione {
    public static ArrayList<Prodotto> prodotti = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JF_Interfaccia frame = new JF_Interfaccia();
        frame.setVisible(true);
        frame.setResizable(false);
    }
    
}
