/* package ud6.festivaldasmeigas;
import java.util.*;
import ud6.festivaldasmeigas.Feitizo;

public class Meiga {
    // Atributos
    private String nome;
    private String alcume;
    List<String> feitizos;
    List<String> inventario;

    //List<String> nomes;
    //List<String> alcumes;


    // Constructores
    public Meiga(String nome, String alcume, List<String> nomes, List<String> alcumes) {
        this.nome = nome;
        this.alcume = alcume;
        // this.nomes = nomes;
        // this.alcumes = alcumes;
        this.feitizos = feitizos;
        this.inventario = inventario;
        Feitizo.feitizosPosibles() = feitizos;
    }


    // Métodos


    public List<String> getFeitizos() {
        return feitizos;
    }

    public List<String> getInventario() {
        return inventario;
    }

    public static Meiga[] crearMeigasExemplo(Feitizo[] feitizosDisponibles) {
        Random rnd = new Random();

        String[] nomes = {"Uxía", "Lúa", "Iria", "Noa"};
        String[] alcumes = {"A das Fraguiñas", "Sombra do Vento", "Luz do Bosque", "Meiga da Brétema"};

        Meiga[] meigas = new Meiga[nomes.length];

        // Obtén todos os feitozos de exemplo e todos os seus ingredientes únicos
        Collection<Feitizo> feitizosExemplo = List.of(Feitizo.crearFeitizosExemplo());
        Collection<String> ingredientesExemplo = Feitizo.ingredientesUnicos(feitizosExemplo);

        for (int i = 0; i < nomes.length; i++) {
            String nome = nomes[i];
            String alcume = alcumes[i];
            // Xera unha colección cunha selección aleatoria de feitizos de exemplo para asignar á meiga
            Collection<Feitizo> feitizos = getFeitizosRnd(feitizosExemplo);
            // Xera un mapa cunha selección aleatoria de ingredientes e cantidades de cada un de exemplo para asignar á meiga
            Map<String, Integer> inventario = getIngredientesRnd(ingredientesExemplo, 3);

            // Crea a meiga e a engade ao array
            meigas[i] = new Meiga(nome, alcume, feitizos, inventario);
        }

        return meigas;

    }

}



    /*
        getFeitizosRnd()
        getIngredientesRnd()
        lanzarFeitizo()
     */

    /*
    private static Map<String, Integer> getIngredientesRnd(Collection<String> ingredientesExemplo, int i) {
        Map<String, Integer> ingredientesRnd = new HashMap<>();
        for (String ingrediente : ingredientesExemplo) {
        ingredientesRnd.put(ingrediente, i);
        }
        return ingredientesRnd;
    }
    }

    private static Collection<Feitizo> getFeitizosRnd(Collection<Feitizo> feitizosExemplo) {
        Collection<Feitizo> feitizosRnd = new ArrayList<>();
        for (Feitizo f : feitizosExemplo) {
            feitizosRnd.add(f);
        }
        return feitizosRnd;
    }
    */


