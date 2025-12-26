public class Carro {
    private String placa;
    private int manobras;

    public Carro(String placa) {
        this.placa = placa;
        this.manobras = 0;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getManobras() {
        return manobras;
    }

    public void setManobras(int manobras) {
        this.manobras = manobras;
    }
}
