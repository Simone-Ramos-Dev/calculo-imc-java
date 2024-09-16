import java.util.Scanner;

public class CalculoIMC{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc < 18.5){
            System.out.println("Classificação: Abaixo do peso");

        } else if (imc < 24.9) {
            System.out.println("Classificação: Peso normal");

        } else if (imc < 29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }
        scanner.close();
    }
}