package entity;

import java.util.Scanner;

public class Vacinas {
    // definição de atributos.
    private int codVacina;
    private String nome;
    private String marca;
    private String fabricacao;

    // cadastrar vacina.
    public void dadosVacina(Scanner sc) {

        System.out.print("Digite o nome da vacina:  ");
        String nome = sc.nextLine();
        setNome(nome);

        System.out.print("Digite a marca da vacina:  ");
        String marca = sc.nextLine();
        setMarca(marca);

        // verificador para ver se a data segue conforme as regras.
        System.out.print("Digite a data de fabricação da vacina (dd/mm/aaaa): ");
        String fabricacao = sc.nextLine();
        while (!fabricacao.matches("\\d{2}/\\d{2}/\\d{4}")) {
            System.out.print("Formato inválido! Use dd/mm/aaaa: ");
            fabricacao = sc.nextLine();
        }
        setFabricacao(fabricacao);

    }

    // getters e setters.
    public int getCodVacina() {

        return codVacina;
    }

    public void setCodVacina(int codVacina) {

        this.codVacina = codVacina;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getMarca() {

        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(String fabricacao) {
        this.fabricacao = fabricacao;
    }
}