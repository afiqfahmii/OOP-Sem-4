public class HealthInfo {
    private int height;
    private int weight;
    private double bmi;

    public HealthInfo(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public void calcBmi(){
        double weightDouble = Double.parseDouble(String.valueOf(weight));
        double heightDouble = Double.parseDouble(String.valueOf(height)) / 100;
        
         bmi = weightDouble / (heightDouble * heightDouble);
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public double getBMI() {
        calcBmi();
        return bmi;
    }

    
    
}
