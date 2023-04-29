
class CPU
{
    int price;
    class Processor
    {
        double GetCache()
        {
            double cache=4.3d;
            return cache;
        }
    }
    static class Ram
    {
        static double memory=4;
        static String manucaturer="Dell";
        static double getClockspeed()
        {
            double Clockspeed=5.5d;
            return Clockspeed;
        }
    }
}

public class task6 {
    public static void main(String[] args) {
        CPU cpu=new CPU();
        CPU.Ram ram=new CPU.Ram();
        CPU.Processor processor=cpu.new Processor();

        System.out.println("Cache : "+processor.GetCache());
        System.out.println("ClockSpeed : " + CPU.Ram.getClockspeed());
    }
}
