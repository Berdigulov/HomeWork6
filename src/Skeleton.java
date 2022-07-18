public class Skeleton extends Boss{
    private int arrows;
    private int healthOfSkeleton;

    @Override
    public int getHealth() {
        return healthOfSkeleton;
    }

    @Override
    public void setHealth(int health) {
        this.healthOfSkeleton = health;
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + getArrows();
    }
}
