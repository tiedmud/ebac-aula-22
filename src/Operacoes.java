import javax.imageio.IIOException;
import java.io.*;
import java.lang.reflect.Field;

public class Operacoes {
    public void adicionarAluno(Aluno aluno) throws Exception {
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter("C:\\Users\\ricar\\IdeaProjects\\Aula20\\src\\alunos.txt", true));
            writer.write(aluno.toString());
            writer.newLine();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            throw e;
        } finally {
            writer.close();
        }
    }

    public Aluno buscarAluno(String id) throws Exception {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\ricar\\IdeaProjects\\Aula20\\src\\alunos.txt"));
            String linha = reader.readLine();

            while (linha != null) {
                if (linha.substring(0, linha.indexOf("|")).equals(id)) {
                    return coverterObjeto(linha);
                } else {
                    linha = reader.readLine();
                }
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            throw e;
        } finally {
            reader.close();
        }

        return null;
    }

    private Aluno coverterObjeto(String linha) throws IllegalAccessException {
        String[] atributos = linha.split("\\|");
        Aluno alunoDoArquivo = new Aluno();

        Field[] fields = Aluno.class.getDeclaredFields();

        try {
            for (int i = 0; i < fields.length; i++) {
                fields[i].setAccessible(true);
                fields[i].set(alunoDoArquivo, atributos[i]);
            }
        } catch (Exception e) {
            throw e;
        }

        return alunoDoArquivo;
    }
}
