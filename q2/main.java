public class main{
    public static void main(String[] args){
        Triangulo t = new Triangulo();
        t.setBase(10);
        t.setAltura(5);
        System.out.println(t.calcularArea());

        Quadrado q = new Quadrado();
        q.setLado(4);
        System.out.println(q.calcularArea());

        Circunferencia c = new Circunferencia();
        c.setRaio(4);
        System.out.println(c.calcularArea());

        Trapezio trap = new Trapezio();
        trap.setBM(20);
        trap.setBm(10);
        trap.setAltura(5);
        System.out.println(trap.calcularArea());
    }
}