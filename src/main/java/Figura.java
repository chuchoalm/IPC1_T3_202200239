public abstract class Figura {
    protected  int nLados;

    public Figura(int nLados) {
        this.nLados = nLados;
    }

    public int getnLados() {
        return nLados;
    }

    @Override
    public String toString() {
        return
                "numero de Lados " + nLados;
    }

    public abstract double area();
}
