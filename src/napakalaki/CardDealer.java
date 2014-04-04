/**
 * @author Lothar Soto Palma y Rafael Nogales Vaquero
 */
package napakalaki;

import java.util.ArrayList;

public class CardDealer {
    //Datos Miembros
    private static CardDealer instance = new CardDealer();
   
    private ArrayList<Monster> unusedMonsters;
    private ArrayList<Monster> usedMonsters;
    private ArrayList<Treasure> unusedTreasures;
    private ArrayList<Treasure> usedTreasures;   
    
    //Constructor (es privado para que la clase sea singleton);
    
    //Constructor (es privado para que la clase sea singleton)
    private CardDealer(){
        unusedMonsters = new ArrayList<>();
        usedMonsters = new ArrayList<>();
        unusedTreasures = new ArrayList<>();
        usedTreasures = new ArrayList<>();
        initCards();
    }
    private void initTreasureCardDeck(){
        Treasure item = new Treasure("¡Si mi amo!", 0, 4, 7, TreasureKind.HELMET);
        unusedTreasures.add(item);
        item = new Treasure("Botas de investigacion", 600, 3, 4, TreasureKind.SHOE);
        unusedTreasures.add(item);
        item = new Treasure("Capucha de Cthulu", 500, 3, 5, TreasureKind.HELMET);
        unusedTreasures.add(item);
        item = new Treasure("A prueba de babas verdes", 400, 3, 5, TreasureKind.ARMOR);
        unusedTreasures.add(item);
        item = new Treasure("Botas de lluvia acida", 800, 1, 1, TreasureKind.BOTHHANDS);
        unusedTreasures.add(item);
        item = new Treasure("Casco minero", 400, 2, 4, TreasureKind.HELMET);
        unusedTreasures.add(item);
        item = new Treasure("Ametralladora Thompson", 600, 4, 8, TreasureKind.BOTHHANDS);
        unusedTreasures.add(item);
        item = new Treasure("Camiseta de la UGR", 100, 1, 7, TreasureKind.ARMOR);
        unusedTreasures.add(item);
        item = new Treasure("Clavo de rail ferroviario", 400, 3, 6, TreasureKind.ONEHAND);
        unusedTreasures.add(item);
        item = new Treasure("Cuchillo de sushi arcano", 300, 2, 3, TreasureKind.ONEHAND);
        unusedTreasures.add(item);
        item = new Treasure("Fez alópodo", 700, 3, 5, TreasureKind.HELMET);
        unusedTreasures.add(item);
        item = new Treasure("Hacha prehistorica", 500, 2, 5, TreasureKind.ONEHAND);
        unusedTreasures.add(item);
        item = new Treasure("El aparato del Pr. Tesla", 900, 4, 8, TreasureKind.ARMOR);
        unusedTreasures.add(item);
        item = new Treasure("Gaita", 200, 1, 5, TreasureKind.BOTHHANDS);
        unusedTreasures.add(item);
        item = new Treasure("Insecticida", 300, 2, 3, TreasureKind.ONEHAND);
        unusedTreasures.add(item);
        item = new Treasure("Escopeta de tres cañones", 700, 4, 6, TreasureKind.BOTHHANDS);
        unusedTreasures.add(item);
        item = new Treasure("Garabato místico", 300, 2, 2, TreasureKind.ONEHAND);
        unusedTreasures.add(item);
        
        /*Puesto que La fuerza de Mr.T es un objeto especial y se encarga de 
        otorgar el bonus maximo, aun no conocemos la implementacion, tendra los
        valores de 0,0 en maxbonus y minbonus por el momento.*/
        item = new Treasure("La fuerza de Mr.T", 1000, 0, 0, TreasureKind.NECKLACE);
        unusedTreasures.add(item);
        
        item = new Treasure("La rebeca metalica", 400, 2, 3, TreasureKind.ARMOR);
        unusedTreasures.add(item);
        item = new Treasure("Mazo de los antigos", 200, 3, 4, TreasureKind.ONEHAND);
        unusedTreasures.add(item);
        item = new Treasure("Necrocomicon", 100, 1, 1, TreasureKind.ONEHAND);
        unusedTreasures.add(item);
        item = new Treasure("Necronomicon", 800, 5, 7, TreasureKind.BOTHHANDS);
        unusedTreasures.add(item);
        item = new Treasure("Linterna a 2 manos", 400, 3, 6, TreasureKind.BOTHHANDS);
        unusedTreasures.add(item);
        item = new Treasure("Necrognomicon", 200, 2, 4, TreasureKind.ONEHAND);
        unusedTreasures.add(item);
        item = new Treasure("Necrotelecom", 300, 2, 3, TreasureKind.HELMET);
        unusedTreasures.add(item);
        item = new Treasure("Porra preternatural", 200, 2, 3, TreasureKind.ONEHAND);
        unusedTreasures.add(item);
        item = new Treasure("Tentaculo de pega", 200, 0, 1, TreasureKind.HELMET);
        unusedTreasures.add(item);
        item = new Treasure("Zapatilla deja-amigos", 500, 0, 1, TreasureKind.SHOE);
        unusedTreasures.add(item);
        item = new Treasure("Shogulador", 600, 1, 1, TreasureKind.BOTHHANDS);
        unusedTreasures.add(item);
        item = new Treasure("Varita de atizamiento", 400, 3, 4, TreasureKind.ONEHAND);
        unusedTreasures.add(item);
    }
    
    private void initMonsterCardDeck(){
        ArrayList<TreasureKind> tvp = new ArrayList();
        ArrayList<TreasureKind> top = new ArrayList();
        
        top.add(TreasureKind.ARMOR);
        tvp.add(TreasureKind.ARMOR);
        BadConsequence n_bad = new BadConsequence("Pierdes tu armadura visible "
                + "y otra oculta.", 0, tvp, top);
        Prize n_prize = new Prize(2,1);
        unusedMonsters.add(new Monster("3 Byakhees de bonanza", 8, n_bad, n_prize));
        tvp.clear();
        top.clear();
        
        tvp.add(TreasureKind.HELMET);
        n_bad = new BadConsequence("Embobados con el linfo "
                + "primigenio te descrtas de tu casco visible.", 5, tvp, top);
        n_prize = new Prize(1,1);
        unusedMonsters.add(new Monster("Chibithulu", 2, n_bad, n_prize));
        tvp.clear();
        
        tvp.add(TreasureKind.SHOE);
        n_bad = new BadConsequence("El primordial bostezo "
                + "contagioso.Pierdes el calzado visible.", 0, tvp, top);
        n_prize = new Prize(1,1);
        unusedMonsters.add(new Monster("El sopor de Dunwich", 2, n_bad, n_prize));
        tvp.clear();
        
        tvp.add(TreasureKind.ONEHAND);
        top.add(TreasureKind.ONEHAND);
        n_bad = new BadConsequence("Te atrapan para llevarte de"
                + " fiesta y te dejan caer en la mitad del vuelo. Descarta 1 "
                + "mano visible y 1 mano oculta.", 0, tvp, top);
        n_prize = new Prize(4,1);
        unusedMonsters.add(new Monster("Angeles de la noche ibicenca", 14, n_bad, 
                n_prize));
        top.clear();
        tvp.clear();
        
        n_bad = new BadConsequence("Pierdes todos tus tesoros "
                + "visibles.", 0, 10, 0);
        n_prize = new Prize(3,1);
        unusedMonsters.add(new Monster("El gorron en el umbral", 10, n_bad,
                n_prize));
        tvp.clear();
        
        tvp.add(TreasureKind.ARMOR);
        n_bad = new BadConsequence("Pierdes la armadura "
                + "visible.", 0, tvp, top);
        n_prize = new Prize(2,1);
        unusedMonsters.add(new Monster("H.P. Munchcraft", 6, n_bad, n_prize));
        tvp.clear();
        
        tvp.add(TreasureKind.ARMOR);
        n_bad = new BadConsequence("Sientes bichos bajo la "
                + "ropa descarta la armadura visible.", 0, tvp, top);
        n_prize = new Prize(1,1);
        unusedMonsters.add(new Monster("Bichgooth", 2, n_bad, n_prize));
        tvp.clear();
        
        /*
        Metodo aleatorio para añadir objetos aleatorios. No es necesario
        TreasureKind item,supply;
        item = TreasureKind.getRandom();
        tvp.add(item);
        for(int i = 0; i < 2; i++){
            supply= TreasureKind.getRandom();
            if(!tvp.contains(supply)){
                item = supply;
                tvp.add(item);
            }
            else
                i--;
        }*/
        n_bad = new BadConsequence("Pierdes 5 niveles y 3 "
                + "tesoros visibles.", 5, 3, 0);
        n_prize = new Prize(4,2);
        unusedMonsters.add(new Monster("El rey de rosa", 13, n_bad, n_prize));
        tvp.clear();
        
        n_bad = new BadConsequence("Tose los pulmones y pierdes"
                + " 2 niveles.", 2, 0, 0);
        n_prize = new Prize(1,1);
        unusedMonsters.add(new Monster("La que cose en las sombras", 13, n_bad, 
                n_prize));
        
        n_bad = new BadConsequence("Estos monstruos resultan "
                + "bastante superficiales y te aburren mortalmente. Estas "
                + "muerto.", true);
        n_prize = new Prize(2,1);
        unusedMonsters.add(new Monster("Los hondos verdes", 7, n_bad, n_prize));
                
       /* 
        Metodo aleatorio para añadir objetos aleatorios. No es necesario
        item = TreasureKind.getRandom();
        top.add(item);
        for(int i = 0; i < 1; i++){
            supply= TreasureKind.getRandom();
            if(!top.contains(supply)){
                item = supply;
                top.add(item);
            }
            else
                i--;
        }*/
        n_bad = new BadConsequence("Pierdes 2 niveles y 2"
                + " tesoros ocultos.", 2, 0, 2);
        n_prize = new Prize(2,1);
        unusedMonsters.add(new Monster("Semillas Cthulhu", 4, n_bad,n_prize));
        top.clear();
        
        tvp.add(TreasureKind.ONEHAND);
        n_bad = new BadConsequence("Te intentas escaquear. "
                + "Pierdes una mano visible.", 0, tvp, top);
        n_prize = new Prize(2,1);
        unusedMonsters.add(new Monster("Dameargo", 1, n_bad, n_prize));
        tvp.clear();
        
        n_bad = new BadConsequence("Da mucho asquito. Pierdes"
                + " 3 niveles.", 3, 0, 0);
        n_prize = new Prize(1,1);
        unusedMonsters.add(new Monster("Pollipolipo volante", 3, n_bad, n_prize));
        
        n_bad = new BadConsequence("No le hace mucha gracia "
                + "que pronuncien mal si nombre. Estas muerto", true);
        n_prize = new Prize(3,1);
        unusedMonsters.add(new Monster("Yskhtihyssg-Goth", 12, n_bad, n_prize));
        
        n_bad = new BadConsequence("La familia te atrapa. "
                + "Estas muerto.", true);
        n_prize = new Prize(4,1);
        unusedMonsters.add(new Monster("Familia feliz", 1, n_bad, n_prize));
        
        tvp.add(TreasureKind.BOTHHANDS);
        n_bad = new BadConsequence("La quinta directiva "
                + "primaria te obliga a perder 2 niveles y un tesoro 2 manos "
                + "visible", 0, tvp, top);
        n_prize = new Prize(2,1);
        unusedMonsters.add(new Monster("Roboggoth", 8, n_bad, n_prize));
        tvp.clear();
        
        tvp.add(TreasureKind.HELMET);
        n_bad = new BadConsequence("Te asusta en la noche. "
                + "Pierdes un casco visible", 0, tvp, top);
        n_prize = new Prize(1,1);
        unusedMonsters.add(new Monster("El espia ciego", 4, n_bad, n_prize));
        tvp.clear();
        
        /*
        Metodo aleatorio para añadir objetos aleatorios. No es necesario
        item = TreasureKind.getRandom();
        tvp.add(item);
        for(int i = 0; i < 4; i++){
            supply= TreasureKind.getRandom();
            if(!tvp.contains(supply)){
                item = supply;
                tvp.add(item);
            }
            else
                i--;
        }*/
        n_bad = new BadConsequence("Menudo suste te llevas. "
                + "Pierdes 2 niveles y 5 tesoros visibles", 2, 5, 0);
        n_prize = new Prize(1,1);
        unusedMonsters.add(new Monster("El lenguas", 20, n_bad, n_prize));
        tvp.clear();
        
        tvp.add(TreasureKind.ONEHAND);
        tvp.add(TreasureKind.BOTHHANDS);
        n_bad = new BadConsequence("Te faltan manos para tanta"
                + " cabeza. Pierdes 3 niveles y tus tesoros visibles de las "
                + "manos", 3, tvp, top);
        n_prize = new Prize(1,1);
        unusedMonsters.add(new Monster("Bicefalo", 20, n_bad, n_prize));
        tvp.clear();
    }
    
    private void shuffleTreasures(){
        
    }
    
    private void shuffleMonsters(){ 
    
    }
    
    public static CardDealer getInstance() {
        return instance;
    }
    
    public Treasure nextTreasure(){
        return null;
    }
    
    public Monster nextMonster(){
        return null;   
    }
    
    public void giveTreasureBack(Treasure t){
        
    }
    
    public void giveMonsterBack(Monster m){
      
    }
    
    public void initCards(){
        initTreasureCardDeck();
        initMonsterCardDeck();
    }    
}
