public abstract class Weapon extends Item {
    private String weaponType;

    public Weapon(String name, double weight, double value) {
        super(name,weight,value);
    }



    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }
}
