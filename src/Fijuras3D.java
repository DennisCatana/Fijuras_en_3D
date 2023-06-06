public class Fijuras3D {
    private float lado;
    private float base;
    private float altura;
    private float area;
    private float radio;
    private float volumen;

    public Fijuras3D(float lado, float base, float altura, float radio) {
        this.lado = lado;
        this.base = base;
        this.altura = altura;
        this.radio = radio;
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
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

//FUNCIONES
    public void volumencilindro(float radio, float altura){
        volumen= (float) (3.14*(Math.pow(radio,2))*altura);
        System.out.println(volumen);
    }
    public void volumenesfera(float radio){
        volumen = (float) ((4/3) * (3.14) * Math.pow(radio,3));
        System.out.println(volumen);
    }
    public void volumencono(float radio,float altura){
        volumen = (float) ((3.14 * Math.pow(radio,2)*altura)/3);
    }
    public void volumencubo(float lado){
        volumen = (float) (Math.pow(lado,3));
        System.out.println(volumen);
    }
    public void volumenprima(float base,float altura){
        area = base * base;
        volumen = (area*altura);
        System.out.println(volumen);
        System.out.println(volumen);
    }
    public void volumenpiramide(float base,float altura){
        area = base * base;
        volumen = (area*altura)/3;
        System.out.println(volumen);
    }
}
