
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        boolean acertou = false;
        int tentativas = 3;
        int numeroSecreto = random.nextInt(20);
        long chute = 0;
        
        /*System.out.println(numeroSecreto);*/
        
        while(tentativas > 0 && acertou == false){
        System.out.println("Insira um número de 1 a 20: ");
        chute = input.nextLong();
        
        if(numeroSecreto == chute){
        System.out.println("Você acertou!!");
        acertou = true;
        } else if(chute < numeroSecreto){
        --tentativas;
        System.out.println("Dica: Insira um número maior! " + tentativas + " tentativas restantes.");
        } else{
        --tentativas;
        System.out.println("Dica: Insira um número menor! " + tentativas + " tentativas restantes.");
        }
        
    }
        
  }
}
