package Principal;

import java.util.Scanner;
//Andres Leonardo Camargo Cortes
public class Main {
    public static void main(String[] args) {
        /*PARCIAL ARQUITECTURA DE DATOS
        Se quiere crear una aplicación para controlar los gastos telefónicos de una empresa.
        La empresa cuenta con tres líneas telefónicas a través de las cuales se pueden realizar llamadas:
        locales
        largaDistancia
        celulares

                La empresa cuenta con planes telefónicos que establece las siguientes tarifas:

        Minuto Llamada Local: $60 pesos
        Minuto Llamada Larga Distancia: $1200 pesos
        Minuto Llamada Celular: $850 pesos

        La aplicación debe permitir:
        1. REGISTRAR una llamada en alguna de las líneas,

        2. MOSTRAR la información detallada de cada línea (
        número de llamadas realizadas
        duración total de las llamadas en minutos
        y el costo total de las llamadas en pesos)

        3. MOSTRAR un consolidado total de la información de todas las líneas (
                costo total en pesos de las tres líneas,
                número total de llamadas realizadas,
                duración total de llamadas en minutos y
                el cálculo del costo promedio: por minuto según el costo total y
                el total de minutos).

                Adicionalmente, la aplicación debe permitir

        4. REINICIAR el uso las líneas telefónicas, dejando todos sus valores en cero.*/

        Scanner teclado = new Scanner(System.in);
        LineaTelefonica local = new LineaTelefonica();
        LineaTelefonica distancia = new LineaTelefonica();
        LineaTelefonica celular = new LineaTelefonica();

        boolean menu = true;
        do {
            System.out.println("Menu Lineas Telefonicas");
            System.out.println("1.Llamada Local");
            System.out.println("2.Llamada Larga distancia");
            System.out.println("3.Llamada Celular");
            System.out.println("4.Informacion Linea Local");
            System.out.println("5.Informacion Linea Larga distancia");
            System.out.println("6.Informacion Linea Celular");
            System.out.println("7.Ver Consolidado de Informacion");
            System.out.println("8.Reiniciar Lineas");
            System.out.println("9.SALIR");
            int opc = teclado.nextInt();
            int minutos;
            switch (opc){
                case 1:
                    System.out.println("\tRealizando Llamada Local -> Valor Minuto: $60 pesos\nRegistre cantidad de minutos: ");
                    minutos = teclado.nextInt();
                    local.registrarLlamada(minutos, 120);
                    break;
                case 2:
                    System.out.println("\tRealizando Llamada Larga distancia -> Valor Minuto $1200 pesos\nRegistre cantidad de minutos: ");
                    minutos = teclado.nextInt();
                    distancia.registrarLlamada(minutos, 1200);
                    break;
                case 3:
                    System.out.println("\tRealizando Llamada Larga distancia -> Valor Minuto $850 pesos\nRegistre cantidad de minutos: ");
                    minutos = teclado.nextInt();
                    celular.registrarLlamada(minutos, 850);
                    break;
                case 4:
                    System.out.println("\tLinea Telefonica: Local");
                    System.out.println(local.mostrarInformacion());
                    break;
                case 5:
                    System.out.println("\tLinea Telefonica: Larga Distancia");
                    System.out.println(distancia.mostrarInformacion());
                    break;
                case 6:
                    System.out.println("\tLinea Telefonica: Celular");
                    System.out.println(celular.mostrarInformacion());
                    break;
                case 7:
                    System.out.println("\tConsolidado de informacion");
                    System.out.println(LineaTelefonica.mostrarConsolidado(local, distancia, celular));
                    break;
                case 8:
                    local.reiniciar();
                    distancia.reiniciar();
                    celular.reiniciar();
                    System.out.println("\tLineas Reiniciadas");
                    break;
                case 9:
                    System.out.println("\tGracias por usar nuestro servicio");
                    menu = false;
            }
        } while (menu == true);
    }
}