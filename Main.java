import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, r;
        int escolha;
        while (true) {
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
            System.out.print("Escolha uma operação: ");
            escolha = sc.nextInt();

            if (escolha == 11){
                System.out.println("Encerrando a calculadora...");
                break;
            }

            switch (escolha) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    x = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    y = sc.nextDouble();
                    r = x + y;
                    System.out.println("Resultado: " + r);
                    break;
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    x = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    y = sc.nextDouble();
                    r = x - y;
                    System.out.println("Resultado: " + r);
                    break;
                case 3:
                    System.out.print("Digite o primeiro número: ");
                    x = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    y = sc.nextDouble();
                    r = x * y;
                    System.out.println("Resultado: " + r);
                    break;
                case 4:
                    System.out.print("Digite o primeiro número: ");
                    x = sc.nextDouble();
                    System.out.print("Digite o divisor: ");
                    y = sc.nextDouble();
                    if (y != 0) {
                        r = x / y;
                        System.out.println("Resultado: " + r);
                    } else {
                        System.out.println("Erro: Divisão por zero.");
                    }
                    break;
                case 5:
                    System.out.print("Digite o valor: ");
                    x = sc.nextDouble();
                    System.out.print("Digite a porcentagem: ");
                    y = sc.nextDouble();
                    r = (x * y) / 100;
                    System.out.println("Resultado: " + r);
                    break;
                case 6:
                    System.out.print("Digite o valor: ");
                    x = sc.nextDouble();
                    r = Math.sqrt(x);
                    System.out.println("Raiz Quadrada: " + r);
                    break;
                case 7:
                    System.out.print("Digite a base: ");
                    x = sc.nextDouble();
                    System.out.print("Digite o expoente: ");
                    y = sc.nextDouble();
                    r = Math.pow(x, y);
                    System.out.println("Resultado: " + r);
                    break;
                case 8:
                    System.out.print("Digite o ângulo em graus: ");
                    double angleDegrees = sc.nextDouble();
                    double sineDegrees = Math.sin(Math.toRadians(angleDegrees));
                    System.out.println("Seno: " + sineDegrees);
                    break;
                case 9:
                    System.out.print("Digite o ângulo em graus: ");
                    double angleDegreesCos = sc.nextDouble();
                    double cosineDegrees = Math.cos(Math.toRadians(angleDegreesCos));
                    System.out.println("Cosseno: " + cosineDegrees);
                    break;
                case 10:
                    System.out.print("Digite o ângulo em graus: ");
                    double angleDegreesTan = sc.nextDouble();
                    double tangentDegrees = Math.tan(Math.toRadians(angleDegreesTan));
                    System.out.println("Tangente: " + tangentDegrees);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma operação válida.");
            }
        }
        sc.close();
    }
}
