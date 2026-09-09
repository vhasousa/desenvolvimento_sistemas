package conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlunoDAO {

    // Cadastra um aluno. O banco gera o ID automaticamente.
    public int cadastrar(Aluno aluno) throws SQLException {
        String sql = "INSERT INTO aluno (nome, email) VALUES (?, ?)";

        try (Connection conexao = Conexao.conectar();
             PreparedStatement comando = conexao.prepareStatement(sql)) {

            comando.setString(1, aluno.getNome());
            comando.setString(2, aluno.getEmail());

            return comando.executeUpdate();
        }
    }

    // Consulta todos os alunos.
    public ArrayList<Aluno> listar() throws SQLException {
        String sql = "SELECT id, nome, email FROM aluno ORDER BY nome";

        ArrayList<Aluno> alunos = new ArrayList<>();

        try (Connection conexao = Conexao.conectar();
             PreparedStatement comando = conexao.prepareStatement(sql);
             ResultSet resultado = comando.executeQuery()) {

            while (resultado.next()) {
                Aluno aluno = new Aluno(
                    resultado.getInt("id"),
                    resultado.getString("nome"),
                    resultado.getString("email")
                );

                alunos.add(aluno);
            }
        }

        return alunos;
    }

    // Consulta um aluno pelo ID.
    public Aluno buscarPorId(int id) throws SQLException {
        String sql = "SELECT id, nome, email FROM aluno WHERE id = ?";

        try (Connection conexao = Conexao.conectar();
             PreparedStatement comando = conexao.prepareStatement(sql)) {

            comando.setInt(1, id);

            try (ResultSet resultado = comando.executeQuery()) {
                if (resultado.next()) {
                    return new Aluno(
                        resultado.getInt("id"),
                        resultado.getString("nome"),
                        resultado.getString("email")
                    );
                }
            }
        }

        return null;
    }

    // Atualiza nome e e-mail do aluno identificado pelo ID.
    public int atualizar(Aluno aluno) throws SQLException {
        String sql = "UPDATE aluno SET nome = ?, email = ? WHERE id = ?";

        try (Connection conexao = Conexao.conectar();
             PreparedStatement comando = conexao.prepareStatement(sql)) {

            comando.setString(1, aluno.getNome());
            comando.setString(2, aluno.getEmail());
            comando.setInt(3, aluno.getId());

            return comando.executeUpdate();
        }
    }

    // Exclui o aluno identificado pelo ID.
    public int excluir(int id) throws SQLException {
        String sql = "DELETE FROM aluno WHERE id = ?";

        try (Connection conexao = Conexao.conectar();
             PreparedStatement comando = conexao.prepareStatement(sql)) {

            comando.setInt(1, id);

            return comando.executeUpdate();
        }
    }
}