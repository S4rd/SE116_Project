public class Shield extends Weapon {


    public Shield(String name, int weight, int value){
        super(name,weight,value);
    }

    @Override
    public double calculateTotalDmg(Character ch) {
        return ch.getVitality()*getValue();

    }

}
