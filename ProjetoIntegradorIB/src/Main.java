import DAO.PacientesDAO;
import DAO.VacinasDAO;
import DAO.VacinadosDAO;
import entity.Pacientes;
import entity.Vacinas;
import entity.Vacinados;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String opcao;

        do {  // do/while para execução do menu interativo de cadastro.
            System.out.println("\n=== SISTEMA DE CADASTRO DE VACINAÇÃO ===");
            System.out.println("1. Cadastrar paciente.");
            System.out.println("2. Cadastrar vacina.");
            System.out.println("3. Cadastrar vacinação.");
            System.out.println("4. Sair do programa.");
            System.out.print("Escolha uma opção (1-4): ");
            opcao = sc.nextLine().trim();

            switch (opcao) { // switch/case para execução do que o utilizador escolher.

                case "1": // cadastra o cliente.
                    try { // try/catch para possíveis situações de erro.
                        Pacientes p = new Pacientes(); // criação de paciente.
                        p.dadosPaciente(sc); // chamado metodo para cadastrar o paciente.
                        new PacientesDAO().cadastrarPacientes(p); // chamado do DAO para cadastrar os dados no banco de dados.
                        System.out.println("Paciente cadastrado com sucesso!");
                    } catch (Exception e) {
                        System.err.println("Erro ao cadastrar paciente." + e.getMessage());
                    }
                    break;

                case "2": // cadastra vacina.
                    try { // try/catch para possíveis situações de erro.
                        Vacinas v = new Vacinas(); // criação da vacina.
                        v.dadosVacina(sc); // chamado metodo para cadastrar a vacina.
                        new VacinasDAO().cadastrarVacinas(v); // chamado DAO para cadastrar os dados no banco de dados.
                        System.out.println("Vacina cadastrada com sucesso!");
                    } catch (Exception e) {
                        System.err.println("Erro ao cadastrar vacina." + e.getMessage());
                    }
                    break;
                // é importante que o paciente exista e esteja vacinado. Caso contrario ele não podera ser cadastrado.
                case "3": // cadastrar pacientes já e somente vacinados.
                    try { // try/catch para possíveis situações de erro.
                        Vacinados vacinado = new Vacinados(); // criação de paciente vacinado.
                        vacinado.dadosVacinado(sc); // chamado metodo para cadastrar os dados do paciente vacinado.
                        new VacinadosDAO().cadastrarVacinado(vacinado); // chamado de DAO para cadastrar o vacinado no banco de dados.
                        System.out.println("Vacinado cadastrado com sucesso!");
                    } catch (Exception e) {
                        System.err.println("Erro ao cadastrar vacinação." + e.getMessage());
                    }
                    break;

                case "4": // opção para encerrar o programa.
                    System.out.println("Encerrando o programa...");
                    break;

                default: // caso a entrada seja qualquer outra que não esteja dentre as opções, aparece essa mensagem e o programa volta ao menu.
                    System.out.println("Opção inválida! Por favor, tente novamente com uma opção válida.");

            }

        } while (!opcao.equals("4"));
        sc.close();
    }
}