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
    private int currentWeight;
    private String typeOfCharacter;
    private ArrayList<Item> inventory = new ArrayList<Item>();

    public Character(String nameOfCharacter, double strength, double vitality, double intelligence) {
        this.nameOfCharacter = nameOfCharacter;
        this.strength = strength;
        this.vitality = vitality;
        this.intelligence = intelligence;
        this.currentHP = setMaxHP();
        this.maxHP = setMaxHP();



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
    public double setMaxHP(){
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
    public void pick(Item item) {

        if (getCurrentWeight() >= getStrength()) {
            System.out.println("The inventory is full!!!");
        } else {
            inventory.add(item);
        }
    }

    @Override
    public void wear(Armor armor) {

        //??

    }

    @Override
    public void wield(Weapon weapon) {
        if (inventory.contains(weapon)) {
            inventory.remove(weapon);
            currentWeapon=weapon;

        } else if(!inventory.contains(weapon)){
            System.out.println("You have weapon already.");

        }
    }

    @Override
    public void attack(Character attacker,Character enemy) {
        double dmg=(attacker.getStrength())*(getCurrentWeapon().getValue());
        double updatedHp = enemy.getCurrentHP()-dmg;
        enemy.setCurrentHP(updatedHp);

    }

    @Override
    public void examine(Item item) {
        if (inventory.contains(item)) {
            // arraylist yazdırılırken sırayla yazdırılacak, bu sayede bu metotta girilen sayıya göre itemin bilgilerini çıkarırız.


        }



    }
    @Override
    public void dropInventory(Item item){

    }

}
