package Project_calculadora;

public class operacoes {
    
    private double num1;
    private double num2;

    public void numero1(double novoNumer1){
        num1 = novoNumer1;
    }
    public double getNumeroUm(){
        return num1;
    }
    public void numero2(double novoNumer2){
        num2 = novoNumer2;
    }
    public double getNumeroDois(){
        return num2;
    }
    public double somar(){
        return num1 + num2;
    }
    public double subtrair(){
        return num1 - num2;
    }
    public double multiplicar(){
        return num1 * num2;
    }
    public double dividir(){
        return num1 / num2;
    }
    public double potencia(){
        return Math.pow(num1, num2);
    }
    public double raiz(){
        return Math.sqrt(num2);
    }
}
