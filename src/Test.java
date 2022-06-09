import java.util.*;

public class Test {

    public static void main(String[] args) {


        System.out.println("Game is running...");
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        Item item;
        int numbersOfEnemies;

        ArrayList<EnemySoldier> enemyList = new ArrayList<EnemySoldier>();
        ArrayList<Character> allyArrayList = new ArrayList<Character>();
        ArrayList<Character> allCharacters = new ArrayList<Character>();


        Character fighter = new Fighter("Kane", random.nextInt(5) + 6, random.nextInt(5) + 3, random.nextInt(5) + 1);
        Character tank = new Tank("Braum", random.nextInt(5) + 1, random.nextInt(5) + 6, random.nextInt(5) + 3);
        Character healer = new Healer("Sona", random.nextInt(5) + 3, random.nextInt(5) + 1, random.nextInt(5) + 6);

        Weapon shortSword = new Sword("Short Sword", 2, 3);
        Weapon boneWand = new Wand("Bone Wand", 1, 2);
        Weapon smallShield = new Shield("Small Shield", 1, 2);


        fighter.pick(shortSword);
        fighter.wield(shortSword);


        healer.pick(boneWand);
        healer.wield(boneWand);

        tank.pick(smallShield);
        tank.wield(smallShield);
        allCharacters.add(fighter);
        allCharacters.add(tank);
        allCharacters.add(healer);

        allyArrayList.add(fighter); //index=0
        allyArrayList.add(tank); //index=1
        allyArrayList.add(healer); //index=2


        while (allyArrayList.size() > 0) {

            for (int level = 0; level < Integer.MAX_VALUE; level++) {
                System.out.println("Entering level " + level + "..");
                numbersOfEnemies = Level.enemyNumber(level);

                for (int loop = 0; loop < numbersOfEnemies; loop++) {


                    EnemySoldier enemySoldier = new EnemySoldier("enemy" + (loop + 1), random.nextInt(5) + 1, random.nextInt(5) + 1, random.nextInt(5) + 1);
                    enemyList.add(enemySoldier);
                    allCharacters.add(enemySoldier);

                }
                boolean turn = true;
                while (turn) {
                    System.out.println("Type 'attack' for attack");
                    System.out.println("Type 'special' for special action");
                    System.out.println("Type 'pick' for pick an item");
                    System.out.println("Type 'wear' for wear an armor");
                    System.out.println("Type 'wield' for wield a weapon");
                    System.out.println("Type 'examine' for examine an item");
                    System.out.println("Type 'drop' for drop inventory an item");

                    String choice = scanner.nextLine();
                    choice = choice.toLowerCase();
                    switch (choice) {
                        case "attack":
                            System.out.println("Type '1' for pick Kane");
                            System.out.println("Type '2' for pick Larry");
                            System.out.println("Type '3' for pick Sona");
                            int choice1 = scanner.nextInt();
                            scanner.nextLine();

                            switch (choice1) {
                                case 1:
                                    for (int a = 0; a < allCharacters.size(); a++) {
                                        System.out.println("Name: " + allCharacters.get(a).getNameOfCharacter() + " HP: " + allCharacters.get(a).getCurrentHP());

                                    }
                                    System.out.println("Type name of character to attack: ");
                                    int indexOfCharacter = 0;
                                    String nameOfCharacter = scanner.nextLine();

                                    boolean flag = true;
                                    while (flag) {
                                        for (int a = 0; a < allCharacters.size(); a++) {
                                            flag = false;

                                        }
                                    }

                                    fighter.attack(fighter, allCharacters.get(0)); //enemy1???
                                    turn = false;
                                    break;
                                case 2:
                                    System.out.println("Select the enemy to attack: ");
                                    for (int a = 0; a < allCharacters.size(); a++) {
                                        System.out.println("Name: " + allCharacters.get(a).getNameOfCharacter() + " HP: " + allCharacters.get(a).getCurrentHP());

                                    }
                                    System.out.println("Type name of character to attack: ");
                                    int indexOfEnemy1 = 0;
                                    String nameOfEnemy1 = scanner.nextLine();
                                    boolean flag1 = true;

                                    while (flag1) {

                                        for (int a = 0; a < enemyList.size(); a++) {

                                            if (enemyList.get(a).getNameOfCharacter().equals(nameOfEnemy1)) {
                                                flag1 = false;
                                            } else if (!enemyList.get(a).getNameOfCharacter().equals(nameOfEnemy1)) {
                                                indexOfEnemy1++;
                                            }
                                        }
                                    }

                                    tank.attack(tank, enemyList.get(indexOfEnemy1));


                            }


                    }


                }
                //enemy attack
                while(!turn){
                    if(tank.getCurrentHP()>0){
                        //tanka vur

                        turn=true;
                    }
                    else if(fighter.getCurrentHP()>0){
                        //fightera vur

                        turn=true;
                    }
                    else if(healer.getCurrentHP()>0){
                        //healera vur

                        turn=true;
                    }
                    else{
                        System.out.println("Oyunu bitiremedin!");
                    }
                }
            }

        }
        if (allyArrayList.size() == 0) {
            System.out.println("GAME OVER!");
        }

    }
}
