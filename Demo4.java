public class Demo4 {
    public static void main(String[] args) {
        
        int day = 28;
        int month = 12;
        int year = 2023;

        int hour = 23;
        int minute = 59;
        int second = 59;

        String color = "\033[";

        System.out.printf("\"%7$s32m%d%7$s0m/%7$s33m%d%7$s0m/%7$s34m%d%7$s0m %7$s35m%d%7$s0m:%7$s36m%d%7$s0m:%7$s31m%d%7$s0m\"", month, day, year, hour, minute, second, color);

    }
}
