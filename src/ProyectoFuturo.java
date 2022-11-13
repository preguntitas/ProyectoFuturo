public class ProyectoFuturo {
    public static void main(String[] args) {
        System.out.println("Estudiante " + args[0] + " : " + veredicto(args[1],args[2]));

    }
    static String veredicto(String valor1, String valor2) {
        if (valor1.equals(valor2)) {
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }
        if (Integer.valueOf(valor1) > Integer.valueOf(valor2)){ // el operador correcto es mayor que
            return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        return "Ideal. Trabajas los contenidos en casa.";
    }
}
