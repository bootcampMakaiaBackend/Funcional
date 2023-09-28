import java.time.LocalDateTime;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
       // (... argumentos) -> {... body }
       //Supplier -> algo que no recibe parametros pero me retorna algo.
       Supplier<LocalDateTime> dataTime = () -> LocalDateTime.now();
       dataTime.get();
       String time = dataTime.get().toString();
       //Consumer -> recibe como parametro algo, pero no devuelve
        Consumer<String> print = (x) -> System.out.println(x);
        print.accept(time);
        //Function<T,R>
        Function<String, Integer> size = (x) -> x.length();
        Integer sizeString = size.apply(time);
        System.out.println("El tamano es: " + sizeString);
        //BiFunction<T,R,S>
        BiFunction<Integer, Integer, Integer> suma = (numero1, numero2) -> numero1 + numero2;
        Integer sumatoria = suma.apply(6,8);
        System.out.println("la suma de estos numeros es : " + sumatoria);
        //Predicate -> recibe un parametro y me devuelve un booleano
        Predicate<String> validador =  (nombre) -> nombre.equals("MATEO");
        boolean esIugal = validador.test("MATEO");
        System.out.println("es igual?: " + esIugal);


    }
}