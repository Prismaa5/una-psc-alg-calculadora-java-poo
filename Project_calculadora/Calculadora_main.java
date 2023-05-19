package Project_calculadora;

import java.util.Scanner;

public class Calculadora_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        operacoes operacoes = new operacoes();
        
        while(true){
        System.out.println("Qual operação deseja fazer? (+, -, *, /, ^, >) ");
        String operador = scanner.next();
        System.out.println("Digite o primeiro numero: ");
        operacoes.numero1(scanner.nextDouble());

        System.out.println("Digite o segundo numero: ");
        operacoes.numero2(scanner.nextDouble());

        if(operador.equals("+")){
            double resultado = operacoes.somar();
            System.out.println("A soma dos valores informados é: " + resultado);
        }
        else if(operador.equals("-")){
            double resultado = operacoes.subtrair();
            System.out.println("A subtração dos valores informados é: " + resultado);
        }
        else if(operador.equals("*")){
            double resultado = operacoes.multiplicar();
            System.out.println("A multiplicação dos valores informados é: " + resultado);
        }
        
        else if(operador.equals("/")){
            if(operacoes.getNumeroDois() == 0 ){
                System.out.println("Não é possivel fazer uma divisão por zero!");
            }
            else{
                double resultado = operacoes.dividir();
                System.out.println("A divisão dos valores informados é: " + resultado);
            }
        }
        else if(operador.equals("^")){
            double resultado = operacoes.potencia();
            System.out.println("A potencia dos valores informados é: " + resultado);
        }
        else if(operador.equals(">")){
            if(operacoes.getNumeroDois() < 0){
                System.out.println("Não existe raiz de número negativo");
            }
            else{
            double resultado = operacoes.dividir();
            System.out.println("A raiz dos valores informados é: " + resultado);
            }
        }
        
        System.out.println("Deseja fazer outra operação? (Para parar digite a tecla 'q')");
        String parar = scanner.next();
        if(parar.equals("q")){
            scanner.close();
            break;
        }
           
        }  
    }
}
