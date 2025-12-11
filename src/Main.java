import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);

        Operacoes op = new Operacoes();
        String operacoes = "";

        do {
            System.out.printf("Digite a operação:\n1 - Adicionar aluno\n2 - Buscar aluno\n3 - Sair\n");
            operacoes = scanner.nextLine();

            switch (operacoes) {
                case "1":
                    System.out.printf("Digite a matrícula:\n");
                    String matricula = scanner.nextLine();

                    System.out.printf("Digite o nome:\n");
                    String nome = scanner.nextLine();

                    System.out.printf("Digite o curso:\n");
                    String curso = scanner.nextLine();

                    Aluno aluno = new Aluno();
                    aluno.setMatricula(matricula);
                    aluno.setNome(nome);
                    aluno.setCurso(curso);

                    op.adicionarAluno(aluno);
                break;

                case "2":
                    System.out.printf("Digite a matrícula do cliente:\n");
                    String matriculaBuscado = scanner.nextLine();

                    Aluno alunoBuscado = op.buscarAluno(matriculaBuscado);

                    if (Objects.nonNull(alunoBuscado)) {
                        System.out.printf("Dados do aluno buscado:\n" + alunoBuscado + "\n");
                    } else {
                        System.out.printf("Cliente não encontrado:\n");
                    }
                break;
                default:
                break;
            }
        } while (operacoes.equals("1") || operacoes.equals("2"));
    }
}