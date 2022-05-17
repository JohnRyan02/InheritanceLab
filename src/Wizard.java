public class Wizard extends Character{
    Wizard(String name){
        super(name);
    }
    public void endlessVoid(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Endless Void (Damage - 50)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        
    }
    public void manaCost1(Character characterName){
        System.out.println(" Deducting mana (Mana cost - 100)");
        int mana = 100;
        deductMana(characterName, mana);
    }
    public void heal(Character characterName){
        System.out.println(super.characterName + " has increased HP (Heal + 30)");
        int healPoints = 30;
        recoverHp(characterName, healPoints);
    }
}
