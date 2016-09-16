package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author baltamar
 */
public class Cafetera {

    private int capacidadMax;
    private int capacidadActual;

    public Cafetera() {
        this.capacidadMax = 1000;
        this.capacidadActual = 0;

    }

    public Cafetera(int capacidaMax, int capacidadActual) {
        this.capacidadMax = capacidaMax;
        this.capacidadActual = capacidadActual;
        
        if(this.capacidadActual>this.capacidadMax){
            this.capacidadActual=this.capacidadMax;
        }

    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void llenarCafetera() {
        int aux;
        aux = this.getCapacidadMax();

        this.setCapacidadActual(aux);
    }

    public void servirTaza(int tazas) {
        int aux,aux2;

        aux = this.getCapacidadActual() - tazas;
        
        if(aux<0){
            JOptionPane.showMessageDialog(null, "Solo se puede servir "+this.getCapacidadActual()+" tazas");
            aux2=0;
        }
        else{
            aux2=aux;
        }
        this.setCapacidadActual(aux2);
    }
    
    public void vaciarCafetera(){
        
        this.setCapacidadActual(0);
    }
    
    public void agregarCafe(int agregar){
        int aux,aux2;
        aux=this.getCapacidadActual()+agregar;
        
        if(aux>this.getCapacidadMax()){
            aux2=this.capacidadMax;
        }
        else{
            aux2=aux;
        }
        this.setCapacidadActual(aux2);
    }
    
    public String mostrar(){
        String aux;
        
        aux="Capacidad maxima: "+this.getCapacidadMax()+"\n"
                +"Cantidad actual: "+this.getCapacidadActual();
        
        return aux;
    }

}
