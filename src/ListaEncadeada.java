public class ListaEncadeada <T> implements Lista <T>{
    private int tamanho;
    private No inicio;
    private No fim;

    private class No {
        T valor;
        No proximo;

        public No (T valor){
            this.valor = valor;
            this.proximo = null;
        }
    }

    public ListaEncadeada(){
        tamanho = 0;
        inicio = null;
        fim = null;
    }

    private  void validaPos(int pos){
        if (pos < 0 || pos > this.tamanho-1){
            throw new IllegalArgumentException("Posição da lista inválida!");
        }
    }

    private void validaPosInsercao(int pos){
        if (pos < 0 || pos > this.tamanho){
            throw new IllegalArgumentException("Posição da lista inválida!");
        }
    }

    private No getNo(int pos){
        validaPos(pos);

        No atual = this.inicio;
        int cont = 0;


        while (atual != null && cont != pos) {
            cont++;
            atual = atual.proximo;
        }
        return atual;
    }

    @Override
    public void add(T valor, int pos) {

        validaPosInsercao(pos);

        No novoNo = new No(valor);

        if (this.tamanho == 0){

            this.inicio = novoNo;
            this.fim = novoNo;
        }
        else if (pos == 0){

            novoNo.proximo = this.inicio;
            this.inicio = novoNo;
        }
        else if (pos == this.tamanho){

            this.fim.proximo = novoNo;
            this.fim = novoNo;
        }
        else {

            No anterior = this.getNo(pos -1);
            novoNo.proximo = anterior.proximo;
            anterior.proximo = novoNo;
        }
        this.tamanho++;
    }

    @Override
    public void add(T valor) {

        No novoNo = new No(valor);

        if (this.inicio == null){
            this.inicio = novoNo;
        } else {
            this.fim.proximo = novoNo;
        }

        this.fim = novoNo;
        this.tamanho++;
    }

    @Override
    public T get(int pos) {
        return this.getNo(pos).valor;
    }

    @Override
    public T remove(int pos) {

        validaPos(pos);

        T retorno;

        if (pos == 0){

            retorno = this.inicio.valor;
            this.inicio = this.inicio.proximo;

            if (this.tamanho == 1){
                this.fim = null;
            }

        }
        else if (pos == this.tamanho -1){
            No penultimo = this.getNo(this.tamanho -2);

            retorno = this.fim.valor;

            this.fim = penultimo;
            penultimo.proximo = null;
        }

        else {
            No anterior = this.getNo(pos -1);

            retorno = anterior.proximo.valor;
            anterior.proximo = anterior.proximo.proximo;
        }
        this.tamanho --;

        return retorno;
    }

    @Override
    public boolean remove(T valor) {

        for (int i = 0; i < this.tamanho; i++){
            if (this.get(i).equals(valor)){

                this.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        String aux = "";

        for (int i = 0; i < this.tamanho; i++){
            aux += this.get(i);

            if (i != this.tamanho -1){
                aux +=", ";
            }
        }
        return aux;
    }

    @Override
    public void imprime() {
        System.out.println(this);
    }

    @Override
    public int size() {
        return this.tamanho;
    }

}
