package dev.brunoliveira.oop.composicao;

public class Motor {

    double rpm = 3000.0;
    boolean enabled = true;

    int speed() {
        if (enabled) {
            return (int) Math.round(rpm * 60);
        } else {
            return 0;
        }
    }

}
