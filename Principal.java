import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda ();

        int opcion=0;
        while (opcion !=8){

            System.out.println("******************************\n" +
                    "Bienvenidos al Conversor de Monedas\n\n" +
                    "Ingrese la Conversión que desea Realizar\n\n" +
                    "1. Dollar a Peso Chileno\n" +
                    "2. Peso Chileno a Dollar\n" +
                    "3. Dollar a Real Brasilero\n" +
                    "4. Real Brasilero a Dollar\n" +
                    "5. Dollar a Peso Colombiano\n" +
                    "6. Peso Colombiano a Dollar\n" +
                    "7. Convertir otra Moneda\n" +
                    "8. Salir");

            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){

                case 1:
                    ConvertirMoneda.convertir("USD", "CLP", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("CLP", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no Valida");
                    break;
            }
        }


    }
}
