package poo_contador;

public class Contador {
    int valorAtual = 0;

    int getValorAtual() {
        return valorAtual;
    }

    void incrementar() {
        valorAtual++;
    }

    void definirValor(int n) {
        valorAtual = n;
    }
}
