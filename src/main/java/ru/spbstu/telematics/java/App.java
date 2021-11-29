package ru.spbstu.telematics.java;

public class App 
{
    public static void main( String[] args ) {
        ActionContainer generator = new ActionContainer(6065038420L);
        for (Action currentAction : generator) {
            System.out.println(currentAction.toString() + "  " + currentAction.getSeed());
        }
    }
}
