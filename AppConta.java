import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
          
        int opcao;
        int numero;
        double saldo, limite,taxa;
        Conta conta;

    do {
        System.out.println("1-Adicionar Conta");
        System.out.println("2-Remover Conta");
        System.out.println("3-Listar Conta");
        System.out.println("4-Sacar da Conta");
        System.out.println("5-Depositar na Conta");
        System.out.println("6-sair");

        opcao = Integer.parseInt(teclado.nextLine());

        switch (opcao) {
          
            
                   case 1:
                        
                    break;
                    
                    case 2:
                    
                    break;
                 
                    case 3:
                    
                    break;
                    
                    case 4:
             
                    break;
        
                    case 5:
                
                    break;
                    
                    case 6:
                
                    break;
        
            default:
                
                System.out.println("Opção inválida");
                
            }

        } while (opcao != 6);
        teclado.close();
    }
}
