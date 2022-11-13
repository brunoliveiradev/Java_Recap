package dev.brunoliveira.oop.composicao;

public class Carro {

    Motor motor = new Motor();

    void acceleration() {
        motor.rpm += 0.4;
    }

    void brake() {
        motor.rpm -= 0.4;
    }

    void start() {
        motor.enabled = true;
    }

    void stop() {
        motor.enabled = false;
    }

    boolean isRunning() {
        return motor.enabled;
    }
}
