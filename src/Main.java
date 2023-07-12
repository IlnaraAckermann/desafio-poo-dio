import java.time.LocalDate;

import edu.ilnara.desafio.domino.Bootcamp;
import edu.ilnara.desafio.domino.Curso;
import edu.ilnara.desafio.domino.Dev;
import edu.ilnara.desafio.domino.Mentoria;

public class Main {
    public static void main(String[] args) {
        
        Curso curso01 = new Curso("Primeiro Curso", "Primeiro curso do BootCamp", 8);
        Curso curso02 = new Curso("Segundo Curso", "Segundo curso do BootCamp", 3);
        Mentoria mentoria01 = new Mentoria("Primeira mentoria", "Primeira mentoria do BootCamp", LocalDate.now());

        Bootcamp javaBootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição do BootCamp", mentoria01, curso01, curso02);

        Dev devIlnara = new Dev("Ilnara");
        System.out.println(" Dev " + devIlnara.getNome() + " conteudos Inscritos: " + devIlnara.getConteudoInscritos());
        System.out.println("----------------------------------------------------------------------------------------");
        devIlnara.increverBootcamp(javaBootcamp);
        System.out.println("Dev " + devIlnara.getNome() + " conteudos Inscritos: " + devIlnara.getConteudoInscritos());
        System.out.println("----------------------------------------------------------------------------------------");
        devIlnara.progredir();
        devIlnara.progredir();
        devIlnara.progredir();
        System.out.println("Dev " + devIlnara.getNome() + " conteudos Inscritos: " + devIlnara.getConteudoInscritos());
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Dev " + devIlnara.getNome() + " conteudos concluidos: " + devIlnara.getConteudoConcluidos());
        System.out.println("XP " + devIlnara.calcularTotalXP());
        System.out.println("----------------------------------------------------------------------------------------");

        Dev devCamila = new Dev("Camila");
        devCamila.increverBootcamp(javaBootcamp);
        devCamila.progredir();
        System.out.println("Dev " + devCamila.getNome() + " conteudos Inscritos: " + devCamila.getConteudoInscritos());        
        System.out.println("XP " + devCamila.calcularTotalXP());
        System.out.println("----------------------------------------------------------------------------------------");

        
        Dev devAndre = new Dev("Andre");
        devAndre.increverBootcamp(javaBootcamp);
        System.out.println("Dev " + devAndre.getNome() + " conteudos Inscritos: " + devAndre.getConteudoInscritos());        
        System.out.println("XP " + devAndre.calcularTotalXP());
        System.out.println("----------------------------------------------------------------------------------------");

        Dev devMario = new Dev("Mario");
        System.out.println("Dev " + devMario.getNome() + " conteudos Inscritos: " + devMario.getConteudoInscritos());        
        System.out.println("XP " + devMario.calcularTotalXP());

    }
}
