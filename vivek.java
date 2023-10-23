public class TrafficLightSimulation {
    public static void main(String[] args) {
        String currentLight = "red";

        while (true) {
            System.out.println("Current light: " + currentLight);

            if (currentLight.equals("red")) {
                currentLight = "green";
            } else if (currentLight.equals("green")) {
                currentLight = "yellow";
            } else if (currentLight.equals("yellow")) {
                currentLight = "red";
            }

            sleep(3); // Each light lasts for 3 seconds
        }
    }

    private static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
