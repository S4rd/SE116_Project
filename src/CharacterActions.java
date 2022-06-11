public interface CharacterActions {

    void sendInventory(Item item);



    void wield(Item item);
    void attack(Character attacker,Character enemy);
    void examine(Item item);
    void dropInventory(Item item);
}
