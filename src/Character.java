public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */
    Character(String name){
        this.characterName = name;
    }
    Character(String name, int lvl, int hp, int mp){
        characterName = name;
        level = lvl;
        healthPoints = hp;
        manaPoints = mp;
    }

    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */
    public void displayName(Character charName){
        System.out.println("Character Initialized : " + charName);
    }
    /**
     * Method to decrease Mana
     */
    public void deductMana(Character characterName, int mana){
        characterName.manaPoints -= mana;
    }
    /**
     * Method to recover HP
     */
    public void recoverHp(Character characterName, int healPoints){
        characterName.healthPoints += healPoints;
    }
    /**
     * Create a method to Damage Target Character
     */
    public void damageTarget(Character enemyCharacter,int dmgPoints){
        /**
         * Deduct health points from enemy character
         */
        enemyCharacter.healthPoints -= dmgPoints;
        
        /**
         * Prompt Character is defeated if HP falls below 0
         * eg. Character Shaman defeated.
         */
        if(enemyCharacter.healthPoints <= 0){
            System.out.println(enemyCharacter.characterName + " has been defeated\n");
        }
    }
    public void increaseLvl(Character characterName, int lvl){
        characterName.level += lvl;

        if(characterName.healthPoints > 0){
            System.out.println("New level Reached!!!\nLevel " + level);
        }
    }
    public void displayDetails(){
        System.out.println("Name: " + characterName);
        System.out.println("Health Points: " + healthPoints);
        System.out.println("Mana Points: " + manaPoints);
    }

}