package com.ks.PadreConHijos;

public class modelo {
    public void run(){
        Padre padre=new Padre();
        System.out.println("Padre: ");
        padre.decripcion();
        System.out.println("\nEstos son mis hijos e hijas: ");
        System.out.println("\nHijo 1");
        Padre hijo1= new Hijos("Me gusta cantar","No me gusta caminar","Solo se hablar español",4,9,"niña","blanca como mi mamá","verdes como mi papa","No deberia mentir dice papá","No juego mucho");
        hijo1.decripcion();
        System.out.println("\nHijo 2");
        Padre hijo2= new Hijos("Odio cantar","Me encanta caminar","hablo español y frances",5,7,"niño","blanca como mi mamá","verdes como mi papa","No deberia mentir dice papá","Me encanta el foot");
        hijo2.decripcion();
        System.out.println("\nHijo 3");
        Padre hijo3= new Hijos("Me gusta cantar en fiestas familiares","No me gusta caminar me fatigo","Solo se hablar español y un poco ingles",3,8,"niño","morena como mi padre","cafe como mi mama","solo miento cuando es necesario","Me gusta el americano");
        hijo3.decripcion();
    }
}
