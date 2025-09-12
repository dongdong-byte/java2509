package sec12.hankook;

public class SnowTire {
//    필드 선언
    final static String model = "한국 타이어";
    String modelName;
    int Load_Index;
    int Treadwear;
    int speedWear;
    int rolling_resistance;
    String tireStandard;

    public SnowTire(String modelName, int Load_Index, int Treadwear, int speedWear, int rolling_resistance, String tireStandard, String model) {
        this.Load_Index = Load_Index;

        this.Treadwear = Treadwear;
        this.speedWear = speedWear;
        this.rolling_resistance = rolling_resistance;
        this.tireStandard = tireStandard;
        this.modelName = modelName;


    }
}
