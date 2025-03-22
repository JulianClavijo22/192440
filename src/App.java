import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Nombre vendedor:");
        String NombreVendedor = input.nextLine();

        

        System.out.println("Cantidad de productos vendidos:");
        short CantidadProducts = input.nextShort();
        
        
        

        for (short i = 0; i < CantidadProducts; i++) {
            System.out.println("Ingrese valor producto "+i);
            int ValorProducto = input.nextInt();
            double Comisiones = 0;

        if ( ValorProducto >= 100000) {
            Comisiones = Comisiones + (ValorProducto * 0.10);
        } else {
            Comisiones = Comisiones + (ValorProducto * 0.05);
        }

        if (ValorProducto >= 100000) {
            Comisiones = Comisiones + (ValorProducto * 0.10);
        } else {
            Comisiones = Comisiones + (ValorProducto * 0.05);
        }

        if (ValorProducto >= 100000) {
            Comisiones = Comisiones + (ValorProducto * 0.10);
        } else {
            Comisiones = Comisiones + (ValorProducto * 0.05);
        }

        if (ValorProducto >= 100000) {
            Comisiones = Comisiones + (ValorProducto * 0.10);
        } else {
            Comisiones = Comisiones + (ValorProducto * 0.05);
        }

        if (ValorProducto >= 100000) {
            Comisiones = Comisiones + (ValorProducto * 0.10);
        } else {
            Comisiones = Comisiones + (ValorProducto * 0.05);
        }

        if (ValorProducto >= 100000) {
            Comisiones = Comisiones + (ValorProducto * 0.10);
        } else {
            Comisiones = Comisiones + (ValorProducto * 0.05);
        }

        if (ValorProducto >= 100000) {
            Comisiones = Comisiones + (ValorProducto * 0.10);
        } else {
            Comisiones = Comisiones + (ValorProducto * 0.05);
        }

        double SalarioTotal = (double) (Comisiones + 1000000);

        System.out.println("Vendedor: " + NombreVendedor);
        System.out.println("Total ventas: " + ValorProducto);
        System.out.println("Comisiones: " + (short)Comisiones);
        System.out.println("Salario total: " + (short)SalarioTotal);

            
        }
        input.close();

        
        
        
    }
}

