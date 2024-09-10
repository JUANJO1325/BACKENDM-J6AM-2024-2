package exercises;

import java.util.Scanner;

import java.util.Scanner;

public class TrabajoRegistros {

    String name;
    String email;
    String password;

    static Scanner sc = new Scanner(System.in);

    // registro de usuario
    public void registrarUsuario() {
        System.out.print("Ingrese su nombre: ");
        this.name = sc.nextLine();

        System.out.print("Ingrese su correo: ");
        this.email = sc.nextLine();

        System.out.print("Ingrese su contraseña: ");
        this.password = sc.nextLine();

        System.out.println("Registro completado");
    }

    // iniciar sesión
    public boolean iniciarSesion(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    // registro de pasos durante 5 días
    public void registrarPasos() {
        int[] pasos = new int[5];
        int totalPasos = 0;
        int dia = 0;

        // aqui el ciclo while para registrar los pasos
        while (dia < 5) {
            System.out.print("Ingrese los pasos del día " + (dia + 1) + ": ");
            pasos[dia] = sc.nextInt();
            totalPasos += pasos[dia];
            dia++;
        }

        // en esta parte calcula el promedio
        double promedioPasos = totalPasos / 5.0;

        // Ciclo for para imprimir los pasos de cada día
        System.out.println("Pasos registrados:");
        for (int i = 0; i < pasos.length; i++) {
            System.out.println("Día " + (i + 1) + ": " + pasos[i]);
        }

        System.out.println("El promedio de pasos es: " + promedioPasos);
    }

    public static void main(String[] args) {
        TrabajoRegistros usuario = new TrabajoRegistros();

        usuario.registrarUsuario();

        System.out.println("Iniciar sesión");
        System.out.print("Correo: ");
        String email = sc.nextLine();

        System.out.print("Contraseña: ");
        String password = sc.nextLine();

        if (usuario.iniciarSesion(email, password)) {
            System.out.println("Has iniciado sesión exitosamente. ¡Bienvenido " + usuario.name + "!");

            // Si en esta parte el inicio de sesión es correcto, registra los pasos
            usuario.registrarPasos();

        } else {
            System.out.println("Correo o contraseña incorrectos.");
        }
    }
}
