import java.time.LocalDate;

import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

public class App {
    public static void main(String[] args) {
    
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição do curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());    
       
        Bootcamp bootcamp = new Bootcamp();
       
        
        bootcamp.setNome("Bootcamp Java Develper");       
        bootcamp.setDescricao("Descrição Bootcamp Java Developr");       
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos  camila" + devCamila.getConteudoIncritos());
        System.out.println("-");
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteudos Inscritos  camila" + devCamila.getConteudoIncritos());
        System.out.println("Conteudos Concluidos  camila" + devCamila.getConteudoConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());
        System.out.println("--------------");



        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao" + devJoao.getConteudoIncritos());
        System.out.println("-");
        devJoao.progredir();
        System.out.println("Conteudos Concluidos Joao" + devJoao.getConteudoConcluidos());
        System.out.println("Conteudos Inscritos Joao" + devJoao.getConteudoIncritos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}