public class Demo6TaskD {
    public static void main(String[] args) {
        

        String color = "\033[";
        String price1 = "\033[32m$\033[0m\033[95m0.99\033[0m";
        String price2 = "\033[32m$\033[0m\033[95m1.49\033[0m";


        
        System.out.printf("%1$s38;5;208m+" + "-".repeat(17) + "+" + "-".repeat(13) + "+" + "-".repeat(6)+ "+%1$s0m\n", color);
        System.out.printf("%4$s38;5;208m|%4$s0m%4$s1m%-17s%4$s0m%4$s38;5;208m|%4$s0m%4$s1m%13s%4$s0m%4$s38;5;208m|%4$s0m%4$s1m%6s%4$s0m%4$s38;5;208m|%4$s0m\n", "ITEM", "QUANTITY", "PRICE", color);
        System.out.printf("%1$s38;5;208m+" + "%1$s32m-%1$s38;5;208m".repeat(17) + "+" + "-".repeat(13) + "+" + "%1$s32m-%1$s38;5;208m".repeat(6)+ "+%1$s0m\n", color);
        System.out.printf("%4$s38;5;208m|%4$s0m%-17s%4$s38;5;208m|%4$s0m%4$s34m%13d%4$s0m%4$s38;5;208m|%4$s0m%24s%4$s38;5;208m|%4$s0m\n", "Apples", 5, price1, color);
        System.out.printf("%4$s38;5;208m|%4$s0m%-17s%4$s38;5;208m|%4$s0m%4$s34m%13d%4$s0m%4$s38;5;208m|%4$s0m%24s%4$s38;5;208m|%4$s0m\n", "Oranges", 10, price2, color);
        System.out.printf("%1$s38;5;208m+" + "%1$s32m-%1$s38;5;208m".repeat(17) + "+" + "-".repeat(13) + "+" + "%1$s32m-%1$s38;5;208m".repeat(6)+ "+%1$s0m\n", color);
    }
}
