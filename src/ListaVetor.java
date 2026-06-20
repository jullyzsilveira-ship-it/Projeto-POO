public class ListaVetor <T> implements Lista <T>{
    private T[] itens;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public ListaVetor(){
        this.itens = (T[]) new Object[10];
        this.tamanho = 0;
    }

    private void validaPosInserida(int pos){
        if (pos < 0 || pos > this.tamanho)
            throw new IllegalArgumentException("Posição da lista inválida!");
    }


    @Override
    public void add(T valor, int pos) {
        validaPosInserida(pos);

        for (int i = this.tamanho; i > pos; i--){
            this.itens[i] = this.itens[i - 1];
        }

        this.itens[pos] = valor;
        this.tamanho ++;
    }

    @Override
    public void add(T valor) {

    }

    @Override
    public T get(int pos) {
        return null;
    }

    @Override
    public T remove(int pos) {
        return null;
    }

    @Override
    public boolean remove(T valor) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
