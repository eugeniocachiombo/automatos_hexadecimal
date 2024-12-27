package automatos.hexadecimal;

public class AutomatosHexadecimal {

    public static void main(String[] args) {
        String valor = "0m";

        automato(valor);
    }

    public static void automato(String valor) {
        /*TEMOS:
         estado
         valor
         simbolo
         ALFABETO É (0, 1)
         */

        int estado = 0; //Estado Inicial
        Boolean erro = false;
        char[] simbolo = valor.toCharArray();

        System.out.println("Detalhes: \nEstado inicial: q[" + estado + "] \nEstado Final: q[1] ou q[4]");
        System.out.println("***************************");

        for (int i = 0; i < valor.length() && erro == false; i++) {

            switch (estado) {

                //ESTADO 0
                case 0:
                    if (simbolo[i] == '0') {
                        estado = 1;
                        System.out.println("Estado actual: q[" + estado + "]");
                        System.out.println("***************************");
                    } else if (simbolo[i] == '1' || simbolo[i] == '.') {
                        estado = 2;
                        System.out.println("Estado actual: q[" + estado + "]");
                        System.out.println("***************************");
                    } else {
                        erro = true;
                        System.out.println("O Simbolo '" + simbolo[i] + "' não pertence ao alfabeto");
                    }
                    break;
               //FIM ESTADO 0

                //ESTADO 1
                case 1:
                    if (simbolo[i] == '0') {
                        estado = 1;
                        System.out.println("Estado actual: q[" + estado + "]");
                        System.out.println("***************************");
                    } else if (simbolo[i] == '1') {
                        estado = 2;
                        System.out.println("Estado actual: q[" + estado + "]");
                        System.out.println("***************************");

                    } else if (simbolo[i] == '.') {
                        estado = 3;
                        System.out.println("Estado actual: q[" + estado + "]");
                        System.out.println("***************************");
                    } else {
                        erro = true;
                        System.out.println("O Simbolo '" + simbolo[i] + "' não pertence ao alfabeto");
                    }
                    break;
               //FIM ESTADO 1

                //ESTADO 3
                case 3:
                    if (simbolo[i] == '0') {
                        estado = 4;
                        System.out.println("Estado actual: q[" + estado + "]");
                        System.out.println("***************************");
                    } else {
                        erro = true;
                        System.out.println("O Simbolo '" + simbolo[i] + "' não pertence ao alfabeto");
                    }
                    break;
               //FIM ESTADO 3

                //ESTADO 4
                case 4:
                    if (simbolo[i] == '0') {
                        estado = 4;
                        System.out.println("Estado actual: q[" + estado + "]");
                        System.out.println("***************************");
                    } else if (simbolo[i] == '.') {
                        erro = true;
                        // System.out.println("O Simbolo '" + simbolo[i] +"' não pertence ao alfabeto");
                        System.out.println("O Simbolo '" + simbolo[i] + "' não pode ser repetido");
                    } else {
                        erro = true;
                        System.out.println("O Simbolo '" + simbolo[i] + "' não pertence ao alfabeto");
                    }
                    break;
               //FIM ESTADO 4

            }//FIM Switch
        } //FIM for

        if (erro == true) {

        } else if (estado == 1 || estado == 4) {
            System.out.println("Estado Final: q[" + estado + "]");
            System.out.println("***************************");
            System.out.println("\n***********Pertence");
        } else {
            System.out.println("Estado Final: q[" + estado + "]");
            System.out.println("***************************");
            System.out.println("\n*************Não Pertence");
                //System.out.println("Estado: "+estado);
            //    System.out.println("Simbolo: "+simbolo[i]);
        }
    }
}
