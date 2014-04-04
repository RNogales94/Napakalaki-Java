/**
 * @author Lothar Soto Palma y Rafael Nogales Vaquero
 */

package napakalaki;


/**
 * Clase Monster: Representa la estructura principal de cada una de las cartas 
 * de monstruos que se van a usar, contiene un "buen rollo" y un "mal rollo" 
 * ademas de un nombre y un nivel para el mismo
 */

public class Monster {
    private final String name;
    private final int level;
    private final Prize prize;
    private final BadConsequence bad;
    
    /**
     * @param name Nombre del Monstruo
     * @param level Nivel del Monstruo
     * @param bad "mal rollo" del Monstruo
     * @param prize "buen rollo" del Monstruo
     */
    public Monster(String name, int level, BadConsequence bad, Prize prize){
        this.name = name;
        this.level = level;
        this.bad = bad;
        this.prize = prize;
    }
    
    public String getName(){
        return name;
    }
    
    public int getLevel(){
        return level;
    }
    
    public BadConsequence getBad() {
        return bad;
    }

    public Prize getPrize() {
        return prize;
    }
    
    @Override
    public String toString(){
        return "Name = " + name + ", level = " + Integer.toString(level) 
                + "\nBad Consequence: " + bad.toString() + "\nPrize: " 
                + prize.toString();
    }
}
