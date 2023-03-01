public class Ex_cuatro_switch {

    public static void main (String [] args) {

        var estacion="Verano";

        switch (estacion) {
            case "Primavera":
                System.out.println("Estamos en primavera.");
                break;
            case "Verano":
                System.out.println("Estamos en verano.");
                break;
            case "Otoño":
                System.out.println("Estamos en otoño.");
                break;
            default:
                System.out.println("Estamos en invierno.");


        }
    }
}
