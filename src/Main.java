<<<<<<< HEAD
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
=======
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
>>>>>>> 97c9b5726d4b01553b23f69c061cd327f8a88f59

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
<<<<<<< HEAD
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
=======
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome! ");

        Object obj = null;

        try {
            obj = Class.forName("Lista").newInstance();
        } catch (ClassNotFoundException | InstantiationException |
                 IllegalAccessException e) {
            e.printStackTrace();
        }

        Field field = null;

        List<String> lista = new ArrayList<>();
        lista.add("Samsung");
        lista.add("Apple");
        lista.add("Microsoft");

        /*
        Method metodoSet = null;

        try {
            metodoSet = obj.getClass().getMethod("setLi", String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        try {
            for (String v : lista) {
                metodoSet.invoke(obj, v);
            }
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }*/

        try {
            field = obj.getClass().getDeclaredField("li");
            field.setAccessible(true);
            field.set(obj, lista);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }

        @SuppressWarnings("unchecked")
        List<String> listaInterna = null;

        try {
            listaInterna = (List<String>) field.get(obj);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
<<<<<<< HEAD

        System.out.println("Conteúdo dentro do objeto Lista: " + listaInterna);
=======
>>>>>>> 97c9b5726d4b01553b23f69c061cd327f8a88f59
>>>>>>> f27bd8177d5d274448ad75c89bd5cb640be68d0a
    }
}