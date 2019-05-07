package com.company;

public class ThreadName extends  Thread {

    private String nombre;

    private long initialTime;

    private int tiempoEspera;

    public ThreadName(){

    }

    public ThreadName(String nombre, long initialTime, int tiempoEspera){
        this.nombre = nombre;
        this.initialTime = initialTime;
        this.tiempoEspera = tiempoEspera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    @Override
    public void run() {
        System.out.println("Hola Mundo!! desde hilo número " + this.nombre);

            this.esperarXsegundos(tiempoEspera);
            System.out.println("El thread " + this.nombre + " , "+ (System.currentTimeMillis() - this.initialTime) / 1000 + " Segundos");

    }

    private void esperarXsegundos(int segundos){
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
}
