import java.util.*;

public class ObraPublica extends ProyectoIstitucional{
    protected int nm;
    protected String nombre;
    protected String [][] m;
    Scanner read=new Scanner(System.in);
    public ObraPublica(){
        super();
        nm=3;
        nombre="Gobernacion";
        m=new String[30][30];
        m[0][0]="cemento";  m[0][1]="bolsas";   m[0][2]="1";
        m[1][0]="arena";    m[1][1]="volquetas";m[1][2]="1";
        m[2][0]="piedra";    m[2][1]="volquetas";m[2][2]="1";

    }
    public ObraPublica(String n,String a,double p,String n2,int num){
        super(n,a,p);
        nombre=n2;
        nm=num;
        m=new String[30][30];
        m[0][0]="cemento";  m[0][1]="bolsas";   m[0][2]="1";
        m[1][0]="arena";    m[1][1]="volquetas";m[1][2]="1";
        m[2][0]="piedra";    m[2][1]="volquetas";m[2][2]="1";
    }
    public void leer(){
        super.leer();
        for (int i = 0; i < nm; i++) {
            System.out.print("introdusca el produto,cantidad del productoy costo\n");
            for (int j = 0; j < 3; j++) {
                m[i][j]=read.nextLine();
            }
            System.out.println();
        }
    }
    public void mostrar(){
        super.mostrar();
        for (int i = 0; i < nm; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }
    }public void idenMateriales(Puente a){
        for (int i = 0; i < nm; i++) {
            for (int j = 0; j < 3; j++) {
                if(m[i][0].equals(a.m[j][0])){
                    System.out.println("en iguales en: "+m[i][0]);
                }
            }
        }
    }
    public String cuestaMas(){
        double ce=Double.parseDouble(m[0][2]),are=Double.parseDouble(m[1][2]) ,pie =Double.parseDouble(m[2][2]);
        ce=ce*50;
        System.out.println(ce);
        pie=pie*500;
        System.out.println(pie);
        are=are*650;
        System.out.println(are);
        if(ce>pie){
            if(ce>are){
                return "cemento "+ce;
            }else{
                return "arena "+are;
            }
        }else{
            if(pie>are){
                return "piedra "+pie;
            }else{
                return "arena "+are;
            }
        }
    }
}

