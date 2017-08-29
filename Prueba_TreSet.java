import java.util.Comparator;
import java.util.TreeSet;

/**
 *  MAS ELEGANTE ES UTILIZAR UNA CL ANÓNIMA DENTRO DEL CONSTRUCTOR QUE CREA LA COLECCION DE TreSet.
 *  
 * @author Usuario
 */
public class Prueba_TreSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TreeSet<Elemento> names = new TreeSet<>();
        Elemento a = new Elemento(1, "Primero");
        Elemento x = new Elemento(5, "Quinto");
        Elemento c = new Elemento(2, "Segundo");
        Elemento m = new Elemento(3, "Tercero");
        Elemento q = new Elemento(4, "Cuarto");
        Elemento zz = new Elemento(6, "Sexto");
        names.add(a); 
        names.add(x); 
        names.add(c);
        names.add(m);
        names.add(q);
        names.add(zz);

        System.out.println("\n Ordenado por su id: " );
        for (Elemento s : names) {
            System.out.println(s.getDescripcion());
        }
        
        // INSTANCIAMOS LA COLECCION TreeSet UTILIZANDO EL CONSTRUCTOR QUE PIDE POR PARÁMETRO UN OBJETO Comparator
        // SE LO PASAMOS POR MENDIO DE UNA CL ANÓNIMA.
        TreeSet<Elemento> ordenaElementos = new TreeSet<Elemento>(new Comparator<Elemento>() {

            @Override
            public int compare(Elemento o1, Elemento o2) {
                String descripcionA = o1.getDescripcion();
                String descripcionB = o2.getDescripcion();
                return descripcionA.compareTo(descripcionB);
            }
        });
        
        ordenaElementos.add(a);
        ordenaElementos.add(x);
        ordenaElementos.add(c);
        ordenaElementos.add(m);
        ordenaElementos.add(q);
        ordenaElementos.add(zz);
        System.out.println("----------------------------------\n Ordenado por orden alfabético: " );
        //recorremos la colección para mostra los datos ordendos alfabéticamente
        for(Elemento e: ordenaElementos)
        System.out.println(e.getDescripcion());
    }
}

class Elemento implements Comparable<Elemento>{

    private int id;
    private String descripcion;

    public Elemento(){}
    
    public Elemento(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    /**
     * ordena los elementos teniendo en cuenta su 'id'.
     */
    @Override
    public int compareTo( Elemento o) {
        return getId() - o.getId();
    }
}

