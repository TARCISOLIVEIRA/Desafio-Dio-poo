import br.com.dio.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("curso Java");
        curso.setDescricao("descriao");
        curso.setCargahoraria(8);


        System.out.print(curso);

    }



}