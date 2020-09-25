package by.naumenka.linearprogramm.controller;

import by.naumenka.linearprogramm.service.Detection;

public class Locator {
    public static void main(String[] args) {
        System.out.println("Algorithm that determines which point is closest to the origin");
        Detection detect = new Detection();
        detect.functional();
    }
}
