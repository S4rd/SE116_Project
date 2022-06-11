import java.util.*;


public class Test {


    public static void main(String[] args) {


        System.out.println("Game is running...");
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        Item item;
        int numbersOfEnemies;
        int level = 0;
        int playerScore = 0;

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

        Item lightArmor = new Armor("Light Armor", 1, 0.75);
        Item mediumArmor = new Armor("Medium Armor", 1, 0.50);
        Item heavyArmor = new Armor("Heavy Armor", 1, 0.25);

        fighter.sendInventory(shortSword);
        fighter.wield(shortSword);
        fighter.sendInventory(mediumArmor);
        fighter.wield(mediumArmor);

        healer.sendInventory(boneWand);
        healer.wield(boneWand);
        healer.sendInventory(lightArmor);
        healer.wield(lightArmor);

        tank.sendInventory(smallShield);
        tank.wield(smallShield);
        tank.sendInventory(heavyArmor);
        tank.wield(heavyArmor);

        allyArrayList.add(fighter);
        allyArrayList.add(tank);
        allyArrayList.add(healer);

        allCharacters.add(fighter);
        allCharacters.add(tank);
        allCharacters.add(healer);

        System.out.println(fighter.getNameOfCharacter() + " created with S: " + fighter.getStrength() + ", V: " + fighter.getVitality()
                + ", I: " + fighter.getIntelligence() + ". The HP is " + fighter.getMaxHP() + ". " + fighter.getNameOfCharacter() + " wields "
                + fighter.getCurrentWeapon().getName() + ", with " + fighter.getCurrentWeapon().getValue() + " damage and " + fighter.getCurrentWeapon().getWeight()
                + " units of weight.");


        System.out.println(tank.getNameOfCharacter() + " created with S: " + tank.getStrength() + ", V: " + tank.getVitality()
                + ", I: " + tank.getIntelligence() + ". The HP is " + tank.getMaxHP() + ". " + tank.getNameOfCharacter() + " wields "
                + tank.getCurrentWeapon().getName() + ", with " + tank.getCurrentWeapon().getValue() + " damage and " + tank.getCurrentWeapon().getWeight()
                + " units of weight.");


        System.out.println(healer.getNameOfCharacter() + " created with S: " + healer.getStrength() + ", V: " + healer.getVitality()
                + ", I: " + healer.getIntelligence() + ". The HP is " + healer.getMaxHP() + ". " + healer.getNameOfCharacter() + " wields "
                + healer.getCurrentWeapon().getName() + ", with " + healer.getCurrentWeapon().getValue() + " damage and " + healer.getCurrentWeapon().getWeight()
                + " units of weight.");
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
            System.out.println("Creating Level " + level + ", with " + numbersOfEnemies + " enemy soldier.");

            System.out.print("Entering level " + level + "; " + fighter.getNameOfCharacter() + " enters. " + tank.getNameOfCharacter() + " enters. " + healer.getNameOfCharacter() + " enters. ");


            for (int i = 0; i < enemyList.size(); i++) {
                System.out.print(enemyList.get(i).getNameOfCharacter() + " enters. ");

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
                    System.out.println("Type 'drop' for drop from inventory an item");
                    System.out.println("Type 'heal' for heal allies");

                    String choice = scanner.nextLine();
                    choice = choice.toLowerCase();
                    switch (choice) {
                        case "attack":

                            if (fighter.getCurrentHP() > 0) {
                                System.out.println("Type '1' for select Kane");
                            }
                            if (tank.getCurrentHP() > 0) {
                                System.out.println("Type '2' for select Braum");
                            }
                            if (healer.getCurrentHP() > 0) {
                                System.out.println("Type '3' for select Sona");
                            }


                            int choice1 = scanner.nextInt();
                            scanner.nextLine();

                            switch (choice1) {
                                case 1:
                                    if (fighter.getCurrentHP() > 0) {
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
                                        //System.out.println(fighter.getNameOfCharacter() + " does " + fighter.getStrength() * fighter.getCurrentWeapon().getValue() + " damage.");


                                        if (allyArrayList.contains(allCharacters.get(indexOfCharacter))) {
                                            if (allCharacters.get(indexOfCharacter).getCurrentHP() <= 0) {
                                                System.out.println(allCharacters.get(indexOfCharacter).getNameOfCharacter() + " is dead.  ");


                                                if (!(allCharacters.get(indexOfCharacter).getCurrentWeapon() == null)) {
                                                    dropList.add(allCharacters.get(indexOfCharacter).getCurrentWeapon());
                                                    allCharacters.get(indexOfCharacter).dropInventory(allCharacters.get(indexOfCharacter).getCurrentWeapon());
                                                    System.out.print(allCharacters.get(indexOfCharacter).getNameOfCharacter()
                                                            + " drops a " + allCharacters.get(indexOfCharacter).getCurrentWeapon().getName() + "\n");


                                                }
                                                if (!(allCharacters.get(indexOfCharacter).getCurrentArmor() == null)) {
                                                    dropList.add(allCharacters.get(indexOfCharacter).getCurrentArmor());
                                                    allCharacters.get(indexOfCharacter).dropInventory(allCharacters.get(indexOfCharacter).getCurrentArmor());
                                                    System.out.print(allCharacters.get(indexOfCharacter).getNameOfCharacter()
                                                            + " drops a " + allCharacters.get(indexOfCharacter).getCurrentArmor().getName() + "\n");


                                                }



                                                allyArrayList.remove(allCharacters.get(indexOfCharacter));
                                                allCharacters.remove(allCharacters.get(indexOfCharacter));


                                            }
                                        } else if (enemyList.contains(allCharacters.get(indexOfCharacter))) {

                                            if (allCharacters.get(indexOfCharacter).getCurrentHP() <= 0) {


                                                if (!(allCharacters.get(indexOfCharacter).getCurrentWeapon() == null)) {
                                                    dropList.add(allCharacters.get(indexOfCharacter).getCurrentWeapon());
                                                    allCharacters.get(indexOfCharacter).dropInventory(allCharacters.get(indexOfCharacter).getCurrentWeapon());


                                                }
                                                if (!(allCharacters.get(indexOfCharacter).getCurrentArmor() == null)) {
                                                    dropList.add(allCharacters.get(indexOfCharacter).getCurrentArmor());
                                                    allCharacters.get(indexOfCharacter).dropInventory(allCharacters.get(indexOfCharacter).getCurrentArmor());

                                                }
                                                System.out.print(allCharacters.get(indexOfCharacter).getNameOfCharacter() + " is dead. " + allCharacters.get(indexOfCharacter).getNameOfCharacter()
                                                        + " drops a " + dropList.get(0).getName() + "\n");


                                                enemyList.remove(allCharacters.get(indexOfCharacter));
                                                allCharacters.remove(allCharacters.get(indexOfCharacter));


                                            }
                                        }
                                        turn = false;
                                    } else {
                                        System.out.println(fighter.getNameOfCharacter() + " is dead. You can't attack with " + fighter.getNameOfCharacter() + "!");
                                    }
                                    break;

                                case 2:
                                    if (tank.getCurrentHP() > 0) {
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
                                                    dropList.add(allCharacters.get(indexOfCharacter1).getCurrentWeapon());
                                                    allCharacters.get(indexOfCharacter1).dropInventory(allCharacters.get(indexOfCharacter1).getCurrentWeapon());
                                                    System.out.print(allCharacters.get(indexOfCharacter1).getNameOfCharacter()
                                                            + " drops a " + allCharacters.get(indexOfCharacter1).getCurrentWeapon().getName() + "\n");

                                                }
                                                if (!(allCharacters.get(indexOfCharacter1).getCurrentArmor() == null)) {
                                                    dropList.add(allCharacters.get(indexOfCharacter1).getCurrentArmor());
                                                    allCharacters.get(indexOfCharacter1).dropInventory(allCharacters.get(indexOfCharacter1).getCurrentArmor());
                                                    System.out.print(allCharacters.get(indexOfCharacter1).getNameOfCharacter()
                                                            + " drops a " + allCharacters.get(indexOfCharacter1).getCurrentArmor().getName() + "\n");

                                                }

                                                allyArrayList.remove(allCharacters.get(indexOfCharacter1));
                                                allCharacters.remove(allCharacters.get(indexOfCharacter1));


                                            }
                                        } else if (enemyList.contains(allCharacters.get(indexOfCharacter1))) {
                                            if (allCharacters.get(indexOfCharacter1).getCurrentHP() <= 0) {
                                                System.out.println(allCharacters.get(indexOfCharacter1).getNameOfCharacter() + " is died.");
                                                if (!(allCharacters.get(indexOfCharacter1).getCurrentWeapon() == null)) {

                                                    dropList.add(allCharacters.get(indexOfCharacter1).getCurrentWeapon());
                                                    allCharacters.get(indexOfCharacter1).dropInventory(allCharacters.get(indexOfCharacter1).getCurrentWeapon());

                                                }
                                                if (!(allCharacters.get(indexOfCharacter1).getCurrentArmor() == null)) {
                                                    dropList.add(allCharacters.get(indexOfCharacter1).getCurrentArmor());
                                                    allCharacters.get(indexOfCharacter1).dropInventory(allCharacters.get(indexOfCharacter1).getCurrentArmor());

                                                }

                                                enemyList.remove(allCharacters.get(indexOfCharacter1));
                                                allCharacters.remove(allCharacters.get(indexOfCharacter1));


                                            }
                                        }
                                    } else {
                                        System.out.println(tank.getNameOfCharacter() + " is dead. You can't attack with " + tank.getNameOfCharacter() + "!");
                                    }
                                    turn = false;
                                    break;
                                case 3:
                                    if (healer.getCurrentHP() > 0) {
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
                                                System.out.println(allCharacters.get(indexOfCharacter2).getNameOfCharacter() + " is dead.");
                                                if (!(allCharacters.get(indexOfCharacter2).getCurrentWeapon() == null)) {
                                                    dropList.add(allCharacters.get(indexOfCharacter2).getCurrentWeapon());
                                                    allCharacters.get(indexOfCharacter2).dropInventory(allCharacters.get(indexOfCharacter2).getCurrentWeapon());

                                                }
                                                if (!(allCharacters.get(indexOfCharacter2).getCurrentArmor() == null)) {
                                                    dropList.add(allCharacters.get(indexOfCharacter2).getCurrentArmor());
                                                    allCharacters.get(indexOfCharacter2).dropInventory(allCharacters.get(indexOfCharacter2).getCurrentArmor());
                                                }
                                                System.out.print(allCharacters.get(indexOfCharacter2).getNameOfCharacter() + " is dead. " + allCharacters.get(indexOfCharacter2).getNameOfCharacter()
                                                        + " drops a " + dropList.get(0).getName() + "\n");
                                                allyArrayList.remove(allCharacters.get(indexOfCharacter2));
                                                allCharacters.remove(allCharacters.get(indexOfCharacter2));


                                            }
                                        } else if (enemyList.contains(allCharacters.get(indexOfCharacter2))) {
                                            if (allCharacters.get(indexOfCharacter2).getCurrentHP() <= 0) {
                                                System.out.println(allCharacters.get(indexOfCharacter2).getNameOfCharacter() + " is dead.");
                                                if (!(allCharacters.get(indexOfCharacter2).getCurrentWeapon() == null)) {
                                                    dropList.add(allCharacters.get(indexOfCharacter2).getCurrentWeapon());
                                                    allCharacters.get(indexOfCharacter2).dropInventory(allCharacters.get(indexOfCharacter2).getCurrentWeapon());
                                                    System.out.print(allCharacters.get(indexOfCharacter2).getNameOfCharacter()
                                                            + " drops a " + allCharacters.get(indexOfCharacter2).getCurrentWeapon().getName() + "\n");
                                                }
                                                if (!(allCharacters.get(indexOfCharacter2).getCurrentArmor() == null)) {
                                                    dropList.add(allCharacters.get(indexOfCharacter2).getCurrentArmor());
                                                    allCharacters.get(indexOfCharacter2).dropInventory(allCharacters.get(indexOfCharacter2).getCurrentArmor());
                                                    System.out.print(allCharacters.get(indexOfCharacter2).getNameOfCharacter()
                                                            + " drops a " + allCharacters.get(indexOfCharacter2).getCurrentArmor().getName() + "\n");

                                                }
                                                System.out.print(allCharacters.get(indexOfCharacter2).getNameOfCharacter() + " is dead. " + allCharacters.get(indexOfCharacter2).getNameOfCharacter()
                                                        + " drops a " + dropList.get(0).getName() + "\n");
                                                enemyList.remove(allCharacters.get(indexOfCharacter2));
                                                allCharacters.remove(allCharacters.get(indexOfCharacter2));


                                            }
                                        }
                                    } else {
                                        System.out.println(healer.getNameOfCharacter() + " is dead. You can't attack with" + healer.getNameOfCharacter() + "!");
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
                            if (fighter.getCurrentHP() > 0) {
                                System.out.println("Type '1' to pick an item for Kane");
                            }
                            if (tank.getCurrentHP() > 0) {
                                System.out.println("Type '2' to pick an item for Braum");
                            }
                            if (healer.getCurrentHP() > 0) {
                                System.out.println("Type '3' to pick an item for Sona");
                            }


                            int choice2 = scanner.nextInt();
                            scanner.nextLine();

                            switch (choice2) {
                                case 1:
                                    if (fighter.getCurrentHP() > 0) {
                                        for (int a = 0; a < dropList.size(); a++) {
                                            System.out.println("Name: " + dropList.get(a).getName() + "\nWeight: " + dropList.get(a).getWeight() + "\nDamage or Protection: " + dropList.get(a).getValue());

                                        }
                                        System.out.println("Type name of which item do you want to pick?");
                                        String pickedItem = scanner.nextLine();
                                        boolean control1 = true;
                                        for (int a = 0; a < dropList.size(); a++) {
                                            if (dropList.get(a).getName().equals(pickedItem)) {
                                                fighter.sendInventory(dropList.get(a));
                                                dropList.remove(dropList.get(a));
                                                control1 = false;
                                                break;
                                            }

                                        }
                                        if (control1 == true) {
                                            System.out.println("There is nothing to pick!");
                                        }
                                    } else {
                                        System.out.println(fighter.getNameOfCharacter() + " is dead. You can't pick for " + fighter.getNameOfCharacter() + "!");
                                    }


                                    break;
                                case 2:
                                    if (tank.getCurrentHP() > 0) {
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
                                    } else {
                                        System.out.println(tank.getNameOfCharacter() + " is dead. You can't pick for " + tank.getNameOfCharacter() + "!");
                                    }
                                    break;
                                case 3:
                                    if (healer.getCurrentHP() > 0) {
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
                                    } else {
                                        System.out.println(healer.getNameOfCharacter() + " is dead. You can't pick for " + healer.getNameOfCharacter() + "!");
                                    }
                                    break;

                                default:
                                    System.out.println("You selected wrong choice,try again!");
                                    break;


                            }
                            break;
                        case "wield":

                            if (fighter.getCurrentHP() > 0) {
                                System.out.println("Type '1' to wield an item for Kane");
                            }
                            if (tank.getCurrentHP() > 0) {
                                System.out.println("Type '2' to wield an item for Braum");
                            }
                            if (healer.getCurrentHP() > 0) {
                                System.out.println("Type '3' to wield an item for Sona");
                            }
                            int choice3 = scanner.nextInt();
                            scanner.nextLine();
                            switch (choice3) {
                                case 1:
                                    if (fighter.getCurrentHP() > 0) {
                                        if ((fighter.getCurrentWeapon() == null)) {
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
                                        } else {
                                            System.out.println("You have weapon already!");
                                        }
                                    } else {
                                        System.out.println(fighter.getNameOfCharacter() + " is dead. You can't wield for " + fighter.getNameOfCharacter() + "!");

                                    }

                                    break;
                                case 2:
                                    if (tank.getCurrentHP() > 0) {
                                        if ((tank.getCurrentWeapon() == null)) {
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
                                        } else {
                                            System.out.println("You have weapon already!");
                                        }
                                    } else {
                                        System.out.println(tank.getNameOfCharacter() + " is dead. You can't wield for " + tank.getNameOfCharacter() + "!");
                                    }

                                    break;
                                case 3:
                                    if (healer.getCurrentHP() > 0) {
                                        if ((healer.getCurrentWeapon() == null)) {
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
                                        } else {
                                            System.out.println("You have weapon already!");
                                        }
                                    } else {
                                        System.out.println(healer.getNameOfCharacter() + " is dead. You can't wield for " + healer.getNameOfCharacter() + "!");
                                    }
                                    break;

                                default:
                                    System.out.println("You selected wrongly, try again!");
                                    break;

                            }
                            break;
                        case "examine":
                            if (fighter.getCurrentHP() > 0) {
                                System.out.println("Type '1' to examine an item in Kane's inventory");
                            }
                            if (tank.getCurrentHP() > 0) {
                                System.out.println("Type '2' to examine an item in Braum's inventory");
                            }
                            if (healer.getCurrentHP() > 0) {
                                System.out.println("Type '3' to examine an item in Sona's inventory");
                            }
                            int choice4 = scanner.nextInt();
                            scanner.nextLine();
                            switch (choice4) {
                                case 1:
                                    if (fighter.getCurrentHP() > 0) {
                                        for (int a = 0; a < fighter.getInventory().size(); a++) {
                                            System.out.println("Name: " + fighter.getInventory().get(a).getName() + "\nWeight:" + fighter.getInventory().get(a).getWeight() + "\nDamage or Protection: " +
                                                    fighter.getInventory().get(a).getValue());
                                        }
                                        System.out.println("Type name of which item do you want to examine?");
                                        String examinedItem = scanner.nextLine();
                                        boolean control = true;
                                        for (int a = 0; a < tank.getInventory().size(); a++) {
                                            if (fighter.getInventory().get(a).getName().equals(examinedItem)) {
                                                fighter.examine(fighter.getInventory().get(a));
                                                control = false;
                                                break;
                                            }
                                        }
                                        if (control == true) {
                                            System.out.println("You don't have this item, You can't examine!");
                                            break;
                                        }
                                    } else {
                                        System.out.println(fighter.getNameOfCharacter() + " is dead. You can't access Kane's inventory!");
                                    }
                                    break;
                                case 2:
                                    if (tank.getCurrentHP() > 0) {
                                        for (int a = 0; a < tank.getInventory().size(); a++) {
                                            System.out.println("Name: " + tank.getInventory().get(a).getName() + "\nWeight:" + tank.getInventory().get(a).getWeight() + "\nDamage or Protection: " +
                                                    tank.getInventory().get(a).getValue());
                                        }
                                        System.out.println("Type name of which item do you want to examine?");
                                        String examinedItem = scanner.nextLine();
                                        boolean control = true;
                                        for (int a = 0; a < tank.getInventory().size(); a++) {
                                            if (tank.getInventory().get(a).getName().equals(examinedItem)) {
                                                tank.examine(tank.getInventory().get(a));
                                                control = false;
                                                break;
                                            }
                                        }
                                        if (control == true) {
                                            System.out.println("You don't have this item, You can't examine!");
                                            break;
                                        }
                                    } else {
                                        System.out.println(tank.getNameOfCharacter() + " is dead. You can't access Braum's inventory!");
                                    }
                                    break;
                                case 3:
                                    if (healer.getCurrentHP() > 0) {
                                        for (int a = 0; a < healer.getInventory().size(); a++) {
                                            System.out.println("Name: " + healer.getInventory().get(a).getName() + "\nWeight:" + healer.getInventory().get(a).getWeight() + "\nDamage or Protection: " +
                                                    healer.getInventory().get(a).getValue());
                                        }
                                        System.out.println("Type name of which item do you want to examine?");
                                        String examinedItem = scanner.nextLine();
                                        boolean control = true;
                                        for (int a = 0; a < healer.getInventory().size(); a++) {
                                            if (healer.getInventory().get(a).getName().equals(examinedItem)) {
                                                healer.examine(healer.getInventory().get(a));
                                                control = false;
                                                break;
                                            }
                                        }
                                        if (control == true) {
                                            System.out.println("You don't have this item, You can't examine!");
                                            break;
                                        }
                                    } else {
                                        System.out.println(healer.getNameOfCharacter() + " is dead. You can't access Sona's inventory!");
                                    }
                                    break;
                                default:
                                    System.out.println("You selected wrong choice, try again!");
                                    break;
                            }
                            break; // examine break;
                        case "drop":
                            if (fighter.getCurrentHP() > 0) {
                                System.out.println("Type '1' to drop an item in Kane's inventory");
                            }
                            if (tank.getCurrentHP() > 0) {
                                System.out.println("Type '2' to drop an item in Braum's inventory");
                            }
                            if (healer.getCurrentHP() > 0) {
                                System.out.println("Type '3' to drop an item in Sona's inventory");
                            }
                            int choice5 = scanner.nextInt();
                            scanner.nextLine();
                            switch (choice5) {
                                case 1:
                                    if (fighter.getInventory().size() > 0) {
                                        if (fighter.getCurrentHP() > 0) {
                                            for (int a = 0; a < fighter.getInventory().size(); a++) {
                                                System.out.println("Name: " + fighter.getInventory().get(a).getName() + "\nWeight:" + fighter.getInventory().get(a).getWeight() + "\nDamage or Protection: " +
                                                        fighter.getInventory().get(a).getValue());
                                            }
                                            System.out.println("Type name of which item do you want to drop to dropList?");
                                            String droppedItem = scanner.nextLine();
                                            boolean control = true;
                                            for (int a = 0; a < tank.getInventory().size(); a++) {
                                                if (fighter.getInventory().get(a).getName().equals(droppedItem)) {
                                                    dropList.add(fighter.getInventory().get(a));
                                                    System.out.println(fighter.getNameOfCharacter() + " successfully dropped a/an " + fighter.getInventory().get(a).getName());
                                                    fighter.dropInventory(fighter.getInventory().get(a));


                                                    control = false;
                                                    break;
                                                }
                                            }
                                            if (control == true) {
                                                System.out.println("You don't have this item, you can't drop!");
                                                break;
                                            }
                                        } else {
                                            System.out.println(fighter.getNameOfCharacter() + " is dead. You can't access Kane's inventory!");
                                        }
                                    } else {
                                        System.out.println("You don't have an item, you can't drop!");
                                    }
                                    break;
                                case 2:
                                    if (tank.getInventory().size() > 0) {
                                        if (tank.getCurrentHP() > 0) {
                                            for (int a = 0; a < tank.getInventory().size(); a++) {
                                                System.out.println("Name: " + tank.getInventory().get(a).getName() + "\nWeight:" + tank.getInventory().get(a).getWeight() + "\nDamage or Protection: " +
                                                        tank.getInventory().get(a).getValue());
                                            }
                                            System.out.println("Type name of which item do you want to drop to dropList?");
                                            String droppedItem = scanner.nextLine();
                                            boolean control = true;
                                            for (int a = 0; a < tank.getInventory().size(); a++) {
                                                if (tank.getInventory().get(a).getName().equals(droppedItem)) {
                                                    dropList.add(tank.getInventory().get(a));
                                                    System.out.println(tank.getNameOfCharacter() + " successfully dropped a/an " + tank.getInventory().get(a).getName());
                                                    tank.dropInventory(tank.getInventory().get(a));

                                                    control = false;
                                                    break;
                                                }
                                            }
                                            if (control == true) {
                                                System.out.println("You don't have this item, you can't drop!");
                                                break;
                                            }
                                        } else {
                                            System.out.println(tank.getNameOfCharacter() + " is dead. You can't access Braum's inventory!");
                                        }
                                    } else {
                                        System.out.println("You don't have an item, you can't drop!");
                                    }
                                    break;
                                case 3:
                                    if (healer.getInventory().size() > 0) {
                                        if (healer.getCurrentHP() > 0) {
                                            for (int a = 0; a < healer.getInventory().size(); a++) {
                                                System.out.println("Name: " + healer.getInventory().get(a).getName() + "\nWeight:" + healer.getInventory().get(a).getWeight() + "\nDamage or Protection: " +
                                                        healer.getInventory().get(a).getValue());
                                            }
                                            System.out.println("Type name of which item do you want to drop to dropList?");
                                            String droppedItem = scanner.nextLine();
                                            boolean control = true;
                                            for (int a = 0; a < healer.getInventory().size(); a++) {
                                                if (healer.getInventory().get(a).getName().equals(droppedItem)) {
                                                    dropList.add(healer.getInventory().get(a));
                                                    System.out.println(healer.getNameOfCharacter() + " successfully dropped a/an " + healer.getInventory().get(a).getName());
                                                    healer.dropInventory(healer.getInventory().get(a));
                                                    control = false;
                                                    break;
                                                }
                                            }
                                            if (control == true) {
                                                System.out.println("You don't have this item, You can't drop!");
                                                break;
                                            }
                                        } else {
                                            System.out.println(healer.getNameOfCharacter() + " is dead. You can't access Sona's inventory!");
                                        }
                                    } else {
                                        System.out.println("You don't have an item, you can't drop!");
                                    }
                                    break;

                                default:
                                    System.out.println("You selected wrong choice, try again!");
                                    break;
                            }
                            break;
                        case "heal":
                            if (fighter.getCurrentHP() > 0 && fighter.getCurrentWeapon().getItemType().equals("Wand")) {
                                System.out.println("Type '1' to heal a character with Kane's " + fighter.getCurrentWeapon().getName());
                            }
                            if (tank.getCurrentHP() > 0 && tank.getCurrentWeapon().getItemType().equals("Wand")) {
                                System.out.println("Type '2' to heal a character with Braum's " + tank.getCurrentWeapon().getName());
                            }
                            if (healer.getCurrentHP() > 0 && healer.getCurrentWeapon().getItemType().equals("Wand")) {
                                System.out.println("Type '3' to heal a character with Sona's " + healer.getCurrentWeapon().getName());
                            }
                            int choice6 = scanner.nextInt();
                            scanner.nextLine();
                            switch (choice6) {
                                case 1:

                                    if (fighter.getCurrentHP() > 0) {
                                        System.out.println("Type '1' to heal Kane by "+fighter.getNameOfCharacter());
                                    }
                                    if (tank.getCurrentHP() > 0) {
                                        System.out.println("Type '2' to heal Braum by "+fighter.getNameOfCharacter());
                                    }
                                    if (healer.getCurrentHP() > 0) {
                                        System.out.println("Type '3' to heal Sona by "+fighter.getNameOfCharacter());
                                    }
                                    int choice7 = scanner.nextInt();
                                    scanner.nextLine();
                                    switch (choice7) {
                                        case 1:
                                            if (fighter.getCurrentHP() > 0) {
                                                fighter.heal(fighter,fighter);
                                                turn=false;



                                            } else {
                                                System.out.println(fighter.getNameOfCharacter() + " is dead. Kane can't heal anybody!");
                                            }
                                            break;
                                        case 2:
                                            if(tank.getCurrentHP()>0){
                                                fighter.heal(fighter,tank);
                                                turn=false;


                                            }
                                            else {
                                                System.out.println(fighter.getNameOfCharacter() + " is dead. Kane can't heal anybody!");
                                            }
                                            break;
                                        case 3:
                                            if(healer.getCurrentHP()>0){
                                                fighter.heal(fighter,healer);
                                                turn=false;

                                            }
                                            else {
                                                System.out.println(fighter.getNameOfCharacter() + " is dead. Kane can't heal anybody!");
                                            }
                                            break;
                                        default:
                                            System.out.println("You select wrong number ,try again!");
                                            break;
                                    }
                                    break;
                                case 2:
                                    if (fighter.getCurrentHP() > 0) {
                                        System.out.println("Type '1' to heal Kane by "+tank.getNameOfCharacter());
                                    }
                                    if (tank.getCurrentHP() > 0) {
                                        System.out.println("Type '2' to heal Braum by"+tank.getNameOfCharacter());
                                    }
                                    if (healer.getCurrentHP() > 0) {
                                        System.out.println("Type '3' to heal Sona by"+tank.getNameOfCharacter());
                                    }
                                    int choice8 = scanner.nextInt();
                                    scanner.nextLine();
                                    switch (choice8) {
                                        case 1:
                                            if (tank.getCurrentHP() > 0) {
                                                tank.heal(tank,fighter);
                                                turn=false;



                                            } else {
                                                System.out.println(tank.getNameOfCharacter() + " is dead. Braum can't heal anybody!");
                                            }
                                            break;
                                        case 2:
                                            if(tank.getCurrentHP()>0){
                                                tank.heal(tank,tank);
                                                turn=false;


                                            }
                                            else {
                                                System.out.println(tank.getNameOfCharacter() + " is dead. Braum can't heal anybody!");
                                            }
                                            break;
                                        case 3:
                                            if(healer.getCurrentHP()>0){
                                                tank.heal(tank,healer);
                                                turn=false;

                                            }
                                            else {
                                                System.out.println(healer.getNameOfCharacter() + " is dead. Braum can't heal anybody!");
                                            }
                                            break;
                                        default:
                                            System.out.println("You select wrong number ,try again!");
                                            break;
                                    }
                                    break;
                                case 3:
                                    if (fighter.getCurrentHP() > 0) {
                                        System.out.println("Type '1' to heal Kane by "+healer.getNameOfCharacter());
                                    }
                                    if (tank.getCurrentHP() > 0) {
                                        System.out.println("Type '2' to heal Braum by"+healer.getNameOfCharacter());
                                    }
                                    if (healer.getCurrentHP() > 0) {
                                        System.out.println("Type '3' to heal Sona by"+healer.getNameOfCharacter());
                                    }
                                    int choice9 = scanner.nextInt();
                                    scanner.nextLine();
                                    switch (choice9) {
                                        case 1:
                                            if (tank.getCurrentHP() > 0) {
                                                healer.heal(healer,fighter);
                                                turn=false;



                                            } else {
                                                System.out.println(tank.getNameOfCharacter() + " is dead. Sona can't heal anybody!");
                                            }
                                            break;
                                        case 2:
                                            if(tank.getCurrentHP()>0){
                                                healer.heal(healer,tank);
                                                turn=false;


                                            }
                                            else {
                                                System.out.println(tank.getNameOfCharacter() + " is dead. Sona can't heal anybody!");
                                            }
                                            break;
                                        case 3:
                                            if(healer.getCurrentHP()>0){
                                                healer.heal(healer,healer);
                                                turn=false;

                                            }
                                            else {
                                                System.out.println(healer.getNameOfCharacter() + " is dead. Sona can't heal anybody!");
                                            }
                                            break;
                                        default:
                                            System.out.println("You select wrong number ,try again!");
                                            break;
                                    }
                                    break;



                            }
                            break;
                        default:
                            System.out.println("You select wrong action, try again!");
                            break;
                    }
                    //enemy attack
                    while (!turn) {
                        if (tank.getCurrentHP() > 0) {
                            if (enemyList.size() == 0) {
                                break;
                            }
                            int indexRandom = random.nextInt(enemyList.size());
                            enemyList.get(indexRandom).attack(enemyList.get(indexRandom), tank);
                            if (tank.getCurrentHP() <= 0) {// SPECIAL ACTION CURRENT WEAPON NULL'A eşitlenir ve override attack metodunda if null'ı düzeltilir.
                                System.out.println(tank.getNameOfCharacter()+" is dead.\n");

                                if (!(tank.getCurrentWeapon()==null)){
                                    System.out.println(tank.getNameOfCharacter()+" drops a "+tank.getCurrentWeapon());
                                    dropList.add(tank.getCurrentWeapon());
                                    tank.dropInventory(tank.getCurrentWeapon());


                                }
                                if(!(tank.getCurrentArmor()==null)){
                                    System.out.println(tank.getNameOfCharacter()+" drops a "+tank.getCurrentArmor());
                                    dropList.add(tank.getCurrentArmor());
                                    tank.dropInventory(tank.getCurrentArmor());
                                }
                                allCharacters.remove(tank);
                                allyArrayList.remove(tank);

                            }


                            turn = true;
                            break;
                        } else if (fighter.getCurrentHP() > 0) {
                            if (enemyList.size() == 0) {
                                break;
                            }
                            int indexRandom = random.nextInt(enemyList.size());
                            enemyList.get(indexRandom).attack(enemyList.get(indexRandom), fighter);
                            if (fighter.getCurrentHP() <= 0) {
                                System.out.println(fighter.getNameOfCharacter()+" is dead.\n");

                                if (!(fighter.getCurrentWeapon()==null)){
                                    System.out.println(fighter.getNameOfCharacter()+" drops a "+fighter.getCurrentWeapon());
                                    dropList.add(fighter.getCurrentWeapon());
                                    fighter.dropInventory(fighter.getCurrentWeapon());


                                }
                                if(!(fighter.getCurrentArmor()==null)){
                                    System.out.println(fighter.getNameOfCharacter()+" drops a "+fighter.getCurrentArmor());
                                    dropList.add(fighter.getCurrentArmor());
                                    fighter.dropInventory(fighter.getCurrentArmor());
                                }

                                allCharacters.remove(fighter);
                                allyArrayList.remove(fighter);
                            }

                            turn = true;
                            break;
                        } else if (healer.getCurrentHP() > 0) {
                            if (enemyList.size() == 0) {
                                break;
                            }
                            int indexRandom = random.nextInt(enemyList.size());
                            enemyList.get(indexRandom).attack(enemyList.get(indexRandom), healer);
                            if (healer.getCurrentHP() <= 0) {
                                System.out.println(healer.getNameOfCharacter()+" is dead.\n");

                                if (!(healer.getCurrentWeapon()==null)){
                                    System.out.println(healer.getNameOfCharacter()+" drops a "+healer.getCurrentWeapon());
                                    dropList.add(healer.getCurrentWeapon());
                                    healer.dropInventory(healer.getCurrentWeapon());


                                }
                                if(!(healer.getCurrentArmor()==null)){
                                    System.out.println(healer.getNameOfCharacter()+" drops a "+healer.getCurrentArmor());
                                    dropList.add(healer.getCurrentArmor());
                                    healer.dropInventory(healer.getCurrentWeapon());

                                }
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
}

