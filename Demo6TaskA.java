public class Demo6TaskA {
    public static void main(String[] args) {

        String color = "\033[";
        
        System.out.printf("%3$s41;1m[% 5d%3$s0m%3$s42;1m%-5s]%3$s0m", 5,"0%", color);
    }
}
