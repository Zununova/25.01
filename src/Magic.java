public class Magic extends  Hero{
    NameAbility ability = NameAbility.Magic_Power;

    public Magic(int health, int damage) {
        super(health, damage);

    }

    @Override
    public void SuperAbility(Hero[] heroes, Boss boss) {
        boolean text =false;
        for (int i = 0; i < heroes.length ; i++) {
            if (boss.getHealth() > 0 && heroes[i].getHealth() >0) {
                heroes[i]. setDamage(getDamage() + 5);
                text = true;


            }
        }
        if (text){
            System.out.println("Magic up damage heroes on 5");
            text=false;
        }
    }
}
