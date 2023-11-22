package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Departamento {

    private String nome, sigla;
    private int idDepartamento = 0;

    Scanner scanner = new Scanner(System.in);
    public void cadastrarDepartamento () {

        System.out.print("Informe o nome do departamento: ");
        this.nome = scanner.nextLine();
        System.out.print("Informe a sigla do departamento: ");
        this.sigla = scanner.nextLine();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
}
