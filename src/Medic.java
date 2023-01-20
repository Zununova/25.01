public class Medic extends Hero {
    NameAbility ability = NameAbility.Heal;

    public Medic(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void SuperAbility(Hero[] heroes, Boss boss) {

    }
}
