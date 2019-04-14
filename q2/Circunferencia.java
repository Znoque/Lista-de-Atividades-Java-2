public class Circunferencia{
    private double raio=0;
    private double area=0;
    private static final double pi=3.1416;

    public double calcularArea(){
        setArea(getPi()*(getRaio()*getRaio()));
        return getArea();
    }

    public double getRaio(){
        return raio;
    }
    
    public static double getPi(){
        return pi;
    }

    public double getArea(){
        return area;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public void setArea(double area){
        this.area = area;
    }
}