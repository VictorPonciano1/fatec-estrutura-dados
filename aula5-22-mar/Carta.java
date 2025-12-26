public class Carta {
    private String naipe;
    private String valor;
    
    //CONSTRUTOR
    public Carta(String naipe, String valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    //GETTERS E SETTERS
    public String getNaipe() {
        return naipe;
    }
    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }
    
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carta [naipe=" + naipe + ", valor=" + valor + "]";
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) {
            return true;
        } else {
            Carta c = (Carta) o;
            if (c.naipe.equals(this.naipe) && c.valor.equals(this.valor)) {
                return true;
            } else {
                return false;
            }
        }

    }
}