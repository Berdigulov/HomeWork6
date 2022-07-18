public class Boss extends GameEntity {
    private Weapon bossWeapon;

    public Weapon getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(Weapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }

    public String printInfo(){
        return "Health: " + getHealth() + " Damage: " + getDamage();
    }
}
