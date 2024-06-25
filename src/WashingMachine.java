import java.sql.Time;

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
    private void wash(){}
    private void rinse(){}
    private void fill(){}
    private void empty(){}
    private void standardWash(){}
    private void twiceRinse(){}
    public WashingMachine() {}


    public static void main(String[] args)
    {
        int option = washOption.getWashSelection();
        switch (option)
        {
            case 1 -> washingMachine.standardWash();
            case 2 -> washingMachine.twiceRinse();
            case 3 -> washingMachine.spin();
        }
    }


    private void spin()
    {
        engine.turnOn();
        timer.setDuration(2000);

        // period implementation
        timer.start();
        int time = timer.getValue();
        int duration = timer.getDuration();

        while (time != duration){
            time = timer.count();
        }

        engine.turnOff();

    }

}
