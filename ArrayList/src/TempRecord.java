public class TempRecord {

    private String name;
    private Double temperature;
    private String remark;

    public TempRecord() {
    }

    public TempRecord(String n, Double t, String r) {
        this.name = n;
        this.temperature = t;
        this.remark = r;
    }

    public String getName() {
        return name;
    }

    public String getRemark() {
        return remark;
    }

    public Double getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Temperature Record [" + " Location =" + name + ", Remark =" + remark + ",  Temperature =" + temperature + "]";

    }

}
