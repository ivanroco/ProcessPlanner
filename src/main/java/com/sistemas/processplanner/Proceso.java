package com.sistemas.processplanner;
public class Proceso {

    int numProcess;
    String name;
    int identified;
    float memory;
    String priority;
    int burst;
    int inputTime;

    public Proceso(int numProcess, String name, int identified, float memory, String priority, int burst, int inputTime) {
        this.numProcess = numProcess;
        this.name = name;
        this.identified = identified;
        this.memory = memory;
        this.priority = priority;
        this.burst = burst;
        this.inputTime = inputTime;
    }

    public String getName() {
        return name;
    }

    public int getIdentified() {
        return identified;
    }

    public float getMemory() {
        return memory;
    }

    public String getPriority() {
        return priority;
    }

    public int getBurst() {
        return burst;
    }

    public int getInputTime() {
        return inputTime;
    }

    public int getNumProcess() {
        return numProcess;
    }
}
