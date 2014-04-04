/**
 * @author Lothar Soto Palma y Rafael Nogales Vaquero
 */

package napakalaki;

import java.util.ArrayList;


/**
 * Clase BadConsequence: Representa el "mal rollo" de un monster
 * text:                     Explicacion del mal rollo
 * levels:                   Numero de niveles que pierdes
 * nVisibleTreasure:         Numero de tesoros visibles que pierdes
 * nHiddenTreasures:         Numero de tesoros ocultos que pierdes
 * death: true:              Si pierdes mueres / false: Si pierdes no mueres
 * specificHiddenTreasures:  Lista de tesoros ocultos que pierdes
 * specificVisibleTreasures: Lista de tesoros visibles que pierdes
 */
public class BadConsequence {
    private final String text;
    private final int levels;
    private final int nVisibleTreasures;
    private final int nHiddenTreasures;
    private final boolean death;
    private ArrayList<TreasureKind> specificHiddenTreasures;
    private ArrayList<TreasureKind> specificVisibleTreasures;

/**
 * Constructor al que se le pasan los datos miembros: text, levels, nVisible, nHidden
 * Las listas de specificTreasures se quedan vacias y el valor de death es false 
 */
    
    public BadConsequence(String text, int levels, int nVisible, int nHidden){
        this.text = text;
        this.levels = levels;
        specificHiddenTreasures = new ArrayList<>();
        specificVisibleTreasures = new ArrayList<>();
        nHiddenTreasures = nHidden;
        nVisibleTreasures = nVisible;
        death = false;
    }
    
   /**
    * Constructor al que se le pasa el texto y si la carta es de muerte o no
    * Se pone true para indicar que mueres si te gana el monstruo
    * Se pone false para indicar que NO mueres si te gana el monstruo
    * El resto de parametros se inicializan a 0 y las listas de 
    * specificTreasures se quedan vacias
    */
    
    public BadConsequence(String text, boolean death){
        this.text = text;
        this.death = death;
        levels = 0;
        specificHiddenTreasures = new ArrayList<>();
        specificVisibleTreasures = new ArrayList<>();
        nHiddenTreasures = 0;
        nVisibleTreasures = 0;
    }
    
    /**
     * Constructor al que se le pasan los datos miembros: 
     * Parametros: text, levels, specificVisibleTreasures, specificHiddenTresasures
     * #El tipo muerte se inicializa a false
     */
    
    public BadConsequence(String text, int levels, ArrayList<TreasureKind> 
            tVisible, ArrayList<TreasureKind> tHidden){
        this.text = text;
        this.levels = levels;
        this.death = false;
        specificHiddenTreasures = (ArrayList<TreasureKind>) tHidden.clone();
        specificVisibleTreasures = (ArrayList<TreasureKind>) tVisible.clone();
        nHiddenTreasures = tHidden.size();
        nVisibleTreasures = tVisible.size();
    }
    
    public boolean isEmpty(){
        return nVisibleTreasures == 0 && nHiddenTreasures == 0;
    }
    
    public boolean kills(){
        return death;
    }
    
    public String getText(){
        return text;
    }
    
    public int getLevels(){
        return levels;
    }
    
    public int getnHiddenTreasures(){
        return nHiddenTreasures;
    }
    
    public int getnVisibleTreasures(){
        return nVisibleTreasures;
    }

    public ArrayList<TreasureKind> getSpecificHiddenTreasures() {
        return specificHiddenTreasures;
    }

    public ArrayList<TreasureKind> getSpecificVisibleTreasures() {
        return specificVisibleTreasures;
    }
    
    public void substractVisibleTreasure(Treasure t){}
    
    public void substractHiddenTreasure(Treasure t){}
    
    public BadConsequence adjustToFitTreasureLists(ArrayList<Treasure> v, ArrayList<Treasure> h){
        return null;
    }
    
    public boolean isDeath(){
        return death;
    }
        
    @Override
    public String toString(){
        return "Text = " + text + ", levels = " + Integer.toString(levels) 
                + ", HiddenTreasures = " + Integer.toString(nHiddenTreasures) 
                + ", VisibleTreasures = " + Integer.toString(nVisibleTreasures)
                + ", Death = " + Boolean.toString(death)
                + ", VisibleItems = " + specificVisibleTreasures
                + ", HiddenItems = " + specificHiddenTreasures;
    }
}
