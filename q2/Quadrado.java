public class Quadrado{
    private double lado=0;
    private double area=0;

    public double calcularArea(){
        setArea(getLado()*getLado());
        return getArea();
    }

    public double getLado(){
        return lado;
    }

    public double getArea(){
        return area;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public void setArea(double area){
        this.area = area;
    }
}