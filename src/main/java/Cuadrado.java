public class Cuadrado extends Figura {

    private double lado1;

    public Cuadrado( double lado1) {
        super(4);
        this.lado1 = lado1;
    }
    public double getLado1() {
        return lado1;
    }
    @Override
    public String toString() {
        return "Cuadrado: " + super.toString()+
                "lado1=" + lado1 ;
    }

    public double area(){
        return lado1*lado1;

    }

}
