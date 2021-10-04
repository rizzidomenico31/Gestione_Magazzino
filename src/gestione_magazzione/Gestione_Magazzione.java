
package gestione_magazzione;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Gestione_Magazzione {
    public static ArrayList<Prodotto> prodotti = new ArrayList<>();
    static String nomefile = "prodotti.obj";
    
    public static void main(String[] args) {
        try {
            leggiFileobj(nomefile);
        } catch (IOException ex) {
            Logger.getLogger(Gestione_Magazzione.class.getName()).log(Level.SEVERE, null, ex);
        }
        JF_Interfaccia frame = new JF_Interfaccia();
        frame.setVisible(true);
        frame.setResizable(false);
    }
    
    
    static public void leggiFileobj(String nomefile) throws IOException{
        FileInputStream in = null;
        
        try {
            in = new FileInputStream(nomefile);
            ObjectInputStream leggifile = new ObjectInputStream(in);
            try {
                prodotti = (ArrayList<Prodotto>) leggifile.readObject();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Gestione_Magazzione.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Gestione_Magazzione.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
