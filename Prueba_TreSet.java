import java.util.TreeSet;

/**
 *LAS COLECCIONES DE TIPO SET ORDENA LOS ELEMENTOS DE LAS COLECCIONES ORDENADAMENTE.
 * @author Usuario
 */
public class Prueba_TreSet {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Juana");
        names.add("Raquel");
        names.add("Ana");
        names.add("Eva");
        
        for(String s: names){
            System.out.println(s);
        }
    }
}

    












