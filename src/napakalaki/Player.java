/**
 * @author Lothar Soto Palma y Rafael Nogales Vaquero
 */

package napakalaki;

import java.util.ArrayList;

public class Player {
    private boolean dead = true;
    private int level;
    private String name;
    private Treasure HiddenTreasures;
    private Treasure VisibleTreasures;
    private BadConsequence pendingBadConsequence;
    
    public Player(String name){
        this.name = name;
        level = 0;
        dead = false;
        HiddenTreasures = null;
        VisibleTreasures = null;
        pendingBadConsequence = null;
    }
    
    private void bringtolife(){} 

    private void incrementLevels(){
    }
    
    private void decrementLevels(){
    }
        
    private void setPendingBadConsequence(BadConsequence pendingBadConsequence) {
        this.pendingBadConsequence = pendingBadConsequence;
    }
    
    private void die(){
        dead = true;
    }
    
    private void discardNecklaceIfVisible(){}
    
    private void dieIfNoTreasures(){}
    
    private int computeGoldCoinsValue(ArrayList<Treasure> t){
        return 1;
    }
    
    private boolean canIBuyLevels(float l){
        return false;
    }
    
    public void applyPrize(Prize p){}
    
    public CombatResult combat(Monster m){
        return null;
    }
    
    public void applyBadConsequence(BadConsequence bad){}
    
    public boolean makeTreasureVisible(Treasure t){
        return false;
    }
    
    public boolean canMakeTreasureVisible(Treasure t){
        return false;   
    } 
    
    public void discardVisibleTreasure(Treasure t){}
    
    public void discardHiddenTreasure(Treasure t){}
    
    public boolean buyLevels(ArrayList<Treasure> visible,
            ArrayList<Treasure> hidden){
        return false;
    }

    public int getCombatLevel() {
        return level;
    }
    
    public boolean validState(){
        return false;
        
    }
    
    public boolean initTreasures(){
        return false;
    }
    
    public boolean isDead() {
        return dead;
    }
    
    public boolean hasVisibleTreasures(){
        return false;   
    }

    public Treasure getVisibleTreasures() {
        return VisibleTreasures;
    }
    
    public Treasure getHiddenTreasures() {
        return HiddenTreasures;
    }

    public String getName() { //Borrar al final
        return name;
    }
    
}
