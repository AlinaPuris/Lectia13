import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List listaLucruriDeFacut = new List();
        ArrayList<String> list = listaLucruriDeFacut.getList();
        System.out.println(list);

          Lista set = new Lista();
          ArrayList<String >lista=set.getLista();
        System.out.println(set.getSetDinLista(lista));


        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("mama", "mother");
        dictionary.put("tata", "father");
        dictionary.put("bunica", "grandmother");
        dictionary.put("bunelul", "grandfather");
        dictionary.put("fiu", "son");
        dictionary.put("fiica", "daughter");
        dictionary.put("casa", "house");
        dictionary.put("pisica", "cat");
        dictionary.put("ciine", "dog");
        dictionary.put("soricel", "mouse");
        for (Map.Entry<String, String> entry: dictionary.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
    }
}
