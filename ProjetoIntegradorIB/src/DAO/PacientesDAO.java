package DAO;

import conexao.Conexao;
import entity.Pacientes;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PacientesDAO {

    // metodo para conexão com o banco de dados.
    public void cadastrarPacientes(Pacientes pacientes) {
        // variável para a captação dos dados conforme a tabela no MySQL.
        String sql = "INSERT INTO PACIENTES (NOME, NASCIMENTO, SEXO, CPF, TELEFONE, ENDERECO, REGIAO, ESCOLARIDADE) VALUES (?,?,?,?,?,?,?,?)";

        PreparedStatement ps = null;

        try { // try/catch para possíveis situações de erro.
            // conexao para injetar os dados no BD.
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, pacientes.getNome());
            ps.setString(2, pacientes.getNascimento());
            ps.setString(3, pacientes.getSexo());
            ps.setString(4, pacientes.getCpf());
            ps.setString(5, pacientes.getTelefone());
            ps.setString(6, pacientes.getEndereco());
            ps.setString(7, pacientes.getRegiao());
            ps.setString(8, pacientes.getEscolaridade());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}