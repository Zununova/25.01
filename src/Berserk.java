public class Berserk extends Hero{
    NameAbility ability = NameAbility.Inflict_More_Damage;
    public Berserk(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void SuperAbility(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
                if(boss.getHealth() > 0 && heroes[i].getHealth() >0 && heroes[i].getClass().getName() =="Berserk"){

                }
        }
    }
}

