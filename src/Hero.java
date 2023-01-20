import java.util.Random;

public abstract class Hero extends GameEntity implements HavingSuperAbility {
     Random random = new Random();

    public Hero(int health, int damage) {
        super(health, damage);
    }

    public abstract void SuperAbility(Hero[] heroes, Boss boss);
}
