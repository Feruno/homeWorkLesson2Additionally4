package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        interface Runnable {

            void run();
        }
        class Dog implements Runnable {

            @Override
            public void run() {

            }
        }
        class Bird {
        }
        class Fish {
        }
    }
}
