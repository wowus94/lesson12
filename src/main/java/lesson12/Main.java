package lesson12;

public class Main {
    static final int SIZE = 10000000;
    static final int HALF = SIZE/2;

    public static void main (String[] args) {

        float[] array = new float[SIZE];
        Synchronization sync = new Synchronization();
        new Thread(()-> System.out.println("Выполнение подсчета в один поток: " + sync.method1(array) + " мс")).start();
        new Thread(()-> System.out.println("Выполнение подсчета в два потока: " + sync.method2(array, HALF)+ " мс")).start();
    }

}
