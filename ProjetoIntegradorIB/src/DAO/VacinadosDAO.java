package DAO;

import conexao.Conexao;
import entity.Vacinados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VacinadosDAO {
    // metodo para buscar dados de pacientes já vacinados e adicionar na tabela de "vacinados". E também para conexão do banco de dados.
    public void cadastrarVacinado(Vacinados vacinado) throws SQLException {
        String sqlPaciente = "SELECT ID_PACIENTE FROM PACIENTES WHERE NOME = ?";
        String sqlVacina = "SELECT COD_VACINA FROM VACINAS WHERE NOME = ?";
        String sqlInsert = "INSERT INTO VACINADOS (PACIENTES_ID_PACIENTE, VACINAS_COD_VACINA, NOME_PACIENTE, NOME_VACINA, ESCOLARIDADE, DATA_APLICACAO) VALUES (?,?,?,?,?,?)";

        PreparedStatement ps = null;
        ResultSet rs = null;
        try { // try/catch para possíveis situações de erro.
            // buscar o id_paciente.
            ps = Conexao.getConnection().prepareStatement(sqlPaciente);
            ps.setString(1, vacinado.getNome_paciente());
            rs = ps.executeQuery();
            int idPaciente = rs.next() ? rs.getInt("ID_PACIENTE") : -1;
            rs.close();


            // buscar o cod_vacina.
            ps = Conexao.getConnection().prepareStatement(sqlVacina);
            ps.setString(1, vacinado.getNome_vacina());
            rs = ps.executeQuery();
            int codVacina = rs.next() ? rs.getInt("COD_VACINA") : -1;
            rs.close();

            if (idPaciente == -1 || codVacina == -1) { // caso o paciente não tenha algum dos dois, ou ele não existe, ou há algum erro no banco de dados.
                throw new IllegalArgumentException("Paciente ou vacina não encontrado!");
            }

            // inserir os pacientes já vacinados na tabela vacinados.
            ps = Conexao.getConnection().prepareStatement(sqlInsert);
            ps.setInt(1, idPaciente);
            ps.setInt(2, codVacina);
            ps.setString(3, vacinado.getNome_paciente());
            ps.setString(4, vacinado.getNome_vacina());
            ps.setString(5, vacinado.getEscolaridade());
            ps.setString(6, vacinado.getData_aplicacao());
            ps.execute();
        } finally { // caso haja algum erro, essa parte sera ativada.

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}