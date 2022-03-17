package genprocess;
public class ProcessGenerator {

    static String name;
    static int identified = 0;
    static float memory;
    static int burst;
    static int inputTime;
    static int count = 0;
    static int numRandom;
    static String priority;

    public static void generator() {
        count++;
        identified++;
        name = "Proceso " + count;
        randomPriority();
        randomMemory();
        randomBurst();
        randomInputTime();
    }

    private static void randomPriority() {
        numRandom = (int) (Math.random() * 10);
        if (numRandom > 5) {
            numRandom = numRandom - 5;
        }
        switch (numRandom) {
            case 1: priority = "Baja"; break;
            case 3: priority = "Alta"; break;
            case 4: priority = "Muy_Alta"; break;
            default: priority = "Normal";
        }
    }

    private static void randomMemory() {
        memory = (float) (Math.random() * 1000);
    }

    private static void randomBurst() {
        burst = (int) (Math.random() * 10);
    }

    private static void randomInputTime() {
        inputTime = (int) (Math.random() * 10);
    }

    public static String getName() {
        return name;
    }

    public static int getIdentified() {
        return identified;
    }

    public static float getMemory() {
        return memory;
    }

    public static int getBurst() {
        return burst;
    }

    public static int getInputTime() {
        return inputTime;
    }

    public static int getCount() {
        return count;
    }

    public static String getPriority() {
        return priority;
    }
}

