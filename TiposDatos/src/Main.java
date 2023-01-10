public class Main {
    /**
     * Crear un proyecto java desde cero
     * crear un paquete.
     * Dentro del paquete crear una clase.
     * Dentro de la clase crear un metodo main.
     * Imprimer todos los tipos de datos vistos
     */

    public static void main(String[] args) {
     // numericos
        //1.1 Enteros
        Byte variable1= 6;
        System.out.println("los datos enteros numericos son  Byte;" + " " + variable1);
        Short variable2= 11;
        System.out.println("los datos enteros numericos son  Short;" + " "  +variable2);
        int variable3= 12;
        System.out.println("los datos enteros numericos son  Int;"+ " " + variable3);
        long variable4=1555;
        long numeroTelefono=7235698;
        System.out.println("los datos enteros numericos son  long + long numero;" + variable4+ "  " + numeroTelefono);
        //1.2 decimales
        Float variable5=5.65f;
        System.out.println("los datos decimales numericos son  Float;"+ " " + variable5);
        double variable6= 10.65d;
        System.out.println("los datos decimales numericos son  Double;"+ " " + variable6);
        //2 Boleano
        boolean variable7 = true;
        boolean variable8= false;
        System.out.println("los datos booleanos  son  ;"+ " " + variable7  + " " + variable8);
        // texto
        char variable9='d';
        System.out.println("los tipos de datos texto  son  char;"+ " " + variable9);
        String variable10= "Esto es una variable string";
        System.out.println("los tipos de datos texto  son  string;"+ " " + variable10);

    }
}