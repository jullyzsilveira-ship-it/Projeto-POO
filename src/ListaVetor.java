public class ListaVetor <T> implements Lista <T>{
    private T[] itens;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public ListaVetor(){
        this.itens = (T[]) new Object[10];
        this.tamanho = 0;
    }

    private void validaPosInsercao(int pos){
        if (pos < 0 || pos > this.tamanho)
            throw new IllegalArgumentException("Posição da lista inválida!");
    }

    private void validaPos(int pos){
        if (pos < 0 || pos >= this.tamanho)
            throw new IllegalArgumentException("Posição da lista inválida!");
    }


    @Override
    public void add(T valor, int pos) {
        validaPosInsercao(pos);

        for (int i = this.tamanho; i > pos; i--){
            this.itens[i] = this.itens[i - 1];
        }

        this.itens[pos] = valor;
        this.tamanho ++;
    }

    @Override
    public void add(T valor) {
        add(valor,this.tamanho);
    }

    @Override
    public T get(int pos) {
        validaPos(pos);
        return this.itens[pos];
    }

    @Override
    public T remove(int pos) {
        validaPos(pos);

        T removido = this.itens[pos];

        for (int i = pos; i < this.tamanho -1; i++){
            this.itens[i] = this.itens[i + 1];
        }

        this.tamanho--;
        this.itens[this.tamanho] = new;

        return removido;
    }

    @Override
    public boolean remove(T valor) {

        for (int i = 0; i < this.tamanho; i++){
            if (this.itens[i].equals(valor)){
                remove(i);

                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return this.tamanho;
    }
}
