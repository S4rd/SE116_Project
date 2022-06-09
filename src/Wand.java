public class Wand extends Weapon {

    public Wand(String name, int weight, int value) {
        super( name, weight, value);
    }

    @Override
    public double calculateTotalDmg(Character ch) {

        return getValue()*ch.getIntelligence();
    }

}

