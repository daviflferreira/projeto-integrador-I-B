package entity;

import java.util.Scanner;

public class Vacinados {
    // definição de atributos.
    private int pacientes_id_paciente;
    private int vacina_cod_vacina;
    private String nome_paciente;
    private String nome_vacina;
    private String escolaridade;
    private String data_aplicacao;

    // cadastrar pacientes já vacinados.
    public void dadosVacinado(Scanner sc) {
        System.out.print("Digite o nome do paciente: ");
        String nomePaciente = sc.nextLine();
        setNome_paciente(nomePaciente);

        System.out.print("Digite o nome da vacina: ");
        String nomeVacina = sc.nextLine();
        setNome_vacina(nomeVacina);

        System.out.print("Digite a escolaridade do paciente: ");
        String escolaridade = sc.nextLine();
        setEscolaridade(escolaridade);

        System.out.print("Digite a data de aplicação (dd/mm/aaaa): ");
        String dataAplicacao = sc.nextLine();
        setData_aplicacao(dataAplicacao);
    }

    // getters e setters.
    public int getPacientes_id_paciente() {
        return pacientes_id_paciente;
    }

    public void setPacientes_id_paciente(int pacientes_id_paciente) {
        this.pacientes_id_paciente = pacientes_id_paciente;
    }

    public int getVacina_cod_vacina() {
        return vacina_cod_vacina;
    }

    public void setVacina_cod_vacina(int vacina_cod_vacina) {
        this.vacina_cod_vacina = vacina_cod_vacina;
    }

    public String getNome_paciente() {
        return nome_paciente;
    }

    public void setNome_paciente(String nome_paciente) {
        this.nome_paciente = nome_paciente;
    }

    public String getNome_vacina() {
        return nome_vacina;
    }

    public void setNome_vacina(String nome_vacina) {
        this.nome_vacina = nome_vacina;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getData_aplicacao() {
        return data_aplicacao;
    }

    public void setData_aplicacao(String data_aplicacao) {
        this.data_aplicacao = data_aplicacao;
    }
}