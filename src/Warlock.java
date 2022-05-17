public class Warlock extends Character{
    Warlock(String name){
        super(name);
    }
    public void lightningBlast(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Lightning Blast (Damage - 45)");
        int damagePoints = 45;
        damageTarget(enemyCharacter, damagePoints);
        
    }
    public void manaCost(Character characterName){
        System.out.println("Deducting mana (Mana cost - 55)");
        int mana = 55;
        deductMana(characterName, mana);
    }
    public void fireStorm(Character enemyCharacter ){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Firestorm (Damage - 40)");
        int damagePoints = 40;
        damageTarget(enemyCharacter, damagePoints);
    }
    public void manaCost1(Character characterName){
        System.out.println("Deducting mana (Mana cost - 50)");
        int mana = 50;
        deductMana(characterName, mana);
    }
}
