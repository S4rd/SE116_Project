public abstract class Weapon extends Item {
    private String weaponType;

    public Weapon(String name, int weight, int value) {
        super(name,weight,value);
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }
}
