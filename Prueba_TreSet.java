import java.util.Comparator;
import java.util.TreeSet;

/**
 * LAS COLECCIONES DE TIPO SET ORDENA LOS ELEMENTOS DE LAS COLECCIONES
 * ORDENADAMENTE
 *
 * LOS OBJETOS QUE NO TENGAN IMPLEMENTADA LA INTERFACE ‘COMPARABLE’ NO PUEDEN HACERLO.
 *  para ello tenemos que implementar esta interface a la cl, y reescribir su mt, 'compareTo( Elemento o)'
 * 
 * SI EL OBJETO NO TIENE IMPLEMENTADA LA INTERFACE ‘COMPARABLE’ Y QUEREMOS ORDENAR UNA LISTA POR ORNES ALFABÉTICO..
 * EN LA API DE JAVA VEMOS EN LOS CONSTRUCTORES DE LA CL, TRESET --> TreeSet(Comparator<? super E> comparator)<--
 * 
 * Comparator<? ES UN ATRIBUTO DE TIPO INTERFARCE
 * GRACIAS A QUE TRESET ADMITE UN PARAMETRO DE TIPO Comparator, PODEMOS CREAR UN OBJETO DE ESTE TIPO CON SU MT 'compare()' que
 *  trabaje de acuerdo a nuestras necesidades, y pasarle ese objeto Comparator a nuestra colección TreSet por parametro y de esta
 *   forma lograremos ordenar nuestro TreSet de acuerdo a otro criterio, si el objeto no implementa Comparable.
 * 
 * 1º implementamos otra interface más. Comparator<Articulo> y codificamos su mt compare(Elemento o1, Elemento o2.
 * 2º Instanciamos el objeto con la interface Comparator en la cl principal. (como no necesita parametros creo otro construcor.)
 * 3º creamos el --> TreeSet(Comparator<? super E> comparator).
 * 4º añadimos los elemento a la interface.
 * 5º recorremos la colección para mostra los datos ordendos alfabéticamente.
 * @author Usuario
 */
public class Prueba_TreSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* TreeSet<String> names = new TreeSet<>();
         names.add("Juana");
         names.add("Raquel");
         names.add("Ana");
         names.add("Eva");*/
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
        // Instanciamos el objeto con la interface Comparator
        Elemento comparadorElemento = new Elemento();
        // creamos el --> TreeSet(Comparator<? super E> comparator), le estamos diciendo
        // que almacenará los elementos según indique el comparador 'comparadorElemento'.
        TreeSet<Elemento> ordenaElementos = new TreeSet<Elemento>(comparadorElemento);
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

class Elemento implements Comparable<Elemento>, Comparator<Elemento> {

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
    
    @Override
    public int compareTo( Elemento o) {
        return getId() - o.getId();
    }

    /**
     * METODO DE LA INTERFACE Comparator<Articulo>
     * @param o1 --- UNO DE LOS ELEMENTOS DE LA COLECCIÓN.
     * @param o2 --- OTRO DE LOS ELEMENTOS DE LA COLECCIÓN.
     * @return 0 si son iguales, -1 si o1 es mayor que o2, y viceversa.
     */
    @Override
    public int compare(Elemento o1, Elemento o2) {
        String descripcionA = o1.getDescripcion();
        String descripcionB = o2.getDescripcion();
        return descripcionA.compareTo(descripcionB);
    }
}
