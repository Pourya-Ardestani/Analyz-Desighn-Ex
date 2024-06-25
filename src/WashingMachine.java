public class WashingMachine {
    private Integer washTime;
    private Integer rinseTime;
    private Integer spinTime;

    //objects
    public static WashingMachine washingMachine = new WashingMachine();

    private Timer timer;
    private Engine engine;
    private static WashOption washOption;
    private WaterSensor waterSensor;


    //methods
    public WashingMachine() {}

    public static void main(String[] args)  {

        int option = washOption.getWashSelection();

        switch (option) {
            case 1 -> washingMachine.standardWash();
            case 2 -> washingMachine.twiceRinse();
            case 3 -> washingMachine.spin();
        }
    }

    private void wash(){}

    private void rinse(){}

    private void spin() {

        engine.turnOn();
        timer.setDuration(2000);
        engine.turnOff();

    }
    void period() {

        timer.start();
        int time = timer.getValue();
        int duration = timer.getDuration();

        while (time != duration){
            time = timer.count();
        }
    }

    private void fill(){}

    private void empty(){}

    private void standardWash(){}

    private void twiceRinse(){}
}
