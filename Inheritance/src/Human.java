public class Human {

    protected String occupation;
    protected double height;
    protected int yob;

    public double getHeight() {
        return height;
    }

    public String getOccupation() {
        return occupation;
    }

    public double getYob() {
        return yob;
    }

    public Human() {
    }

    public Human(String o, double h, int y) {
        this.occupation = o;
        this.height = h;
        this.yob = y;
    }

    @Override
    public String toString() {
        return "Human [Occupation=" + occupation + ", height=" + height + ", yob=" + yob + "]";
    }

}
