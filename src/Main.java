public class Main {
    public static void main(String[] args){
        //PUNTO
        Punto punto = new Punto(3,3);
        punto.toString();

        //-----------------------------------------------------------
        //LINEA
        Punto p1 = new Punto(5,7);
        Punto p2 = new Punto(1,1);
        Linea linea = new Linea(p1,p2);
        linea.imprimirLinea();

        //-----------------------------------------------------------
        //CIRCULO
        Punto puntoEsquinaCirculo = new Punto(4,4);
        Circulo circulo = new Circulo(puntoEsquinaCirculo,3);
        circulo.imprimirCirculo();

        //-----------------------------------------------------------
        //RECTÁNGULO
        Punto puntoEsquinaRectangulo = new Punto(8,8);
        Rectangulo rectangulo = new Rectangulo(puntoEsquinaRectangulo,3,8);
        rectangulo.imprimirRectangulo();

        //-----------------------------------------------------------
        //CUADRADO
        Punto puntoEsquinaCuadrado = new Punto(2,9);
        Cuadrado cuadrado = new Cuadrado(puntoEsquinaCuadrado, 10);
        cuadrado.imprimirCuadrado();

        //-----------------------------------------------------------
        //PUNTO3D
        Punto3D punto3D = new Punto3D(1,2,3);
        punto3D.imprimirPunto3D();


    }
}
