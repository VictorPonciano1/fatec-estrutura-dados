public class No {
    private int info;
    private No proximo;
    public No (int info) {
        this.info = info;
    }
    public No getProximo() {
        return proximo;
    }
    public void setProximo (No proximo) {
        this.proximo = proximo;
    }
    public int getInfo() {
        return info;
    }
    @Override
    public String toString() {
        return "[" + info + "]";
    }
}