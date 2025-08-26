public class Rectangulo {
    private Punto puntoEsquina;
    private float lado1;
    private float lado2;

    public Rectangulo(Punto puntoEsquina, float lado1, float lado2){
        this.puntoEsquina = puntoEsquina;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void imprimirRectangulo(){
        System.out.println("RECTANGULO");
        System.out.println(" Esquina: "+puntoEsquina+" Lado #1: "+lado1+" Lado #2: "+lado2);
        System.out.println();

    }
}
