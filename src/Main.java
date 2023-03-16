import java.util.Scanner;
//Crie um programa Java que verifique se um número é múltiplo de 3 e 5.
//Vamos precisar utilizar o operador Módulo (   %   )
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem vindo ao programa que identifica a divisibilidade de um número pelo outro");
        System.out.println("Digite o dividendo");
        long  dividendo =  leitor.nextLong();

        System.out.println("Digite o divisor");
        long  divisor = leitor.nextLong();

        if(dividendo % divisor == 0){
            System.out.println("O número " + dividendo +  " é multiplo de " + divisor);
        }else{
            System.out.println("O número " + dividendo +  " não é multiplo de " + divisor);
        }


    }
}