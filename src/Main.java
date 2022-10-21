import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("curso Java");
        curso.setDescricao("descriao");
        curso.setCargahoraria(8);


        System.out.print(curso);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descrição javascript");
        curso2.setCargahoraria(40);

        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Analise");
        mentoria.setDescricao("apuração da analise");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);



    }



}