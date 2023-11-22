package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Conexao;
import br.senai.sp.jandira.model.Departamento;
import br.senai.sp.jandira.model.Funcionario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DepartamentoController {

    Conexao conexao = new Conexao();
    Connection connection = conexao.getConnection();

    public void cadastrarDepartamento (Departamento departamento) throws SQLException {

        Statement statement = connection.createStatement();
        String queryCadastrar = "INSERT INTO departamento (idDepartamento, nome, sigla) values (" +
                departamento.getIdDepartamento() + ", '" +
                departamento.getNome() + "', '" +
                departamento.getSigla() + "')";

        statement.executeUpdate(queryCadastrar);
        System.out.println("Departamento cadastrado com sucesso!");
        System.out.println("");

    }

    public void listarDepartamentos() throws SQLException {

        Statement statement = connection.createStatement();
        String queryConsulta = "SELECT * FROM departamento";
        ResultSet resultSet = statement.executeQuery(queryConsulta);

        Departamento departamento = new Departamento();

        while (resultSet.next()){
            departamento.setIdDepartamento(resultSet.getInt("idDepartamento"));
            departamento.setNome(resultSet.getString("nome"));
            departamento.setSigla(resultSet.getString("sigla"));

            System.out.println("------------------------------------");
            System.out.println(departamento.getIdDepartamento() + " - " + departamento.getNome());
            System.out.println("Sigla: " + departamento.getSigla());
            System.out.println("------------------------------------");

        }

    }

    public void deletarDepartamento(String nome) throws SQLException {

        Statement statement = connection.createStatement();
        String queryDelete = "DELETE from departamento WHERE nome = '" + nome + "'";
        statement.executeUpdate(queryDelete);
        System.out.println("Departamento " + nome + " deletado com sucesso...");
        System.out.println("");

    }

    public void pesquisarDepartamento(String sigla) throws SQLException {
        Statement statement = connection.createStatement();
        String queryPesquisa = "SELECT * FROM departamento WHERE sigla = '" + sigla + "'";
        ResultSet resultSet = statement.executeQuery(queryPesquisa);

        List<Departamento> listPesquisa = new ArrayList<>();

        while (resultSet.next()){
            Departamento departamento = new Departamento();
            departamento.setIdDepartamento(resultSet.getInt("idDepartamento"));
            departamento.setNome(resultSet.getString("nome"));
            departamento.setSigla(resultSet.getString("sigla"));
            listPesquisa.add(departamento);
        }

        for (Departamento departamento: listPesquisa) {
            System.out.println("------------------------------------");
            System.out.println(departamento.getIdDepartamento() + " - " + departamento.getNome());
            System.out.println("Sigla: " + departamento.getSigla());
            System.out.println("------------------------------------");
        }

    }

    public void atualizarDepartamento(String nome, String sigla) throws SQLException {
        Statement statement = connection.createStatement();
        String queryAtualizar = "UPDATE departamento SET sigla = '" + sigla + "' WHERE nome = '" + nome + "'";
        statement.executeUpdate(queryAtualizar);
        System.out.println("Dados atualizados com sucesso!");
    }

}
