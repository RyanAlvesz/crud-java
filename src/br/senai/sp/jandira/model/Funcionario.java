package br.senai.sp.jandira.model;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Funcionario {

    private String nome, cargo, departamento;
    private int idFuncionario = 0;

    private double salario;

    Scanner scanner = new Scanner(System.in);
    public void cadastrarFuncionario () {

        System.out.print("Informe o nome do funcionário: ");
        this.nome = scanner.nextLine();
        System.out.print("Informe o Cargo do funcionário: ");
        this.cargo = scanner.nextLine();
        System.out.print("Informe o Departamento do funcionário: ");
        this.departamento = scanner.nextLine();
        System.out.print("Informe o Salário do funcionário: ");
        this.salario = scanner.nextDouble();
        scanner.nextLine();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
