public class Fijuras3D {
    private float lado;
    private float base;
    private float altura;
    private float area;
    private float radio;
    private float volumen;

    //Constructor
    public Fijuras3D(float lado, float base, float altura, float area, float radio, float volumen) {
        this.lado = lado;
        this.base = base;
        this.altura = altura;
        this.area = area;
        this.radio = radio;
        this.volumen = volumen;
    }

    //Setters and Getters

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getVolumen() {
        return volumen;
    }

    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }
}
