import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        float Edad = input.nextFloat();
        System.out.println("Ingresa la suma de la contraseña ultra secreta");
        float ContraSecret = input.nextFloat();
        
        
        if (Edad>=18 && ContraSecret==10) {
            for (int i = 0; i < 100; i++) {
                System.out.println("Ingrese la contraseña");
                String Contraseña = input.next();

                for (int j = 0; j < 3; j++) {
                    if (Contraseña=="la matrix vive") {
                        System.out.println("Validado");
    
                     
                      
                    }
                    
                }
                
                    
                }
                
            }
            input.close();
            
        }
    }

