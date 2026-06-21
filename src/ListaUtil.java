public class ListaUtil {

    public static int count (Lista<?> lista, Object valor){
    int contador = 0;

    for (int i = 0; i < lista.size(); i++){
        if (lista.get(i).equals(valor)){
            contador++;
        }
    }
    return contador;
    }

    private static void validaListaVazia(Lista<?> lista){
        if (lista.size() == 0){
            throw new IllegalArgumentException("Lista vazia!");
        }
    }

    public static <T extends Comparable<T>>T max (Lista <T> lista){

        validaListaVazia(lista);

        T maior = lista.get(0);

        for (int i = 1; i < lista.size(); i++){
            if (lista.get(i).compareTo(maior)> 0){
                maior = lista.get(i);
            }
        }
        return maior;
    }

    public static <T extends Comparable<T>> T min (Lista<T> lista){

        validaListaVazia(lista);

        T menor = lista.get(0);

        for (int i = 1; i < lista.size(); i++){
            if (lista.get(i).compareTo(menor) < 0){
                menor = lista.get(i);
            }
        }
        return menor;
    }
}
