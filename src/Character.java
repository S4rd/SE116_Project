import java.util.*;
import java.lang.*;

public abstract class Character implements CharacterActions {
    private String nameOfCharacter;
    private double strength;
    private double vitality;
    private double intelligence;
    private double maxHP;
    private double currentHP;
    private Weapon currentWeapon;
    private Armor currentArmor;
    private double currentWeight;
    private String typeOfCharacter;
    private ArrayList<Item> inventory = new ArrayList<Item>();


    public Character(String nameOfCharacter, double strength, double vitality, double intelligence) {
        this.nameOfCharacter = nameOfCharacter;
        this.strength = strength;
        this.vitality = vitality;
        this.intelligence = intelligence;
        this.currentHP = setMaxHP();
        this.maxHP = setMaxHP();
        setInventory(inventory);
        setCurrentWeight(0);

    }

    public void setCurrentWeight(double currentWeight) {
        this.currentWeight = currentWeight;
    }

    public Armor getCurrentArmor() {
        return currentArmor;
    }

    public void setCurrentArmor(Armor currentArmor) {
        this.currentArmor = currentArmor;
    }

    public String getTypeOfCharacter() {
        return typeOfCharacter;
    }

    public void setTypeOfCharacter(String typeOfCharacter) {
        this.typeOfCharacter = typeOfCharacter;
    }

    public double getCurrentHP() {
        return currentHP;
    }

    public double setMaxHP() {

        return Math.round(7 * vitality + 2 * strength + 1 * intelligence);

    }

    public void setCurrentHP(double currentHP) {
        this.currentHP = currentHP;
    }

    public double getMaxHP() {
        return maxHP;
    }


    public String getNameOfCharacter() {
        return nameOfCharacter;
    }

    public void setNameOfCharacter(String nameOfCharacter) {
        this.nameOfCharacter = nameOfCharacter;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }


    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getVitality() {
        return vitality;
    }

    public void setVitality(double vitality) {
        this.vitality = vitality;
    }

    public double getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(double intelligence) {
        this.intelligence = intelligence;
    }


    @Override
    public void sendInventory(Item item) {

        if (getCurrentWeight() + item.getWeight() > getStrength()) {
            System.out.println("The inventory is full, you need drop an item!");
        } else {
            System.out.println(nameOfCharacter+" picked an "+item.getName());
            inventory.add(item);
            currentWeight += item.getWeight();
        }
    }


    @Override
    public void wield(Item item) {
        if (inventory.contains(item)) {
            if (item.getItemType().equals("Armor")) {
                if (!(currentArmor == null)) {

                    System.out.println("You need take off your armor!");
                } else {
                    currentArmor = (Armor) item;
                }
            } else if (item.getItemType().equals("Sword") || item.getItemType().equals("Wand") || item.getItemType().equals("Shield")) {
                if (!(currentWeapon == null)) {

                    System.out.println("You need drop your weapon!");
                } else {
                    currentWeapon = (Weapon) item;

                }
            } else if (!inventory.contains(item)) {
                System.out.println("You don't have this item!");

            }
        }
    }

    @Override
    public void attack(Character attacker, Character enemy) {

        if (enemy.currentArmor == null) {
            double dmg;
            double updatedHp;

            if (attacker.currentWeapon == null) {
                dmg = attacker.getStrength();
                updatedHp = enemy.getCurrentHP() - dmg;
                enemy.setCurrentHP(updatedHp);
                System.out.println(attacker.getNameOfCharacter()+" does "+dmg+" damage!");
            } else if (attacker.currentWeapon.getItemType().equals("Sword")) {
                dmg = (attacker.getStrength()) * (getCurrentWeapon().getValue());
                updatedHp = enemy.getCurrentHP() - dmg;
                enemy.setCurrentHP(updatedHp);
                System.out.println(attacker.getNameOfCharacter()+" does "+dmg+" damage!");
            } else if (attacker.currentWeapon.getItemType().equals("Shield")) {
                dmg = (attacker.getVitality()) * (getCurrentWeapon().getValue());
                updatedHp = enemy.getCurrentHP() - dmg;
                enemy.setCurrentHP(updatedHp);
                System.out.println(attacker.getNameOfCharacter()+" does "+dmg+" damage!");

            } else if (attacker.currentWeapon.getItemType().equals("Wand")) {
                dmg = (attacker.getIntelligence()) * (getCurrentWeapon().getValue());
                updatedHp = enemy.getCurrentHP() - dmg;
                enemy.setCurrentHP(updatedHp);
                System.out.println(attacker.getNameOfCharacter()+" does "+dmg+" damage!");

            }



        } else if (!(enemy.currentArmor == null)) {
            double dmg;
            double updatedHp;
            if (enemy.currentArmor.getName().equals("Light Armor")) {
                if (attacker.currentWeapon == null) {
                    dmg = attacker.getStrength();
                    double reducedDmg = dmg * enemy.currentArmor.getValue();
                    updatedHp = enemy.getCurrentHP() - reducedDmg;
                    enemy.setCurrentHP(updatedHp);
                    System.out.println(attacker.getNameOfCharacter()+" does "+reducedDmg+" damage!");

                } else if (attacker.currentWeapon.getItemType().equals("Sword")) {
                    dmg = (attacker.getStrength()) * (getCurrentWeapon().getValue());
                    double reducedDmg = dmg * enemy.currentArmor.getValue();
                    updatedHp = enemy.getCurrentHP() - reducedDmg;
                    enemy.setCurrentHP(updatedHp);
                    System.out.println(attacker.getNameOfCharacter()+" does "+reducedDmg+" damage!");
                } else if (attacker.currentWeapon.getItemType().equals("Shield")) {
                    dmg = (attacker.getVitality()) * (getCurrentWeapon().getValue());
                    double reducedDmg = dmg * enemy.currentArmor.getValue();
                    updatedHp = enemy.getCurrentHP() - reducedDmg;
                    enemy.setCurrentHP(updatedHp);
                    System.out.println(attacker.getNameOfCharacter()+" does "+reducedDmg+" damage!");

                } else if (attacker.currentWeapon.getItemType().equals("Wand")) {
                    dmg = (attacker.getIntelligence()) * (getCurrentWeapon().getValue());
                    double reducedDmg = dmg * enemy.currentArmor.getValue();
                    updatedHp = enemy.getCurrentHP() - reducedDmg;
                    enemy.setCurrentHP(updatedHp);
                    System.out.println(attacker.getNameOfCharacter()+" does "+reducedDmg+" damage!");

                }
            } else if (enemy.currentArmor.getName().equals("Medium Armor")) {

                if (attacker.currentWeapon == null) {
                    dmg = attacker.getStrength();
                    double reducedDmg = dmg * enemy.currentArmor.getValue();
                    updatedHp = enemy.getCurrentHP() - reducedDmg;
                    enemy.setCurrentHP(updatedHp);
                    System.out.println(attacker.getNameOfCharacter()+" does "+reducedDmg+" damage!");
                } else if (attacker.currentWeapon.getItemType().equals("Sword")) {
                    dmg = (attacker.getStrength()) * (getCurrentWeapon().getValue());
                    double reducedDmg = dmg * enemy.currentArmor.getValue();
                    updatedHp = enemy.getCurrentHP() - reducedDmg;
                    enemy.setCurrentHP(updatedHp);
                    System.out.println(attacker.getNameOfCharacter()+" does "+reducedDmg+" damage!");
                } else if (attacker.currentWeapon.getItemType().equals("Shield")) {
                    dmg = (attacker.getVitality()) * (getCurrentWeapon().getValue());
                    double reducedDmg = dmg * enemy.currentArmor.getValue();
                    updatedHp = enemy.getCurrentHP() - reducedDmg;
                    enemy.setCurrentHP(updatedHp);
                    System.out.println(attacker.getNameOfCharacter()+" does "+reducedDmg+" damage!");

                } else if (attacker.currentWeapon.getItemType().equals("Wand")) {
                    dmg = (attacker.getIntelligence()) * (getCurrentWeapon().getValue());
                    double reducedDmg = dmg * enemy.currentArmor.getValue();
                    updatedHp = enemy.getCurrentHP() - reducedDmg;
                    enemy.setCurrentHP(updatedHp);
                    System.out.println(attacker.getNameOfCharacter()+" does "+reducedDmg+" damage!");

                }

            } else if (enemy.currentArmor.getName().equals("Heavy Armor")) {
                if (attacker.currentWeapon == null) {
                    dmg = attacker.getStrength();
                    double reducedDmg = dmg * enemy.currentArmor.getValue();
                    updatedHp = enemy.getCurrentHP() - reducedDmg;
                    enemy.setCurrentHP(updatedHp);
                    System.out.println(attacker.getNameOfCharacter()+" does "+reducedDmg+" damage!");
                } else if (attacker.currentWeapon.getItemType().equals("Sword")) {
                    dmg = (attacker.getStrength()) * (getCurrentWeapon().getValue());
                    double reducedDmg = dmg * enemy.currentArmor.getValue();
                    updatedHp = enemy.getCurrentHP() - reducedDmg;
                    enemy.setCurrentHP(updatedHp);
                    System.out.println(attacker.getNameOfCharacter()+" does "+reducedDmg+" damage!");
                } else if (attacker.currentWeapon.getItemType().equals("Shield")) {
                    dmg = (attacker.getVitality()) * (getCurrentWeapon().getValue());
                    double reducedDmg = dmg * enemy.currentArmor.getValue();
                    updatedHp = enemy.getCurrentHP() - reducedDmg;
                    enemy.setCurrentHP(updatedHp);
                    System.out.println(attacker.getNameOfCharacter()+" does "+reducedDmg+"!");

                } else if (attacker.currentWeapon.getItemType().equals("Wand")) {
                    dmg = (attacker.getIntelligence()) * (getCurrentWeapon().getValue());
                    double reducedDmg = dmg * enemy.currentArmor.getValue();
                    updatedHp = enemy.getCurrentHP() - reducedDmg;
                    enemy.setCurrentHP(updatedHp);
                    System.out.println(attacker.getNameOfCharacter()+" does "+reducedDmg+"!");

                }
            }
        }

    }


    @Override
    public void examine(Item item) {
        if (inventory.contains(item)) {
            System.out.println("Name: " + item.getName() + "\n Weight: " + item.getWeight() + "\n Damage or Protection: " + item.getValue());

        } else {
            System.out.println("You don't have this item!");
        }
    }

    @Override
    public void dropInventory(Item item) { // currentWeapon silme!
        if (currentWeapon == null) {
            System.out.println("You don't have a weapon!");
        } else {
            if (inventory.contains(item)) {
                inventory.remove(item);



            } else {
                System.out.println("You don't have this item!");
            }

        }
    }

    @Override
    public void heal(Character healer,Character healed) {
        double healingHP;
        double updatedHP;

        healingHP = ((healer.getIntelligence())*(healer.currentWeapon.getValue()));

        if(getMaxHP()>=healingHP+healed.getCurrentHP()){
            updatedHP=healingHP+healed.getCurrentHP();
            healed.setCurrentHP(updatedHP);
        }
        else if(getMaxHP()<healingHP+healed.getCurrentHP()){
            healingHP = healed.getMaxHP()-healed.getCurrentHP();
            updatedHP = healed.getCurrentHP()+healingHP;
            healed.setCurrentHP(updatedHP);
        }
        System.out.println(healer.getNameOfCharacter()+" healed by "+healed.getNameOfCharacter()+" by "+healingHP+" HP");




    }
}
