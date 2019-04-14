public class Triangulo{
    private double base=0;
    private double altura=0;
    private double area=0;

    public double calcularArea(){
        setArea((getBase()*getAltura())/2);
        return getArea();
    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }
    
    public double getArea(){
        return area;
    }

    public void setBase(double base){
        this.base = base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setArea(double area){
        this.area = area;
    }
}