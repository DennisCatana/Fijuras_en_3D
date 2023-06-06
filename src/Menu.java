public class Menu {
    public static void main(String[] args) {
        Fijuras3D cubo = new Fijuras3D(0,0,0,0);
        Fijuras3D cilindro = new Fijuras3D(0,0,0,3);
        Fijuras3D piramide = new Fijuras3D(0,0,0,0);
        Fijuras3D esfera = new Fijuras3D(0,0,0,0);

        cilindro.volumencilindro(3,3);
        cubo.volumencubo(5);
        piramide.volumenpiramide(6,9);
        esfera.volumenesfera(9);
    }
}
