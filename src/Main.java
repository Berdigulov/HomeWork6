public class Main {
    public static void main(String[] args) {
        Boss bossR = new Boss();
        Weapon weaponOfBoss = new Weapon();
        weaponOfBoss.setTypeOfWeapon("Sword");
        weaponOfBoss.setNameOfWeapon("Huge");

        bossR.setDamage(90);
        bossR.setHealth(700);
        bossR.setBossWeapon(weaponOfBoss);
        System.out.println("Health of Boss: " + bossR.getHealth() + " Damage of Boss: " + bossR.getDamage()
                + " Boss's weapon: " + bossR.getBossWeapon().getNameOfWeapon() + " Type of Weapon: "
                + bossR.getBossWeapon().getTypeOfWeapon());
        System.out.println("-----------------------------------");

        System.out.println(bossR.printInfo());
        System.out.println("-----------------------------------");
        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(30);
        skeleton1.setArrows(10);
        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(34);
        skeleton2.setArrows(14);
        System.out.println(skeleton1.printInfo());
        System.out.println("-----------------------------------");
        System.out.println(skeleton2.printInfo());

    }
}