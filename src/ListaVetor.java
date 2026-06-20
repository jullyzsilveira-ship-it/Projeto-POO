public class ListaVetor <T>{
    private T[] itens;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public ListaVetor(){
        this.itens = (T[]) new Object[10];
        this.tamanho = 0;
    }

    private void validaPos(int pos){
        if (pos < 0 || pos > this.tamanho -1)
            throw new IllegalArgumentException("Posição da lista inválida!");
    }
}
