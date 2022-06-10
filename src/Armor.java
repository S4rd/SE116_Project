public class Armor extends Item {

    private String armorType;

    public Armor(String name, int weight, double value) {
        super(name, weight, value);
        setArmorType("Armor");
    }

    public String getArmorType() {
        return armorType;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }
}
