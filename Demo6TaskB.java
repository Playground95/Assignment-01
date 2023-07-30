public class Demo6TaskB {
    public static void main(String[] args) {

        String color = "\033[";

        //System.out.println("+" + "-".repeat(17) + "+" + "-".repeat(5) + "+");
        System.out.printf("%1$s38;5;208m+" + "-".repeat(17) + "+" + "-".repeat(5) + "+%1$s0m\n", color);
        System.out.printf("%3$s38;5;208m|%3$s0m%3$s34;1m%-17s%3$s0m%3$s38;5;208m|%3$s0m%3$s34;1m%5s%3$s0m%3$s38;5;208m|%3$s0m\n", "NAME", "AGE", color);
        System.out.printf("%1$s38;5;208m+" + "-".repeat(17) + "+" + "-".repeat(5) + "+%1$s0m\n", color);
        System.out.printf("%3$s38;5;208m|%3$s0m%-17s%3$s38;5;208m|%3$s0m%3$s95m%5d%3$s0m%3$s38;5;208m|%3$s0m\n", "Alice", 24, color);
        System.out.printf("%3$s38;5;208m|%3$s0m%-17s%3$s38;5;208m|%3$s0m%3$s95m%5d%3$s0m%3$s38;5;208m|%3$s0m\n", "Bob", 30, color);
        System.out.printf("%1$s38;5;208m+" + "-".repeat(17) + "+" + "-".repeat(5) + "+%1$s0m\n", color);
    }
}
