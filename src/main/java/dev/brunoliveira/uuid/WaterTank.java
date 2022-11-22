package dev.brunoliveira.uuid;

public class WaterTank {
    private String brand;
    private boolean empty;

    public static void main(String[] args) {
        WaterTank wb = new WaterTank();
        System.out.println("Empty: " + wb.empty);
        System.out.println(" brand: " + wb.brand);

        double xDouble = 44.25;
        float yFloat = 3.35F;
        double zDouble = xDouble + yFloat;
        System.out.println("double e float vira double: " + zDouble);

        short xShort = 14;
        short yShort = 6;
        int zInt = xShort / yShort;
        System.out.println("Operações matematicas entre shorts viram int: " + zInt);

        short x = 14;
        float y = 13f;
        double z = 30;
        double sum = x + y + z;
        System.out.println("Operações matematicas entre short, float e double viram double: " + sum);

        char A = 65;
        char B = (char) (A + 1);
        boolean c = (B++ == 'C');
        System.out.println(c);

        int ax = 65;
        int ay = 66;
        boolean be = (ax++ < ay);
        System.out.println(be + " BE");
    }
}
