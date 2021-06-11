package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double mediaAluno, mediaTurma, mediaGeral;
        final int QTDE_ALUNOS = 3;
        final int QTDE_TURMAS = 2;

        mediaGeral = 0;
        for (int turma = 1; turma <= QTDE_TURMAS; turma++) {

            System.out.println("Turma " + turma);

            mediaTurma = 0;
            for (int aluno = 1; aluno <= QTDE_ALUNOS; aluno++) {
                System.out.printf("Digite a média do aluno %d: ", aluno);
                mediaAluno = entrada.nextDouble();
                mediaTurma = mediaTurma + mediaAluno;
            }
            mediaTurma = mediaTurma / QTDE_ALUNOS;
            System.out.printf("Média da turma %d = %.2f\n",turma, mediaTurma );
            mediaGeral = mediaGeral + mediaTurma;
        }
        
        mediaGeral = mediaGeral / QTDE_TURMAS;
        System.out.printf("Média geral = %.2f\n", mediaGeral);

        entrada.close();
    }
}
