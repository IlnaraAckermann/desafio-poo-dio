import java.time.LocalDate;

import edu.ilnara.desafio.domino.Bootcamp;
import edu.ilnara.desafio.domino.Curso;
import edu.ilnara.desafio.domino.Dev;
import edu.ilnara.desafio.domino.Mentoria;

public class Main {
    public static void main(String[] args) {
        
        Curso curso01 = new Curso();
        curso01.setTitulo("Primeiro curso");
        curso01.setDescricao("Primeiro curso do bootcamp");
        curso01.setCargaHoraria(8);

        Curso curso02 = new Curso();
        curso02.setTitulo("Segundo curso");
        curso02.setDescricao("Segundo curso do bootcamp");
        curso02.setCargaHoraria(8);

        Mentoria mentoria01 = new Mentoria();
        mentoria01.setTitulo("Primeira mentoria");
        mentoria01.setDescricao("Primeira mentoria do Bootcamp");
        mentoria01.setData(LocalDate.now());

        
/*         System.out.println(curso01);
        System.out.println(curso02);
        System.out.println(mentoria01); */

        Bootcamp javaBootcamp = new Bootcamp();
        javaBootcamp.setNome("Bootcamp Java Developer");
        javaBootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        javaBootcamp.getConteudos().add(mentoria01);
        javaBootcamp.getConteudos().add(curso01);
        javaBootcamp.getConteudos().add(curso02);
        
        Dev devIlnara = new Dev();
        devIlnara.setNome("Ilnara");
        devIlnara.increverBootcamp(javaBootcamp);
        System.out.println("Dev " + devIlnara.getNome() + " conteudos Inscritos: " + devIlnara.getConteudoInscritos());
        devIlnara.progredir();
        devIlnara.progredir();
        devIlnara.progredir();
        System.out.println("Dev " + devIlnara.getNome() + " conteudos Inscritos: " + devIlnara.getConteudoInscritos());
        System.out.println("Dev " + devIlnara.getNome() + " conteudos Inscritos: " + devIlnara.getConteudoConcluidos());
        System.out.println("XP " + devIlnara.calcularTotalXP());

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.increverBootcamp(javaBootcamp);
        devCamila.progredir();
        System.out.println("Dev " + devCamila.getNome() + " conteudos Inscritos: " + devCamila.getConteudoInscritos());        
        System.out.println("XP " + devCamila.calcularTotalXP());

        
        Dev devAndre = new Dev();
        devAndre.setNome("Andre");
        devAndre.increverBootcamp(javaBootcamp);
        System.out.println("Dev " + devAndre.getNome() + " conteudos Inscritos: " + devAndre.getConteudoInscritos());        
        System.out.println("XP " + devAndre.calcularTotalXP());

        Dev devMario = new Dev();
        devMario.setNome("Mario");
        System.out.println("Dev " + devMario.getNome() + " conteudos Inscritos: " + devMario.getConteudoInscritos());        
        System.out.println("XP " + devMario.calcularTotalXP());

    }
}
