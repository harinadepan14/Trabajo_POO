public class Cuadrado {
    private Punto puntoEsquina;
    private float lado;

    public Cuadrado(Punto puntoEsquina, float lado){
        this.puntoEsquina = puntoEsquina;
        this.lado = lado;
    }

    public void imprimirCuadrado(){
        System.out.println("CUADRADO");
        System.out.println(" Esquina: "+puntoEsquina+" Lado: "+lado);
        System.out.println();
    }
}
