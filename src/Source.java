public class Source {
    public static void main(String[] args) {
        String name ="great blue heron";
        String dish = "garlic nann";
        System.out.println(feast(name,dish));
    }
    public static boolean feast(String beast, String dish) {
        return beast.charAt(0)==dish.charAt(0) && beast.charAt(beast.length()-1)==dish.charAt(dish.length()-1);
    }
}
