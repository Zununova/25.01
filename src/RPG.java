public class RPG {
    Boss boss = new Boss(1000, 50);
    Magic magic = new Magic(250, 20);
    Medic doc = new Medic(200, 5);
    Medic medic = new Medic(250, 10);
    Warrior warrior = new Warrior(300, 30);
    Berserk berserk = new Berserk(250,25);
    Thor thor = new Thor(300, 0);
    Hero[] heroes = {magic, doc, medic, warrior, berserk};
     private int roundCounter;

    public void itsGame() {
        while (!itsGameFinish(boss, heroes)){
            Round(boss, heroes);
            roundCounter++;
        }

    }


    private void Statistic() {
        System.out.println("_________________________________");
        System.out.println("Round number "+ roundCounter);
        System.out.println("Boss health: " + boss.getHealth() + " damage: [" + boss.getDamage() + "]");
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].getClass().getName() + " health: " + heroes[i].getHealth() + " damage: [" + heroes[i].getDamage() + "]");
        }

    }

    private boolean itsGameFinish(Boss boss, Hero[] heroes) {
        boolean heroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0){
                heroesDead=false;
            }

        }
        if (heroesDead) {
            System.out.println("Boss winner!!!");
        }
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getHealth() <= 0) {
                System.out.println("Heroes winner!!!");
                return true;
            }

        }

        return heroesDead;
    }
    private  void BossHit(Boss boss, Hero[] heroes){
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getHealth() > 0 && heroes[i].getHealth() > 0){
                heroes[i].setHealth(heroes[i].getHealth()- boss.getDamage());
            }
        }
    }
    private void HeroesHits(Boss boss, Hero [] heroes){
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getHealth() > 0 && heroes[i].getHealth() > 0){
                boss.setHealth(boss.getHealth() - heroes[i].getDamage());
            }
        }

    }
    private void  Round (Boss boss, Hero[] heroes){
        thor.SuperAbility(heroes, boss);
        BossHit(boss, heroes);
        berserk.SuperAbility(heroes, boss);
        HeroesHits(boss, heroes);
        magic.SuperAbility(heroes, boss);
        Statistic();
    }
}