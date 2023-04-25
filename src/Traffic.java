public class Traffic {

    public static String getAction(Lights light) {
        switch (light) {
            case RED:
                return "Stop";
            case YELLOW:
                return "Get ready";
            case GREEN:
                return "Go";
            default:
                return "Invalid traffic light color";
        }
    }

    public static void main(String[] args) {
        Lights light1 = Lights.RED;
        Lights light2 = Lights.YELLOW;
        Lights light3 = Lights.GREEN;

        System.out.println("For red traffic light: " + getAction(light1));
        System.out.println("For yellow traffic light: " + getAction(light2));
        System.out.println("For traffic light green: " + getAction(light3));
    }
}

