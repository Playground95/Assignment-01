public class Demo6TaskC {
    public static void main(String[] args) {
        
        String color = "\033[";
        String city2 = "\033[32mNew\033[0m York";

        
        System.out.printf("%1$s38;5;208m+" + "-".repeat(17) + "+" + "-".repeat(13) + "+" + "-".repeat(12)+ "+%1$s0m\n", color);
        System.out.printf("%4$s38;5;208m|%4$s0m%4$s1m%-17s%4$s0m%4$s38;5;208m|%4$s0m%4$s1m%-13s%4$s0m%4$s38;5;208m|%4$s0m%4$s1m%12s%4$s0m%4$s38;5;208m|%4$s0m\n", "CITY", "STATE", "POPULATION", color);
        System.out.printf("%1$s38;5;208m+" + "-".repeat(17) + "+" + "-".repeat(13) + "+" + "-".repeat(12)+ "+%1$s0m\n", color);
        System.out.printf("%4$s38;5;208m|%4$s0m%-17s%4$s38;5;208m|%4$s0m%-13s%4$s38;5;208m|%4$s0m%4$s95m%,12d%4$s0m%4$s38;5;208m|%4$s0m\n", "Los Angeles", "California", 3966936, color);
        System.out.printf("%1$s38;5;208m+" + "-".repeat(17) + "+" + "-".repeat(13) + "+" + "-".repeat(12)+ "+%1$s0m\n", color);
        System.out.printf("%3$s38;5;208m|%3$s0m%-26s%3$s38;5;208m|%3$s0m%1$-22s%3$s0m%3$s38;5;208m|%3$s0m%3$s95m%,12d%3$s0m%3$s38;5;208m|%3$s0m\n", city2, 8336817, color);
        System.out.printf("%1$s38;5;208m+" + "-".repeat(17) + "+" + "-".repeat(13) + "+" + "-".repeat(12)+ "+%1$s0m\n", color);
        
    }
}
