package com.company;

public class Main {

    public static void main(String[] args) {


        long initialTime = System.currentTimeMillis();

        ThreadName primero = new ThreadName("Uno",initialTime,1);
        ThreadName segundo = new ThreadName("Dos",initialTime,2);
        ThreadName tercero = new ThreadName("Tres",initialTime,3);
        ThreadName cuarto = new ThreadName("Cuatro",initialTime,4);
        ThreadName quinto = new ThreadName("Cinco",initialTime,5);
        ThreadName sexto = new ThreadName("Seis",initialTime,6);

        primero.start();
        segundo.start();
        tercero.start();
        cuarto.start();
        quinto.start();
        sexto.start();
    }
}
