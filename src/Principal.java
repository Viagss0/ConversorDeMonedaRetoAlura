import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

    String menu = """ 
            ***************************************************************
            Sea bienvenido/a al Conversor de Moneda =)
            
            1) Dólar =>> Peso argentino
            2) Peso argentino =>> Dólar
            3) Dólar =>> Real brasileño
            4) Real brasileño =>> Dólar
            5) Dólar =>> Peso colombiano
            6) Peso colombiano =>> Dólar
            7) Salir
            Elija una opción válida:
            ***************************************************************
            """;
    String mensajeIngreseValor = "Ingrese el valor que deseas convertir: ";

    int opcion = 0;
    Scanner teclado = new Scanner(System.in);

    while (opcion!=7){
        ConsultaConversion consultaConversion = new ConsultaConversion();
        Scanner lecturaV = new Scanner(System.in);
        System.out.println(menu);
        opcion = teclado.nextInt();

        switch (opcion){
            case 1:
                //System.out.println("Escriba la cantidad que desea convertir de USD a ARS: ");
                //var cantidad = Integer.valueOf(lecturaV.nextLine());
                System.out.println(mensajeIngreseValor);
                var cantidad = lecturaV.nextDouble();
                Moneda moneda = consultaConversion.conversionMoneda("USD","ARS", cantidad);
                String mensajeRespuesta = "El valor "+cantidad+" ["+moneda.base_code()+"] corresponde al valor final de =>>> "+moneda.conversion_result()+" ["+moneda.target_code()+"]\n";
                System.out.println("El valor "+cantidad+" ["+moneda.base_code()+"] corresponde al valor final de =>>> "+moneda.conversion_result()+" ["+moneda.target_code()+"]\n");
                //System.out.println(cantidad+" "+moneda.base_code()+" = "+moneda.conversion_result()+" "+moneda.target_code());
                break;
            case 2:
                System.out.println(mensajeIngreseValor);
                cantidad = lecturaV.nextDouble();
                moneda = consultaConversion.conversionMoneda("ARS", "USD", cantidad);
                System.out.println("El valor "+cantidad+" ["+moneda.base_code()+"] corresponde al valor final de =>>> "+moneda.conversion_result()+" ["+moneda.target_code()+"]\n");
                break;
            case 3:
                System.out.println(mensajeIngreseValor);
                cantidad = lecturaV.nextDouble();
                moneda = consultaConversion.conversionMoneda("USD", "BRL", cantidad);
                System.out.println("El valor "+cantidad+" ["+moneda.base_code()+"] corresponde al valor final de =>>> "+moneda.conversion_result()+" ["+moneda.target_code()+"]\n");
                break;
            case 4:
                System.out.println(mensajeIngreseValor);
                cantidad = lecturaV.nextDouble();
                moneda = consultaConversion.conversionMoneda("BRL", "USD", cantidad);
                System.out.println("El valor "+cantidad+" ["+moneda.base_code()+"] corresponde al valor final de =>>> "+moneda.conversion_result()+" ["+moneda.target_code()+"]\n");
                break;
            case 5:
                System.out.println(mensajeIngreseValor);
                cantidad = lecturaV.nextDouble();
                moneda = consultaConversion.conversionMoneda("USD", "COP", cantidad);
                System.out.println("El valor "+cantidad+" ["+moneda.base_code()+"] corresponde al valor final de =>>> "+moneda.conversion_result()+" ["+moneda.target_code()+"]\n");
                break;
            case 6:
                System.out.println(mensajeIngreseValor);
                cantidad = lecturaV.nextDouble();
                moneda = consultaConversion.conversionMoneda("COP", "USD", cantidad);
                System.out.println("El valor "+cantidad+" ["+moneda.base_code()+"] corresponde al valor final de =>>> "+moneda.conversion_result()+" ["+moneda.target_code()+"]\n");
                break;
            case 7:
                System.out.println("Saliendo del programa, gracias por usar nuestros servicios");
                break;
            default:
                System.out.println("Opción no valida");

        }
    }

    }
}
