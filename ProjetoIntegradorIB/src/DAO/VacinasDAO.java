package DAO;

import conexao.Conexao;
import entity.Vacinas;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VacinasDAO {
    // metodo para conexão com o banco de dados.
    public void cadastrarVacinas(Vacinas vacinas) {
        // variável para a captação dos dados conforme a tabela no MySQL.
        String sql = "INSERT INTO VACINAS (NOME, MARCA, FABRICACAO) VALUES (?,?,?)";

        PreparedStatement ps = null;

        try { // try/catch para possíveis situações de erro.
            // conexao para injetar os dados no BD.
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, vacinas.getNome());
            ps.setString(2, vacinas.getMarca());
            ps.setString(3, vacinas.getFabricacao());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}