public class Thor extends Hero{
    public Thor(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void SuperAbility(Hero[] heroes, Boss boss) {
        boolean text = false;
        boolean rand = random.nextBoolean();
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getHealth() > 0 && heroes[i].getHealth() > 0 && rand ){
                    heroes[i].setHealth(heroes[i].getHealth() + boss.getDamage());
                    text = true;
            }
        }
        if (text){
            System.out.println("Thor stand the boss");
            text = false;
        }
    }
}
