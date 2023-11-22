package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Departamento;
import br.senai.sp.jandira.model.Funcionario;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu   {

    Scanner scanner = new Scanner(System.in);
    FuncionarioController funcionario = new FuncionarioController();
    DepartamentoController departamento = new DepartamentoController();
    public void executarMenu() throws SQLException {

        boolean continuar = true;

        while (continuar){

            System.out.println("------------------------------------");
            System.out.println("                Menu");
            System.out.println("------------------------------------");
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Listar Funcionários");
            System.out.println("3 - Deletar Funcionário");
            System.out.println("4 - Pesquisar Funcionário");
            System.out.println("5 - Atualizar Salário");
            System.out.println("6 - Cadastrar Departamento");
            System.out.println("7 - Listar Departamentos");
            System.out.println("8 - Deletar Departamento");
            System.out.println("9 - Pesquisar Departamento");
            System.out.println("10 - Atualizar Sigla");
            System.out.println("11 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){

                case 1:
                    Funcionario novoFuncionario = new Funcionario();
                    novoFuncionario.cadastrarFuncionario();
                    funcionario.cadastrarFuncionario(novoFuncionario);
                    break;

                case 2:
                    funcionario.listarFuncionarios();
                    break;

                case 3:
                    System.out.println("");
                    System.out.print("Informe o nome que deseja deletar: ");
                    funcionario.deletarFuncionario(scanner.nextLine());
                    break;

                case 4:
                    System.out.println("");
                    System.out.print("Informe o nome do funcionário que deseja pesquisar: ");
                    funcionario.pesquisarFuncionario(scanner.nextLine());
                    break;

                case 5:
                    System.out.println("");
                    System.out.print("Informe o nome do funcionário: ");
                    String nome = scanner.nextLine();
                    System.out.print("Informe o valor do salário: ");
                    funcionario.atualizarSalario(nome, scanner.nextDouble());
                    break;

                case 6:
                    Departamento novoDepartamento = new Departamento();
                    novoDepartamento.cadastrarDepartamento();
                    departamento.cadastrarDepartamento(novoDepartamento);
                    break;

                case 7:
                    departamento.listarDepartamentos();
                    break;

                case 8:
                    System.out.println("");
                    System.out.print("Informe o nome do departamento que deseja deletar: ");
                    departamento.deletarDepartamento(scanner.nextLine());
                    break;

                case 9:
                    System.out.println("");
                    System.out.print("Informe a sigla do departamento que deseja pesquisar: ");
                    departamento.pesquisarDepartamento(scanner.nextLine());
                    break;

                case 10:
                    System.out.println("");
                    System.out.print("Informe o nome do departamento: ");
                    String nomeDepartamento = scanner.nextLine();
                    System.out.print("Informe a nova sigla: ");
                    departamento.atualizarDepartamento(nomeDepartamento, scanner.nextLine());
                    break;

                case 11:
                    continuar = false;
                    break;

            }



        }

    }

}
