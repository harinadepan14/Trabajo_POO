import java.sql.SQLOutput;

public class Punto3D {
    private float X;
    private float Y;
    private float Z;

    public Punto3D(float X, float Y, float Z){
        this.X = X;
        this.Y = Y;
        this.Z = Z;
    }

    public void imprimirPunto3D(){
        System.out.println("PUNTO 3D");
        System.out.println(" X = "+X+" ; "+" Y = "+Y+" ; "+" Z = "+Z);
        System.out.println();
    }
}
