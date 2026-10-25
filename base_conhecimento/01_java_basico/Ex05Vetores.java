/**
 * Vetor tem tamanho fixo. O índice começa em 0 e vai até length - 1.
 * A urna: um contador para cada candidato.
 *
 * Rode: java Ex05Vetores.java
 */
public class Ex05Vetores {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carla"};
        int[] votos = new int[3];

        votos[0] = votos[0] + 1;
        votos[0] = votos[0] + 1;
        votos[2] = votos[2] + 1;

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i] + ": " + votos[i]);
        }
        System.out.println("tamanho do vetor: " + votos.length);
    }
}
