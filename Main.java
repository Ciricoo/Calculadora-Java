import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado;
        int escolha;
        
        while (true) {
            exibirMenu();
            System.out.print("Escolha uma operação: ");
            escolha = sc.nextInt();

            if (escolha == 11){
                System.out.println("Encerrando a calculadora...");
                break;
            }

            switch (escolha) {
                case 1:
                    num1 = lerNumero("Digite o primeiro número: ", sc);
                    num2 = lerNumero("Digite o segundo número: ", sc);
                    resultado = adicao(num1, num2);
                    exibirResultado("Resultado: ", resultado);
                    break;
                case 2:
                    num1 = lerNumero("Digite o primeiro número: ", sc);
                    num2 = lerNumero("Digite o segundo número: ", sc);
                    resultado = subtracao(num1, num2);
                    exibirResultado("Resultado: ", resultado);
                    break;
                case 3:
                    num1 = lerNumero("Digite o primeiro número: ", sc);
                    num2 = lerNumero("Digite o segundo número: ", sc);
                    resultado = multiplicacao(num1, num2);
                    exibirResultado("Resultado: ", resultado);
                    break;
                case 4:
                    num1 = lerNumero("Digite o primeiro número: ", sc);
                    num2 = lerNumero("Digite o divisor: ", sc);
                    if (num2 != 0) {
                        resultado = divisao(num1, num2);
                        exibirResultado("Resultado: ", resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero.");
                    }
                    break;
                case 5:
                    num1 = lerNumero("Digite o valor: ", sc);
                    num2 = lerNumero("Digite a porcentagem: ", sc);
                    resultado = porcentagem(num1, num2);
                    exibirResultado("Resultado: ", resultado);
                    break;
                case 6:
                    num1 = lerNumero("Digite o valor: ", sc);
                    resultado = raizQuadrada(num1);
                    exibirResultado("Raiz Quadrada: ", resultado);
                    break;
                case 7:
                    num1 = lerNumero("Digite a base: ", sc);
                    num2 = lerNumero("Digite o expoente: ", sc);
                    resultado = potencia(num1, num2);
                    exibirResultado("Resultado: ", resultado);
                    break;
                case 8:
                    double angulo = lerNumero("Digite o ângulo em graus: ", sc);
                    resultado = seno(angulo);
                    exibirResultado("Seno: ", resultado);
                    break;
                case 9:
                    angulo = lerNumero("Digite o ângulo em graus: ", sc);
                    resultado = cosseno(angulo);
                    exibirResultado("Cosseno: ", resultado);
                    break;
                case 10:
                    angulo = lerNumero("Digite o ângulo em graus: ", sc);
                    resultado = tangente(angulo);
                    exibirResultado("Tangente: ", resultado);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma operação válida.");
            }
        }
        sc.close();
    }
    
    public static void exibirMenu() {
        System.out.println("----------------------------");
        System.out.println("Calculadora Simples");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Porcentagem");
        System.out.println("6. Raiz Quadrada");
        System.out.println("7. Potência");
        System.out.println("8. Seno");
        System.out.println("9. Cosseno");
        System.out.println("10. Tangente");
        System.out.println("11. Sair");
        System.out.println("----------------------------");
    }
    
    public static double lerNumero(String mensagem, Scanner sc) {
        System.out.print(mensagem);
        return sc.nextDouble();
    }
    
    public static void exibirResultado(String mensagem, double resultado) {
        System.out.println(mensagem + resultado);
    }
    
    public static double adicao(double num1, double num2) {
        return num1 + num2;
    }
    
    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }
    
    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }
    
    public static double divisao(double num1, double num2) {
        return num1 / num2;
    }
    
    public static double porcentagem(double num1, double num2) {
        return (num1 * num2) / 100;
    }
    
    public static double raizQuadrada(double num) {
        return Math.sqrt(num);
    }
    
    public static double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
    
    public static double seno(double angulo) {
        return Math.sin(Math.toRadians(angulo));
    }
    
    public static double cosseno(double angulo) {
        return Math.cos(Math.toRadians(angulo));
    }
    
    public static double tangente(double angulo) {
        return Math.tan(Math.toRadians(angulo));
    }
}
