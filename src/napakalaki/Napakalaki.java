/**
 * @author Lothar Soto Palma y Rafael Nogales Vaquero
 */

package napakalaki;


import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Napakalaki {
    //Datos Miembros
    private static final Napakalaki instance = new Napakalaki();

    private Player currentPlayer;
    private int currentPlayerIndex;
    private Monster currentMonster;
    private ArrayList<Player> players;

    /*Constructor (es privado para que la clase sea singleton), no conocemos la
    implementación del constructor probablemente inicie a los players a traves 
    de una peticion, y posteriormente inicie el juego con initgame() por ello:
    */
    private Napakalaki(){
       ArrayList<String> Playernames = new ArrayList<>();
       currentPlayer = null;
       currentMonster = null;
       //Inicializacion del numero de jugadores
       int numPlayers = 0;
        try {
            numPlayers = cin.readInteger("Numero de jugadores: ");
        } catch (IOException ex) {
            Logger.getLogger(Napakalaki.class.getName()).log(Level.SEVERE, null, ex);
        }
       ArrayList<String> names = new ArrayList<>();
       for(int i=0; i<numPlayers; i++){
           names.add(cin.readString("Introduce nombre jugador:"));
       }
       initPlayers(names);
       //initGame(Playernames);   
    }

    private void initPlayers(ArrayList<String> names){
        players = new ArrayList<>();
        for(int i=0; i<names.size(); i++){
            Player player_actual = new Player(names.get(i));
            players.add(player_actual);
        }
        //El jugador actual al principio es el primero de la lista
        currentPlayer = players.get(0);
        currentPlayerIndex = 0;
    }

    private Player nextPlayer(){
        //Actualiza el jugador actual (currentPlayer) de la siguiente forma:
        //"currentPlayer" <- "nextPlayer"
        
        currentPlayerIndex = (currentPlayerIndex+1) % players.size();
        currentPlayer = players.get(currentPlayerIndex);
        System.out.println(currentPlayer.getName());        //Borrarlo al final
        return currentPlayer;
    }
    public CombatResult combat(){
        return null;
    }

    public void discardVisibleTreasure(Treasure t){

    }

    public void discardHiddenTreasure(Treasure t){

    }

    public boolean makeTreasureVisible(Treasure t){
        return false;
    }

    public boolean buyLevels(ArrayList<Treasure> visible, ArrayList<Treasure> hidden){
        return false;

    }
    public void initGame(ArrayList<String> players){
        initPlayers(players);
    }

    public Player getCurrentPlayer(){
        return currentPlayer;
    }

    public Monster getCurrentMonster(){
        return null;
    }

    public boolean canMakeTreasureVisible(Treasure t){
        return false;
    }

    public ArrayList<Treasure> getVisibleTreasures(){
        return null;
    }

    public ArrayList<Treasure> getHiddenTreasures(){
        return null;
    }

    public boolean nextTurn(){
        return false;
    }

    public boolean nextTurnAllowed(){
        return false;
    }
    public boolean endOfGame(CombatResult result){
        return false;

    }

    //getter
    public static Napakalaki getInstance() {
        return instance;
    }
}
