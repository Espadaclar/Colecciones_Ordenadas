import java.util.TreeSet;

/**
 * LAS COLECCIONES DE TIPO SET ORDENA LOS ELEMENTOS DE LAS COLECCIONES
 * ORDENADAMENTE
 *
 * LOS OBJETOS QUE NO TENGAN IMPLEMENTADA LA INTERFACE ‘COMPARABLE’ NO PUEDEN HACERLO.
 *  para ello tenemos que implementar esta interface a la cl, y reescribir su mt, 'compareTo( Elemento o)'
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
        Elemento a = new Elemento(13, "Primero");
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

        for (Elemento s : names) {
            System.out.println(s.getDescripcion());
        }
    }
}

class Elemento implements Comparable<Elemento> {

    private int id;
    private String descripcion;

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
}
