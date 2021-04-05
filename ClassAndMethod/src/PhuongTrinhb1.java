public class PhuongTrinhb1 {
    double a;
    double b;

    public PhuongTrinhb1() {
    }

    public PhuongTrinhb1(double a, double b) {
        this.a = a;
        this.b = b;
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
    public void  GPT(){
       if (this.a != 0 ) {
           System.out.println("pt co nghiem la :" + -this.b/this.a);
       }else if (this.b == 0  ){
           System.out.println(" pt VSN");
       }else {
            System.out.println(" pt VN");
        }
    }
}
