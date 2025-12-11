import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descrição curso java");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria em java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devStacy = new Dev();
        devStacy.setNome("Stacy");
        devStacy.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Stacy" + devStacy.getConteudosInscritos());

        devStacy.progredir();
        devStacy.progredir();
        System.out.println("-");

        System.out.println("Conteúdos Inscritos Stacy" + devStacy.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Stacy" + devStacy.getConteudosConcluidos());
        System.out.println("XP:" + devStacy.calcularTotalXp());

        System.out.println("------");

        Dev devJoe = new Dev();
        devJoe.setNome("Joe");
        devJoe.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Joe" + devJoe.getConteudosInscritos());

        devJoe.progredir();
        devJoe.progredir();
        devJoe.progredir();
        System.out.println("-");

        System.out.println("Conteúdos Inscritos Joe" + devJoe.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Joe" + devJoe.getConteudosConcluidos());
        System.out.println("XP:" + devJoe.calcularTotalXp());



    }
}