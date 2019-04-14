public class Trapezio{
    private double B=0;
    private double b=0;
    private double h=0;
    private double a=0;

    public double calcularArea(){
        setArea(((getBaseM()+getBasem())/2)*getAltura());
        return getArea();
    }

    public double getBaseM(){
        return B;
    }

    public double getBasem(){
        return b;
    }
    
    public double getAltura(){
        return h;
    }

    public double getArea(){
        return a;
    }

    public void setArea(double a){
        this.a = a;
    }

    public void setBM(double BM){
        B = BM;
    }

    public void setBm(double bm){
        b = bm;
    }

    public void setAltura(double h){
        this.h = h;
    }

}