import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
      //  System.out.println("Hello, World!"); //

        int conta;
        String Agencia;
        String saldo;
        String mensagemFinal;
        
        Scanner teclado;
        teclado = new Scanner(System.in);

        System.out.println("Digite o numero da conta:");
        conta = teclado.nextInt();
        
        System.out.println("Digite o numero da Agencia:");
        Agencia = teclado.next();
        
        System.out.println("Nome do Cliente:");
        saldo = teclado.next();
        
        System.out.println("Seu saldo é : 237.48 ");	 
         mensagemFinal = teclado.next();
        
        System.out.println("Olá, cliente obrigado por criar uma conta em nosso Banco, sua agência é : " + "067-8 "  + " conta 1021 " + " seu Saldo é 237.48 e já está dísponivel para saque."  ); 
        mensagemFinal = teclado.nextLine();
        
                     
        










    }

   }






    



