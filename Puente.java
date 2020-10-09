public class Puente extends ObraPublica{
    private String region1;
    private String region2;

    public Puente(){
        super();
        region1="esta es la region uno";
    }
    public Puente(String n,String a,double p,String n2,int num,String r){
        super(n,a,p,n2,num);
        region2=r;
    }
    public void mostrar(){
        System.out.println("--------Puente---------\nesta es la region "+region1);
        super.mostrar();
    }
    public void cuestaMass(){
        String aux=super.cuestaMas();
        System.out.println("el material mas caro es: "+aux);
    }
    
    
}
