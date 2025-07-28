package entity;

import java.util.Scanner;

public class Pacientes {
    // definição de atributos.
    private int codigo;
    private String nome;
    private String nascimento;
    private String sexo;
    private String cpf;
    private String telefone;
    private String endereco;
    private String regiao;
    private String escolaridade;

    // metodo para armazenar os dados do paciente.
    public void dadosPaciente(Scanner sc) {
        System.out.print("Digite o nome do paciente: ");
        String nome = sc.nextLine();
        setNome(nome);

        System.out.print("Digite a data de nascimento do paciente (dd/mm/aaaa): ");
        String nascimento = sc.nextLine();
        setNascimento(nascimento);

        System.out.print("Digite o sexo do paciente ( M ou F): ");
        String sexo = sc.nextLine();
        setSexo(sexo);

        System.out.print("Digite o CPF do paciente (apenas números): ");
        String cpf = sc.nextLine();
        while (!cpf.matches("\\d{11}")) {
            System.out.print("CPF inválido! Digite novamente (11 dígitos): ");
            cpf = sc.nextLine();
        }
        setCpf(cpf);

        System.out.print("Digite o telefone do paciente (apenas numeros): ");
        String telefone = sc.nextLine();
        setTelefone(telefone);

        System.out.print("Digite o endereço do paciente: ");
        String endereco = sc.nextLine();
        setEndereco(endereco);

        System.out.print("Digite a região da paciente: ");
        String regiao = sc.nextLine();
        setRegiao(regiao);

        System.out.print("Digite a escolaridade do paciente: ");
        String escolaridade = sc.nextLine();
        setEscolaridade(escolaridade);

    }

    // getters e setters.
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
}