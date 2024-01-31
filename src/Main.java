import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcaoDesejada = 0;

        Conta conta = new Conta();

        String mensagemInicial = String.format("""
                *******************************************
                Dados iniciais do cliente:
                Nome: %s
                Tipo conta: %s
                Saldo inicial: R$: %.2f
                *******************************************
                """, conta.name, conta.tipoConta, conta.saldo);
        System.out.println(mensagemInicial);

        while (opcaoDesejada != 4) {

            System.out.println("""
                    1- Consultar saldo
                    2- Receber valor
                    3- Transferir valor
                    4- sair
                                        
                    Digite a opção desejada: \n
                    """);
            opcaoDesejada = leitura.nextInt();

            switch (opcaoDesejada) {
                case 1:
                    System.out.println("Seu saldo é: " + conta.getConsultarSaldo() + "\n");
                    break;
                case 2:
                    System.out.println("Informe o valor a receber \n");
                    conta.setReceberValor(leitura.nextDouble());
                    System.out.println("Saldo atualizado R$: " + conta.getConsultarSaldo() + "\n");
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir: \n");
                    if (conta.setTransferirValor(leitura.nextDouble())) {
                        System.out.println("Saldo atualizado " + conta.getConsultarSaldo() + "\n");
                    } else {
                        System.out.println("Saldo insuficiente, seu saldo atual é de "+ conta.getConsultarSaldo() + "\n");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção invalida \n");
            }

        }
    }
}
