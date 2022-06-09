public class Sword extends Weapon {


    public Sword(String name, int weight, int value) {
        super(name, weight, value);
    }


    @Override
    public double calculateTotalDmg(Character ch) {
        return getValue()*ch.getStrength();
    }
    @Override
    public void specialAction(){

    }
}
