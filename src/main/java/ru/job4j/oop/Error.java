package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.printf("%s %d %s%n", active, status, message);
    }

    public static void main(String[] args) {
        new Error().printInfo();
        new Error(true, 1, "error1").printInfo();
        new Error(false, 2, "error2").printInfo();
    }
}
