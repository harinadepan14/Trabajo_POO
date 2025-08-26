public class Linea {
    private Punto punto_1;
    private Punto punto_2;

    public Linea(Punto punto_1, Punto punto_2){
        this.punto_1 = punto_1;
        this.punto_2 = punto_2;
    }

    public void imprimirLinea(){
        System.out.println("LINEA");
        System.out.println(" Punto #1: " + punto_1.getX() + " Punto #2: "+punto_2.getY());
        System.out.println();
    }
}
