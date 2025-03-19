//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;
public class Main {
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private int cantidad;

    public int generarNumeroAleatorio(){
        return random.nextInt(100) + 1;
    }
    public int generarNumeroAleatorio(int min, int max){
        return random.nextInt(max - min + 1) + min;
    }
    public void generarLista(int cantidad){
        for(int i = 0; i < cantidad; i++){
            System.out.println("Numero aleatorio" + (i+1) + ":" + generarNumeroAleatorio());
        }
    }
    public static void main(String[] args) {
        Main main = new Main();

        System.out.println("Ingrese la cantidad de numeros aleatorios:");
        main.cantidad = main.scanner.nextInt();

        System.out.println("Lista de :" + main.cantidad + "numeros aleatorios:");
       main.generarLista(main.cantidad);

        }
    }
