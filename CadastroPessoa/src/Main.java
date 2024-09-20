import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pessoa pessoa;
        int opcao;
        do {
            System.out.println("***********************************");
            System.out.println("1 - Cadastro de pessoa");
            System.out.println("2 -Buscar o telefone");
            System.out.println("3 - Listar pessoa");
            System.out.println("4 - Sair");
            System.out.println("***********************************");
            System.out.println("Escolha uma opção no menu:");
            opcao = scan.nextInt();

            switch(opcao) {
                case 1:
                    scan.nextLine();
                    System.out.println("Informe o Nome: ");
                    String nome = scan.nextLine();
                    System.out.println("Informe o Telefone: ");
                    String telefone = scan.nextLine();

                    System.out.println("Informe o E-mail: ");
                    String email = scan.nextLine();
                    System.out.println("Informe a data de Nascimento YYYY-mm-dd: ");
                    String dataNascimento = scan.nextLine();
                    System.out.println("Informe o id ");
                    Long id = scan.nextLong();
                    System.out.println("Informe o sexo: ");
                    String sexo = scan.nextLine();
                    System.out.println("Informe o nome da mãe: ");
                    String mae = scan.nextLine();
                    System.out.println("Informe o nome do pai: ");
                    String pai = scan.nextLine();
                    System.out.println("Informe o endereço completo: ");
                    String enderecoCompleto = scan.nextLine();
                    System.out.println("Informe uma foto: ");
                    String foto = scan.nextLine();

                     pessoa = new Pessoa(id,nome,dataNascimento,sexo,mae,pai,enderecoCompleto,email,telefone,foto);

                    break;
                case 2: System.out.println("Alterar pessoa");
                    break;
                case 3:
                    System.out.println("Listar pessoa");
                    System.out.println("Nome: " + pessoa.getNome());
                    System.out.println("Telefone: " + pessoa.getTelefone());
                    System.out.println("E-mail: " + pessoa.getEmail());
                    System.out.println("id: " + pessoa.getId());
                    System.out.println("Data Nascimento: " + pessoa.getDataNascimento());
                    System.out.println("Sexo: " + pessoa.getSexo());
                    System.out.println("Mãe: " + pessoa.getMae());
                    System.out.println("Pai: " + pessoa.getPai());
                    System.out.println("Endereço completo: " + pessoa.getEnderecoCompleto());
                    System.out.println("Foto: " + pessoa.getFoto());
                    break;
                case 4: System.out.println("Saindo do Sistema");
                    break;
                default: System.out.println("Valor não condiz com o esperado!!!");
            }
        }while(opcao != 4);
        scan.close();
    }
}




