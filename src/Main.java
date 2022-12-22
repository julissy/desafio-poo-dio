import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descricao curso JS");
        curso2.setCargaHoraria(6);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descricao mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJu = new Dev();
        devJu.setNome("Julissy");
        devJu.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devJu.getConteudoInscrito());
        //a cada chamada de progredir o primeiro conteudo é concluido
        devJu.progredir();
        System.out.println("--");
        System.out.println("Conteudos inscritos" + devJu.getConteudoInscrito());
        System.out.println("Conteudos concluidos" + devJu.getConteudoConcluido());
        System.out.println("XP:" + devJu.calcularTotalXp());
        devJu.progredir();
        System.out.println("--");
        System.out.println("Conteudos inscritos" + devJu.getConteudoInscrito());
        System.out.println("Conteudos concluidos" + devJu.getConteudoConcluido());
        System.out.println("XP:" + devJu.calcularTotalXp());

        System.out.println("-----------------------------------");
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devJoao.getConteudoInscrito());
        devJoao.progredir();
        System.out.println("Conteudos concluidos" + devJoao.getConteudoConcluido());
    }
}
