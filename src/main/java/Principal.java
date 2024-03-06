import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static ArrayList<Figura> figura = new ArrayList<Figura>();
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args){

        llenarFigura();
        mostrarResultado();

    }

    public static void llenarFigura (){
        int opcion;
        char respuesta;
        do {
            do {
                System.out.println("que figura desea ingresar?   " +
                        "1.triangulo   " +
                        "2. rectangulo    " +
                        "3. cuadrado    ");
                System.out.print("opcion ");
                opcion = entrada.nextInt();
            }
            while (opcion<1 || opcion>3) ;

                switch (opcion) {
                    case 1: llenarTriangulo();
                        break;
                    case 2: llenarRectangulo();
                        break;
                    case 3: llenarCuadrado();
                        break;

                }
                System.out.println("ingresara otra figura? s/n");
                respuesta = entrada.next().charAt(0);
                System.out.println("");
            }while (respuesta=='s' || respuesta== 'S');
        }

        public static void llenarTriangulo(){
        double lado1,lado2,lado3;
            System.out.println("ingrese el lado 1");
            lado1= entrada.nextDouble();
            System.out.println("ingrese el lado 2");
            lado2= entrada.nextDouble();
            System.out.println("ingrese el lado 3");
            lado3= entrada.nextDouble();
            triangulo triangulo = new triangulo(lado1,lado2,lado3);
            figura.add(triangulo);
        }

    public static void llenarRectangulo() {
        double lado1, lado2;
        System.out.println("ingrese el lado 1");
        lado1 = entrada.nextDouble();
        System.out.println("ingrese el lado 2");
        lado2 = entrada.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lado1,lado2);
        figura.add(rectangulo);
    }
    public static void llenarCuadrado() {
        double lado1;
        System.out.println("ingrese el lado ");
        lado1 = entrada.nextDouble();


        Cuadrado cuadrado = new Cuadrado(lado1);
        figura.add(cuadrado);
    }
    public static void mostrarResultado(){

        for(Figura figura : figura ){
            System.out.println(figura.toString());
            System.out.println("el Area es :  "+figura.area());
        }
    }
    }

