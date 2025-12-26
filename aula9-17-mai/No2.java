public class No2<T> {
    private T info;
    private No2<T> proximo;

    public No2 (T info) {
        this.info = info;
        this.proximo = null;
    }

    // GETTERS E SETTERS
    public T getInfo() {
        return info;
    }
    public void setInfo(T info) {
        this.info = info;
    }

    public No2<T> getProximo() {
        return proximo;
    }
    public void setProximo(No2<T> proximo) {
        this.proximo = proximo;
    }

    // IMPRESSÃO DOS RESULTADOS
    @Override
    public String toString() {
        return "[" + info + "]" + " ";
    }

}
