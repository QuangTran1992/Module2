public class MyMath {
    double num1;
    double num2;

    public MyMath() {
    }

    public MyMath(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public double Cong(){
        return num1 + num2;
    }
    public double Hieu(){
        return num1 - num2;
    }
    public double Chia(){
        return num1 / num2;
    }
    public double Nhan(){
        return num1 * num2;
    }

}
