
public class Main {
    public static void main(String[] args) {

        Lista<String> lista = new ListaEncadeada<>();

        lista.add("Luffy");
        lista.add("Bartolomeo");
        lista.add("Zoro");
        lista.add("Franky");
        lista.add("Law");
        System.out.println("\n------TESTE DA LISTA ENCADEADA -------");
        System.out.println("Lista após as inserções: ");
        lista.imprime();

        lista.add("Robin",2);

        System.out.println("\nApós inserir o Robin na posição 2.");
        lista.imprime();

        System.out.println("\nElemento da posição 3.");
        System.out.println(lista.get(3));

        String removido = lista.remove(4);

        System.out.println("\nRemovido da posição 4: " + removido);
        lista.imprime();

        boolean removeu = lista.remove("Zoro");

        System.out.println("\nRemoveu Zoro? " + removeu);
        lista.imprime();

        System.out.println("\nMaior elemento: "
                + ListaUtil.max(lista));

        System.out.println("Menor elemento: "
                + ListaUtil.min(lista));

        System.out.println("Quantidade de 'Luffy': "
                + ListaUtil.count(lista,"Luffy"));

        System.out.println("\nTamanho da lista: "
                + lista.size());


        System.out.println("\n------TESTE DA LISTA VETOR -------");
        Lista<Integer> listaNum = new ListaVetor<>();

        listaNum.add(10);
        listaNum.add(20);
        listaNum.add(30);
        listaNum.add(40);
        listaNum.add(50);

        System.out.println("Lista após as inserções: ");
        listaNum.imprime();

        listaNum.add(25,2);

        System.out.println("\nApós inserir 25 na posição 2: ");
        listaNum.imprime();

        System.out.println("\nElemento da posição 3: ");
        System.out.println(listaNum.get(3));

        Integer removido1 = listaNum.remove(4);

        System.out.println("\nRemoveu o número 4? " + removido1);

        listaNum.imprime();

        boolean removeuNum = listaNum.remove(Integer.valueOf(30));

        System.out.println("\nRemoveu o número 30? " + removeuNum);


        listaNum.imprime();

        System.out.println("\nMaior elemento: "
                + ListaUtil.max(listaNum));

        System.out.println("Menor elemento: "
                + ListaUtil.min(listaNum));

        System.out.println("Qunatidade de 20: "
        + ListaUtil.count(listaNum,20));

        System.out.println("\nTamanho da Lista: "
                + listaNum.size());
    }
}