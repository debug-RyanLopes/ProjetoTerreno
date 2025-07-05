import entidades.calcAreaRetQuad;
import entidades.calcAreaTrian;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        calcAreaRetQuad largura, comprimento;
        calcAreaTrian base, altura;

        largura = new calcAreaRetQuad();
        comprimento = new calcAreaRetQuad();

        base = new calcAreaTrian();
        altura = new calcAreaTrian();


        System.out.println("O seu Terreno, seria um terreno Retangular/Quadrado ou Triangular ?");
        System.out.println("[1] Quadrado/Retangular");
        System.out.println("[2] Triangular");
        int resposta = sc.nextInt();




        // Caso o usuario não informe corretamente:

        while (resposta != 1 && resposta != 2){
            System.out.println("Você informou uma opção não existente, tente novamente: ");
            System.out.println("[1] Quadrado/Retangular");
            System.out.println("[2] Triangular");
            resposta = sc.nextInt();
        }

        if (resposta == 1){

            System.out.println("Perfeito, agora me informe a Largura do seu Terreno: ");
            largura.largura = sc.nextDouble();

            System.out.println("agora me informe o Comprimento do seu Terreno: ");
            comprimento.comprimento = sc.nextDouble();
            double p = largura.largura * comprimento.comprimento;

            System.out.print("A Area do seu terreno em metros quadrados é igual a: ");
            System.out.println(p + "m²");

        }

        if (resposta == 2){

            System.out.println("Perfeito, agora me informe a Base do seu Terreno: ");
            base.base = sc.nextDouble();

            System.out.println("Agora me informe a Altura do seu Terreno: ");
            altura.altura = sc.nextDouble();
            double p = (base.base * altura.altura) / 2;

            System.out.print("A Area do seu terreno Triangular em metros quadrados é igual a: ");
            System.out.println(p + "m²");

        }


        sc.close();
    }
}
