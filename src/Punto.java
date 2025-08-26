import java.sql.SQLOutput;

public class Punto {
    private float X;
    private float Y;

    public Punto(float X, float Y){
        this.X = X;
        this.Y = Y;
    }
    @Override
    public String toString(){
        return " X = " + X +" ; "+" Y = "+ Y;
    }

    public float getX() {
        return X;
    }

    public float getY() {
        return Y;
    }
}
