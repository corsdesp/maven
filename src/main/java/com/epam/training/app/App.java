package com.epam.training.app;

public class App {
    public static void main(String[] args) {
        System.out.println(checkStatus("busy"));
    }

    private static boolean checkStatus(String st) {
        return !st.equals("busy");
    }
}
