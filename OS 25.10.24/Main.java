import java.util.Random;

import modelo.AddVetorMaster;

public class Main{

        private static final int TAMANHO = 900000000;
        private static final int NTHREADS = 2;
        public static void main(String[] args) {
            // Criar Vetores
            double[] a = new double[TAMANHO];
            double[] b = new double[TAMANHO];
            double[] r;

            // Vetores
            Random random = new Random();
            for (int i = 0; i < TAMANHO; i++) {
                a[i] = random.nextDouble() * 100;
                b[i] = random.nextDouble() * 100;
            } 

            // System.out.println("Vetor A:");
            for (int i = 0; i < TAMANHO; i++) {
                // System.out.printf("%.2f\n", a[i]);
            }

            // System.out.println("Vetor B:");
            for (int i = 0; i < TAMANHO; i++) {
                // System.out.printf("%.2f\n", b[i]);
            }

            // Executar Master
            AddVetorMaster mrm = new AddVetorMaster(a, b, NTHREADS);
        
            mrm.calcVetores();
            r = mrm.getVetorR();

            // pegar e imprimir resultado
            // System.out.println("[ " + r[0]);

            // for(int i = 1; i < TAMANHO-1; i++){
            //     System.out.print(" | " + r[i]);
            // }
            // System.out.println(" | " + r[TAMANHO-1]);

            System.out.printf("[ R[0]" + "%.2f", r[0]);
            for(int i = 1; i < TAMANHO -1; i++);
        }
    }