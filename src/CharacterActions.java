public interface CharacterActions {



    void pick(Item item);
    void wear(Armor armor);
    void wield(Weapon weapon);
    void attack(Character attacker,Character enemy);
    void examine(Item item);
    void dropInventory(Item item);
}
