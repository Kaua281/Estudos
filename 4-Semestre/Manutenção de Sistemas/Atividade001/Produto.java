package Atividade001;

public class Produto {
    String material, tomadaDeDecisao;
    int mes1, mes2, mes3, tempoDeReposicao, loteDeReposicao, estoqueAtual, estoqueMinimo, estoqueMaximo, vendaMediaDiaria;

    public Produto(String material, int mes1, int mes2, int mes3, int tempoDeReposicao, int loteDeReposicao, int estoqueAtual) {
        this.material = material;
        this.mes1 = mes1;
        this.mes2 = mes2;
        this.mes3 = mes3;
        this.tempoDeReposicao = tempoDeReposicao;
        this.loteDeReposicao = loteDeReposicao;
        this.estoqueAtual = estoqueAtual;
        this.vendaMediaDiaria = ((mes1 + mes2 + mes3) / 3) / 25;
        this.estoqueMinimo = this.tempoDeReposicao * this.vendaMediaDiaria;
        this.estoqueMaximo = this.loteDeReposicao + this.estoqueMinimo;
        this.tomadaDeDecisao = (estoqueAtual < estoqueMinimo) ? "Comprar" : "Não Comprar";
    }
}
