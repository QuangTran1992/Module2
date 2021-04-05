public class PTbac2 {
    private double a,b,c;

    public PTbac2() {
    }

    public PTbac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double delta(){
         return (b*b-(4*a*c));
    }
    public double x1(){
        return  (-b +(Math.sqrt(delta())))/(2*a);
    }
    public double x2(){
        return  (-b -(Math.sqrt(delta())))/(2*a);
    }

    public void GPT(){
        if (delta() < 0  ) {
            System.out.println("Pt vo nghiem");
        }else if (delta() > 0){
            System.out.println("Pt co nghiem la :" + x1() +"and " + x2()  );
        }else
            System.out.println("Pt co nghiem la :"+ -b/2*a);

    }

}
