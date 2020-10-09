import java.util.*;
public class ObraPublica extends ProyectoIstitucional{
    protected int nm;
    protected String nombre;
    protected String [][] m;
    Scanner read=new Scanner(System.in);
    public ObraPublica(){
        super();
        nm=2;
        nombre="Gobernacion";
        m=new String[30][30];
        m[0][0]="cemento";  m[0][1]="bolsas";   m[0][2]="1000";
        m[1][0]="arena";    m[1][1]="volquetas";m[1][2]="700";

    }
    public ObraPublica(String n,String a,double p,String n2,int num){
        super(n,a,p);
        nombre=n2;
        nm=num;
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
    }
}

