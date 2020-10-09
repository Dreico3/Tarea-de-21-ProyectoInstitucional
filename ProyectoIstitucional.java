import java.util.*;
public class ProyectoIstitucional {
    protected String nombre;
    protected String autoridad;
    protected double ppto;
    Scanner read=new Scanner(System.in);
    public ProyectoIstitucional(){
        nombre="Gobernacion";
        autoridad="Lic. F. Patzi";
        ppto=200.0;
    }
    public ProyectoIstitucional(String n,String a,double p){
        nombre=n;
        autoridad=a;
        ppto=p;
    }
    public void leer(){
        System.out.println("Nombre,Autoridad y presupuesto");
        nombre=read.nextLine();
        autoridad=read.nextLine();
        ppto=read.nextDouble();
    }
    public void mostrar(){
        System.out.printf("Nombre: %s\nautoridad: %s\nPresupuesto: %.2f\n ",nombre,autoridad,ppto);
    }
    public double getPpto(){
        return this.ppto;
    }
    public void setPpto(double a){
        this.ppto=a;
    }
}
