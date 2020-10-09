public class Plaza extends ObraPublica{
    private String lugar;
    public Plaza(){
        super();
        lugar="en la calle";
    }
    public Plaza(String n,String a,double p,String n2,int num,String lu){
        super(n,a,p,n2,num);
        lugar=lu;
    }
    public void mostrar(){
        System.out.println("----------Plaza--------\nla plaza se enuentra en el lugar "+lugar);
        super.mostrar();
    }
    public void cuestaMass(){
        String aux=super.cuestaMas();
        System.out.println("el material mas caro es: "+aux);
    }
}
