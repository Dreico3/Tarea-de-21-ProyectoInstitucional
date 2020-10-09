import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        //esto solo es una prueva
        Scanner read=new Scanner(System.in);
        Puente o=new Puente();
        Puente o2=new Puente("governacion cbba", "juan", 300, "nose", 3, "region los");
        Plaza p=new Plaza();
        o.mostrar();
        p.mostrar();
        o2.mostrar();
        o.cuestaMass();
        p.cuestaMass();
        o2.cuestaMass();
        System.out.println("introdusca por cuanto quiere canviar el presupuesto");
        o.setPpto(read.nextDouble());
        o.mostrar();
        o.idenMateriales(o2);
    }
}