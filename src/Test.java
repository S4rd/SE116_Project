
import java.util.*;


public class Test {


    public static void main(String[] args) {


        System.out.println("Game is running...");
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        Item item;
        int numbersOfEnemies;
        int level = 0;

        ArrayList<Character> enemyList = new ArrayList<Character>();
        ArrayList<Character> allyArrayList = new ArrayList<Character>();
        ArrayList<Character> allCharacters = new ArrayList<Character>();
        ArrayList<Item> dropList = new ArrayList<Item>();


        Character fighter = new Fighter("Kane", random.nextInt(5) + 6, random.nextInt(5) + 3, random.nextInt(5) + 1);
        Character tank = new Tank("Braum", random.nextInt(5) + 1, random.nextInt(5) + 6, random.nextInt(5) + 3);
        Character healer = new Healer("Sona", random.nextInt(5) + 3, random.nextInt(5) + 1, random.nextInt(5) + 6);



        Weapon scimitar = new Sword("Scimitar", 1, 3);
        Weapon shortSword = new Sword("Short Sword", 1, 4);
        Weapon longSword = new Sword("Long Sword", 1, 5);
        Weapon excalibur = new Sword("Excalibur", 1, 6);
        Weapon justice = new Sword("Justice", 1, 8);

        Weapon boneWand = new Wand("Bone Wand", 1, 2);
        Weapon woodWand = new Wand("Wood Wand", 1, 3);
        Weapon dragonWand = new Wand("Dragon's Wand", 1, 4);

        Weapon smallShield = new Shield("Small Shield", 1, 2);
        Weapon buckler = new Shield("Buckler", 1, 3);
        Weapon towerShield = new Shield("Tower Shield", 1, 5);

        Item lightArmor = new Armor("Light Armor", 2, 0.75);
        Item mediumArmor = new Armor("Medium Armor", 3, 0.50);
        Item heavyArmor = new Armor("Heavy Armor", 5, 0.25);

        fighter.sendInventory(shortSword);
        fighter.wield(shortSword);

        healer.sendInventory(boneWand);
        healer.wield(boneWand);

        tank.sendInventory(smallShield);
        tank.wield(smallShield);

        allyArrayList.add(fighter);
        allyArrayList.add(tank);
        allyArrayList.add(healer);

        allCharacters.add(fighter);
        allCharacters.add(tank);
        allCharacters.add(healer);

        System.out.println(fighter.getNameOfCharacter()+" created with S: "+fighter.getStrength()+", V: "+fighter.getVitality()
                +", I:"+fighter.getIntelligence()+". The HP is "+fighter.getMaxHP()+". "+fighter.getNameOfCharacter()+" wields "
                +fighter.getCurrentWeapon().getName()+", with "+fighter.getCurrentWeapon().getValue()+" damage and "+fighter.getCurrentWeapon().getWeight()
                +" units of weight.");


        System.out.println(tank.getNameOfCharacter()+" created with S: "+tank.getStrength()+", V: "+tank.getVitality()
                +", I:"+tank.getIntelligence()+". The HP is "+tank.getMaxHP()+". "+tank.getNameOfCharacter()+" wields "
                +tank.getCurrentWeapon().getName()+", with "+tank.getCurrentWeapon().getValue()+" damage and "+tank.getCurrentWeapon().getWeight()
                +" units of weight.");


        System.out.println(healer.getNameOfCharacter()+" created with S: "+healer.getStrength()+", V: "+healer.getVitality()
                +", I:"+healer.getIntelligence()+". The HP is "+healer.getMaxHP()+". "+healer.getNameOfCharacter()+" wields "
                +healer.getCurrentWeapon().getName()+", with "+healer.getCurrentWeapon().getValue()+" damage and "+healer.getCurrentWeapon().getWeight()
                +" units of weight.");
        System.out.println();


        while (allyArrayList.size() > 0) { // level
//

            numbersOfEnemies = Level.enemyNumber(level);

            for (int loop = 0; loop < numbersOfEnemies; loop++) {



                EnemySoldier enemySoldier = new EnemySoldier("enemy" + (loop + 1), random.nextInt(5) + 1, random.nextInt(5) + 1, random.nextInt(5) + 1);
                enemyList.add(enemySoldier);
                allCharacters.add(enemySoldier);
                // 80 kılıç

            }
            System.out.println("Creating Level "+level+", with "+numbersOfEnemies+" enemy soldier.");

            System.out.print("Entering level " + level +"; "+ fighter.getNameOfCharacter()+" enters. "+tank.getNameOfCharacter()+" enters. "+healer.getNameOfCharacter()+" enters. ");


            for(int i=0;i<enemyList.size();i++){
                System.out.print(enemyList.get(i).getNameOfCharacter()+" enters. ");

            }
            System.out.println();
            level++;
            System.out.println();
//
            for (int a = 0; a < enemyList.size(); a++) { // %80 sword, %10 shield, %10 wand
                switch (random.nextInt(10)) {
                    case 0:
                        enemyList.get(a).sendInventory(scimitar);
                        enemyList.get(a).wield(scimitar);
                        break;
                    case 1:
                        enemyList.get(a).sendInventory(scimitar);
                        enemyList.get(a).wield(scimitar);
                        break;
                    case 2:
                        enemyList.get(a).sendInventory(scimitar);
                        enemyList.get(a).wield(scimitar);
                        break;
                    case 3:
                        enemyList.get(a).sendInventory(shortSword);
                        enemyList.get(a).wield(shortSword);
                        break;
                    case 4:
                        enemyList.get(a).sendInventory(shortSword);
                        enemyList.get(a).wield(shortSword);
                        break;
                    case 5:
                        enemyList.get(a).sendInventory(excalibur);
                        enemyList.get(a).wield(excalibur);
                        break;
                    case 6:
                        enemyList.get(a).sendInventory(longSword);
                        enemyList.get(a).wield(longSword);
                        break;
                    case 7:
                        enemyList.get(a).sendInventory(justice);
                        enemyList.get(a).wield(justice);
                        break;
                    case 8:
                        enemyList.get(a).sendInventory(buckler);
                        enemyList.get(a).wield(buckler);
                        break;
                    case 9:
                        enemyList.get(a).sendInventory(woodWand);
                        enemyList.get(a).wield(woodWand);
                        break;
                }
            }


            while (enemyList.size() > 0) {

                boolean turn = true;
                while (turn) {

                    System.out.println("Type 'attack' for attack");
                    System.out.println("Type 'pick' for pick an item");
                    System.out.println("Type 'wield' for wield an item");
                    System.out.println("Type 'examine' for examine an item");
                    System.out.println("Type 'drop' for drop inventory an item");
                    System.out.println("Type 'special' for special action");

                    String choice = scanner.nextLine();
                    choice = choice.toLowerCase();
                    switch (choice) {
                        case "attack":


                            System.out.println("Type '1' for pick Kane");
                            System.out.println("Type '2' for pick Braum");
                            System.out.println("Type '3' for pick Sona");


                            int choice1 = scanner.nextInt();
                            scanner.nextLine();

                            switch (choice1) {
                                case 1:
                                    if(fighter.getCurrentHP()>0) {
                                        for (int a = 0; a < allCharacters.size(); a++) {
                                            System.out.println("Name: " + allCharacters.get(a).getNameOfCharacter() + " HP: " + allCharacters.get(a).getCurrentHP());

                                        }
                                        System.out.println("Type name of character to attack: ");
                                        int indexOfCharacter = 0;
                                        String nameOfCharacter = scanner.nextLine();

                                        boolean flag = true;
                                        while (flag) {
                                            for (int a = 0; a < allCharacters.size(); a++) {
                                                if (allCharacters.get(a).getNameOfCharacter().equals(nameOfCharacter)) {
                                                    flag = false;
                                                    break;
                                                } else {
                                                    indexOfCharacter++;
                                                }

                                            }
                                        }

                                        fighter.attack(fighter, allCharacters.get(indexOfCharacter));
                                        System.out.println(fighter.getNameOfCharacter() + " does " + fighter.getStrength() * fighter.getCurrentWeapon().getValue() + " damage.");

                                        if (allyArrayList.contains(allCharacters.get(indexOfCharacter))) {
                                            if (allCharacters.get(indexOfCharacter).getCurrentHP() <= 0) {


                                                if (!(allCharacters.get(indexOfCharacter).getCurrentWeapon() == null)) {
                                                    allCharacters.get(indexOfCharacter).dropInventory(allCharacters.get(indexOfCharacter).getCurrentWeapon());
                                                    dropList.add(allCharacters.get(indexOfCharacter).getCurrentWeapon());

                                                }
                                                if (!(allCharacters.get(indexOfCharacter).getCurrentArmor() == null)) {
                                                    allCharacters.get(indexOfCharacter).dropInventory(allCharacters.get(indexOfCharacter).getCurrentArmor());
                                                    dropList.add(allCharacters.get(indexOfCharacter).getCurrentArmor());
                                                }

                                                System.out.print(allCharacters.get(indexOfCharacter).getNameOfCharacter() + " is dead. " + allCharacters.get(indexOfCharacter).getNameOfCharacter()
                                                        + " drops a " + dropList.get(0).getName() + "\n");

                                                allyArrayList.remove(allCharacters.get(indexOfCharacter));
                                                allCharacters.remove(allCharacters.get(indexOfCharacter));


                                            }
                                        } else if (enemyList.contains(allCharacters.get(indexOfCharacter))) {

                                            if (allCharacters.get(indexOfCharacter).getCurrentHP() <= 0) {

                                                if (!(allCharacters.get(indexOfCharacter).getCurrentWeapon() == null)) {
                                                    allCharacters.get(indexOfCharacter).dropInventory(allCharacters.get(indexOfCharacter).getCurrentWeapon());
                                                    dropList.add(allCharacters.get(indexOfCharacter).getCurrentWeapon());

                                                }
                                                if (!(allCharacters.get(indexOfCharacter).getCurrentArmor() == null)) {
                                                    allCharacters.get(indexOfCharacter).dropInventory(allCharacters.get(indexOfCharacter).getCurrentArmor());
                                                    dropList.add(allCharacters.get(indexOfCharacter).getCurrentArmor());
                                                }
                                                System.out.print(allCharacters.get(indexOfCharacter).getNameOfCharacter() + " is dead. " + allCharacters.get(indexOfCharacter).getNameOfCharacter()
                                                        + " drops a " + dropList.get(0).getName() + "\n");


                                                enemyList.remove(allCharacters.get(indexOfCharacter));
                                                allCharacters.remove(allCharacters.get(indexOfCharacter));


                                            }
                                        }
                                        turn = false;
                                    }
                                    else{
                                        System.out.println("Fighter is dead.");
                                    }
                                    break;

                                case 2:
                                    for (int a = 0; a < allCharacters.size(); a++) {
                                        System.out.println("Name: " + allCharacters.get(a).getNameOfCharacter() + " HP: " + allCharacters.get(a).getCurrentHP());

                                    }
                                    System.out.println("Type name of character to attack: ");
                                    int indexOfCharacter1 = 0;
                                    String nameOfCharacter1 = scanner.nextLine();

                                    boolean flag1 = true;
                                    while (flag1) {
                                        for (int a = 0; a < allCharacters.size(); a++) {
                                            if (allCharacters.get(a).getNameOfCharacter().equals(nameOfCharacter1)) {
                                                flag1 = false;
                                                break;
                                            } else {
                                                indexOfCharacter1++;
                                            }

                                        }
                                    }

                                    tank.attack(tank, allCharacters.get(indexOfCharacter1));
                                    if (allyArrayList.contains(allCharacters.get(indexOfCharacter1))) {
                                        if (allCharacters.get(indexOfCharacter1).getCurrentHP() <= 0) {

                                            if (!(allCharacters.get(indexOfCharacter1).getCurrentWeapon() == null)) {
                                                allCharacters.get(indexOfCharacter1).dropInventory(allCharacters.get(indexOfCharacter1).getCurrentWeapon());
                                                dropList.add(allCharacters.get(indexOfCharacter1).getCurrentWeapon());

                                            }
                                            if (!(allCharacters.get(indexOfCharacter1).getCurrentArmor() == null)) {
                                                allCharacters.get(indexOfCharacter1).dropInventory(allCharacters.get(indexOfCharacter1).getCurrentArmor());
                                                dropList.add(allCharacters.get(indexOfCharacter1).getCurrentArmor());
                                            }
                                            System.out.print(allCharacters.get(indexOfCharacter1).getNameOfCharacter() + " is dead. "+allCharacters.get(indexOfCharacter1).getNameOfCharacter()
                                                    +" drops a "+dropList.get(0).getName()+"\n");
                                            allyArrayList.remove(allCharacters.get(indexOfCharacter1));
                                            allCharacters.remove(allCharacters.get(indexOfCharacter1));


                                        }
                                    } else if (enemyList.contains(allCharacters.get(indexOfCharacter1))) {
                                        if (allCharacters.get(indexOfCharacter1).getCurrentHP() <= 0) {
                                            System.out.println(allCharacters.get(indexOfCharacter1).getNameOfCharacter() + " is died.");
                                            if (!(allCharacters.get(indexOfCharacter1).getCurrentWeapon() == null)) {

                                                allCharacters.get(indexOfCharacter1).dropInventory(allCharacters.get(indexOfCharacter1).getCurrentWeapon());
                                                dropList.add(allCharacters.get(indexOfCharacter1).getCurrentWeapon());

                                            }
                                            if (!(allCharacters.get(indexOfCharacter1).getCurrentArmor() == null)) {
                                                allCharacters.get(indexOfCharacter1).dropInventory(allCharacters.get(indexOfCharacter1).getCurrentArmor());
                                                dropList.add(allCharacters.get(indexOfCharacter1).getCurrentArmor());
                                            }
                                            System.out.print(allCharacters.get(indexOfCharacter1).getNameOfCharacter() + " is dead. "+allCharacters.get(indexOfCharacter1).getNameOfCharacter()
                                                    +" drops a "+dropList.get(0).getName()+"\n");
                                            enemyList.remove(allCharacters.get(indexOfCharacter1));
                                            allCharacters.remove(allCharacters.get(indexOfCharacter1));


                                        }
                                    }
                                    turn = false;
                                    break;
                                case 3:
                                    for (int a = 0; a < allCharacters.size(); a++) {
                                        System.out.println("Name: " + allCharacters.get(a).getNameOfCharacter() + " HP: " + allCharacters.get(a).getCurrentHP());

                                    }
                                    System.out.println("Type name of character to attack: ");
                                    int indexOfCharacter2 = 0;
                                    String nameOfCharacter2 = scanner.nextLine();

                                    boolean flag2 = true;
                                    while (flag2) {
                                        for (int a = 0; a < allCharacters.size(); a++) {
                                            if (allCharacters.get(a).getNameOfCharacter().equals(nameOfCharacter2)) {
                                                flag2 = false;
                                                break;
                                            } else {
                                                indexOfCharacter2++;
                                            }

                                        }
                                    }

                                    healer.attack(healer, allCharacters.get(indexOfCharacter2));
                                    if (allyArrayList.contains(allCharacters.get(indexOfCharacter2))) {
                                        if (allCharacters.get(indexOfCharacter2).getCurrentHP() <= 0) {
                                            System.out.println(allCharacters.get(indexOfCharacter2).getNameOfCharacter() + " is died.");
                                            if (!(allCharacters.get(indexOfCharacter2).getCurrentWeapon() == null)) {

                                                allCharacters.get(indexOfCharacter2).dropInventory(allCharacters.get(indexOfCharacter2).getCurrentWeapon());

                                            }
                                            if (!(allCharacters.get(indexOfCharacter2).getCurrentArmor() == null)) {

                                                allCharacters.get(indexOfCharacter2).dropInventory(allCharacters.get(indexOfCharacter2).getCurrentArmor());
                                            }
                                            System.out.print(allCharacters.get(indexOfCharacter2).getNameOfCharacter() + " is dead. "+allCharacters.get(indexOfCharacter2).getNameOfCharacter()
                                                    +" drops a "+dropList.get(0).getName()+"\n");
                                            allyArrayList.remove(allCharacters.get(indexOfCharacter2));
                                            allCharacters.remove(allCharacters.get(indexOfCharacter2));


                                        }
                                    } else if (enemyList.contains(allCharacters.get(indexOfCharacter2))) {
                                        if (allCharacters.get(indexOfCharacter2).getCurrentHP() <= 0) {
                                            System.out.println(allCharacters.get(indexOfCharacter2).getNameOfCharacter() + " is died.");
                                            if (!(allCharacters.get(indexOfCharacter2).getCurrentWeapon() == null)) {
                                                allCharacters.get(indexOfCharacter2).dropInventory(allCharacters.get(indexOfCharacter2).getCurrentWeapon());

                                            }
                                            if (!(allCharacters.get(indexOfCharacter2).getCurrentArmor() == null)) {
                                                allCharacters.get(indexOfCharacter2).dropInventory(allCharacters.get(indexOfCharacter2).getCurrentArmor());
                                            }
                                            System.out.print(allCharacters.get(indexOfCharacter2).getNameOfCharacter() + " is dead. "+allCharacters.get(indexOfCharacter2).getNameOfCharacter()
                                                    +" drops a "+dropList.get(0).getName()+"\n");
                                            enemyList.remove(allCharacters.get(indexOfCharacter2));
                                            allCharacters.remove(allCharacters.get(indexOfCharacter2));


                                        }
                                    }
                                    turn = false;
                                    break;
                                default:
                                    System.out.println("Try again!");
                                    break;
                            }
                            break;
                        case "pick":
                            if (dropList.size() <= 0) {
                                System.out.println("There is no items can be picked!");
                                break;

                            }

                            System.out.println("Type '1' to pick an item for Kane");
                            System.out.println("Type '2' to pick an item for Braum");
                            System.out.println("Type '3' to pick an item for Sona");
                            int choice2 = scanner.nextInt();
                            scanner.nextLine();

                            switch (choice2) {
                                case 1:
                                    for (int a = 0; a < dropList.size(); a++) {
                                        System.out.println("Name: " + dropList.get(a).getName() + "\nWeight: " + dropList.get(a).getWeight() + "\nDamage or Protection: " + dropList.get(a).getValue());

                                    }
                                    System.out.println("Type name of which item do you want to pick?");
                                    String pickedItem = scanner.nextLine();
                                    boolean control1 = true;
                                    for (int a = 0; a < dropList.size(); a++) {
                                        if (dropList.get(a).getName().equals(pickedItem)) {
                                            fighter.sendInventory(dropList.get(a));

                                            break;
                                        }

                                    }



                                    break;
                                case 2:
                                    for (int a = 0; a < dropList.size(); a++) {
                                        System.out.println("Name: " + dropList.get(a).getName() + "\nWeight: " + dropList.get(a).getWeight() + "\nDamage or Protection: " + dropList.get(a).getValue());

                                    }
                                    System.out.println("Type name of which item do you want to pick?");
                                    String pickedItem1 = scanner.nextLine();
                                    for (int a = 0; a < dropList.size(); a++) {
                                        if (dropList.get(a).getName().equals(pickedItem1)) {
                                            healer.sendInventory(dropList.get(a));
                                        }
                                    }
                                    break;
                                case 3:
                                    for (int a = 0; a < dropList.size(); a++) {
                                        System.out.println("Name: " + dropList.get(a).getName() + "\nWeight: " + dropList.get(a).getWeight() + "\nDamage or Protection: " + dropList.get(a).getValue());

                                    }
                                    System.out.println("Type name of which item do you want to pick?");
                                    String pickedItem2 = scanner.nextLine();
                                    for (int a = 0; a < dropList.size(); a++) {
                                        if (dropList.get(a).getName().equals(pickedItem2)) {
                                            tank.sendInventory(dropList.get(a));
                                        }
                                    }
                                    break;

                                default:
                                    System.out.println("The item your selected is not exist!");
                                    break;


                            }
                            break;
                        case "wield":
                            System.out.println("Type '1' to wield an item for Kane");
                            System.out.println("Type '2' to wield an item for Braum");
                            System.out.println("Type '3' to wield an item for Sona");
                            int choice3 = scanner.nextInt();
                            scanner.nextLine();
                            switch (choice3) {
                                case 1:
                                    if((fighter.getCurrentWeapon()==null)) {
                                        for (int a = 0; a < fighter.getInventory().size(); a++) {
                                            System.out.println("Name: " + fighter.getInventory().get(a).getName() + "\nWeight:" + fighter.getInventory().get(a).getWeight() + "\nDamage or Protection: " +
                                                    fighter.getInventory().get(a).getValue());

                                        }
                                        System.out.println("Type name of which item do you want to wield?");
                                        String wieldedItem = scanner.nextLine();
                                        boolean control = true;
                                        for (int a = 0; a < fighter.getInventory().size(); a++) {
                                            if (fighter.getInventory().get(a).getName().equals(wieldedItem)) {
                                                fighter.wield(fighter.getInventory().get(a));
                                                System.out.println(fighter.getNameOfCharacter() + " wielded " + fighter.getInventory().get(a).getName());
                                                control = false;
                                                break;
                                            }
                                        }
                                        if (control == true) {
                                            System.out.println("You don't have this item.");
                                            break;


                                        }
                                    }
                                    else {
                                        System.out.println("You have weapon already!");
                                    }

                                    break;
                                case 2:
                                    if((tank.getCurrentWeapon()==null)) {
                                        for (int a = 0; a < tank.getInventory().size(); a++) {
                                            System.out.println("Name: " + tank.getInventory().get(a).getName() + "\n Weight:" + tank.getInventory().get(a).getWeight() + "\n Damage or Protection: " +
                                                    tank.getInventory().get(a).getValue());

                                        }
                                        System.out.println("Type name of which item do you want to wield?");
                                        String wieldedItem = scanner.nextLine();
                                        boolean control = true;
                                        for (int a = 0; a < tank.getInventory().size(); a++) {
                                            if (tank.getInventory().get(a).getName().equals(wieldedItem)) {
                                                tank.wield(tank.getInventory().get(a));
                                                System.out.println(tank.getNameOfCharacter() + " wielded " + tank.getInventory().get(a).getName());
                                                control = false;
                                                break;
                                            }
                                        }
                                        if (control == true) {
                                            System.out.println("You don't have this item.");
                                            break;


                                        }
                                    }
                                    else {
                                        System.out.println("You have weapon already!");
                                    }
                                    break;
                                case 3:
                                    if((healer.getCurrentWeapon()==null)) {
                                        for (int a = 0; a < healer.getInventory().size(); a++) {
                                            System.out.println("Name: " + healer.getInventory().get(a).getName() + "\n Weight:" + healer.getInventory().get(a).getWeight() + "\n Damage or Protection: " +
                                                    healer.getInventory().get(a).getValue());

                                        }
                                        System.out.println("Type name of which item do you want to wield?");
                                        String wieldedItem = scanner.nextLine();
                                        boolean control = true;
                                        for (int a = 0; a < healer.getInventory().size(); a++) {
                                            if (healer.getInventory().get(a).getName().equals(wieldedItem)) {
                                                healer.wield(fighter.getInventory().get(a));
                                                System.out.println(healer.getNameOfCharacter() + " wielded " + healer.getInventory().get(a).getName());
                                                control = false;
                                                break;
                                            }
                                        }
                                        if (control == true) {
                                            System.out.println("You don't have this item.");
                                            break;


                                        }
                                    }
                                    else {
                                        System.out.println("You have weapon already!");
                                    }
                                    break;

                                default:
                                    System.out.println("Try again!");
                                    break;

                            }
                            break;
                        case "examine":





                            break;
                    }


                }
                //enemy attack
                while (!turn) {
                    if (tank.getCurrentHP() > 0) {
                        if (enemyList.size() == 0) {
                            break;
                        }
                        int indexRandom = random.nextInt(enemyList.size());
                        enemyList.get(indexRandom).attack(enemyList.get(indexRandom), tank);
                        if (tank.getCurrentHP() <= 0) { // SPECIAL ACTION CURRENT WEAPON NULL'A eşitlenir ve override attack metodunda if null'ı düzeltilir.
                            allCharacters.remove(tank);
                            allyArrayList.remove(tank);
                        }


                        turn = true;
                        break;
                    } else if (fighter.getCurrentHP() > 0) {
                        //fightera vur
                        int indexRandom = random.nextInt(enemyList.size());
                        enemyList.get(indexRandom).attack(enemyList.get(indexRandom), fighter);
                        if (fighter.getCurrentHP() <= 0) {
                            allCharacters.remove(fighter);
                            allyArrayList.remove(fighter);
                        }

                        turn = true;
                        break;
                    } else if (healer.getCurrentHP() > 0) {
                        //healera vur
                        int indexRandom = random.nextInt(enemyList.size());
                        enemyList.get(indexRandom).attack(enemyList.get(indexRandom), healer);
                        if (fighter.getCurrentHP() <= 0) {
                            allCharacters.remove(healer);
                            allyArrayList.remove(healer);
                        }

                        turn = true;
                        break;
                    } else {
                        System.out.println("Oyunu bitiremedin!");
                    }
                    break;
                }

            }

        }
        if (allyArrayList.size() == 0) {
            System.out.println("GAME OVER!");
        }

    }
}
