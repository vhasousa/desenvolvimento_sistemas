package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Conexao {

    private static final String URL =
            "jdbc:mysql://localhost:3306/senai"
            + "?useSSL=false"
            + "&serverTimezone=America/Sao_Paulo";

    private static final String USUARIO = "root";
    private static final String SENHA = "";

    // Impede a criação de objetos desta classe
    private Conexao() {
    }

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}