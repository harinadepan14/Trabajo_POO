public class Circulo {
    private Punto puntoEsquina;
    private float radio;

    public Circulo(Punto puntoEsquina, float radio){
        this.puntoEsquina = puntoEsquina;
        this.radio = radio;
    }

    public void imprimirCirculo(){
        System.out.println("CIRCULO");
        System.out.println(" Esquina: " + puntoEsquina +" Radio: "+ radio);
        System.out.println();
    }
}
