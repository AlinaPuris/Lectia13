import java.util.ArrayList;
import java.util.HashSet;

public class Lista {
    public ArrayList<String> getLista() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ma scol");
        lista.add("Maninc");
        lista.add("Ma culc");
        lista.add("Maninc");
        return lista;
         }

        public HashSet<String> getSetDinLista (ArrayList < String > lista) {
            HashSet<String> setdinlista = new HashSet<>();
           // System.out.println(setdinlista);

            for (String elemente : lista) {
                setdinlista.add(elemente);
            }
            return setdinlista;

        }
    }