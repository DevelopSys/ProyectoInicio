import java.util.Scanner;

public class Inicial {

    // ejemplo de comentario
    // Variables de clase
    int numero=0;
    Integer numeroComplejo = 213;
    boolean acierto = false;
    char letra = 'A';
    String palabra = "ejemplo";

    public static void main(String[] args) {

        //Scanner lector = new Scanner(System.in);
        //String nombre = lector.next();
        //System.out.println(nombre);
        // mi primera variable
        // TODO Pendiente el hacer la instancia de la funcion de callback()
        // variables de método
        //System.out.println(acierto);
        int numero=34567;

        System.out.println("con salto de linea");
        System.out.print("sin salto de linea \n");
        System.out.print("sin salto de linea");
        String parte1 = "Esto es un ejemplo";
        String parte2 = "del formateo";
        int numeroFormateo = 212;
        System.out.printf("%s %s %d %n",parte1,parte2,numeroFormateo);

        if (numero<0 || numero>10){
            System.out.println("Error");
        } else if (numero<5) {
            System.out.println("Suspenso");
        } else {
            System.out.println("Aprobado");
        }


        Object[] palabras = {"asd","ASD","asd","etewr","hygrdf",123,false,234.5};

        for (Object temp: palabras) {
            System.out.println(temp);
        }

        int[] numeros = new int[9];

        for (int i=0;i<numeros.length;i++){
            System.out.println(Math.random());
            numeros[i] = (int) (Math.random()*10);
        }

        for (int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }

        System.out.println("WH");

        int numeroW = 3;
        while(numeroW==0){
            System.out.println("asdasd");
            //numeroW--;
        }

        do{
            System.out.println("asdasd");
        }while (numeroW == 0);

        System.out.println("SW");

        int numeroSw =342;
        switch (numeroSw){

            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("no contemplado");
                break;

        }

        int numeroCast = 6;
        String letraCast = String.valueOf(numeroCast);

        double decimal = 0.0;
        int decimalEntero = (int) decimal;


        // suma, resta, mult, div

        int op1=1, op2=3;

        op1 += op2;

        int suma = op1 + op2;
        int resta = op1 - op2;
        int mult = op1 * op2;
        int div = op1 / op2;
        int rest = op1 % op2;



        op1++;
        op1--;

    }


    public void sentencias(){

        int op1 =10, op2 =7;


        if (op1==op2){

        }

    }

    public void metodoUno(){
        // variable de método
        int numero = 21;
    }

    public void metodoDos(){
        numero = 56;

    }

}
