package ud6;

import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
public class E1212 {
    public static void main(String[] args) {
       Conjunto conjunto = new Conjunto();


    }

    static class Conjunto {
        static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2){
            Set<E> union = new TreeSet<>();
            union.addAll(conjunto1);
            union.addAll(conjunto2);
            return union;
        }
        static <E> Set<E> interseccion(Set<E> conjunto1, Set<E> conjunto2){
            Set<E> intersec = new TreeSet<>();
            intersec.addAll(conjunto1);
            intersec.addAll(conjunto2);
            return intersec;
        }
        static <E> Set<E> except(Set<E> conjunto1, Set<E> conjunto2){
            Set<E> except = new TreeSet<>();
            except.addAll(conjunto1);
            except.addAll(conjunto2);
            return except;
        }

    }
}
