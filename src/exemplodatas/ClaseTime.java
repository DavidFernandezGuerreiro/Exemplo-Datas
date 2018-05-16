
package exemplodatas;

import java.time.*;

/**
 *
 * @author dfernandezguerreiro
 */
public class ClaseTime {
    
    private String nome;
    private LocalDate dataAlta;
    private LocalDate dataBaixa;

    public ClaseTime() {
    }

    public ClaseTime(String nome, LocalDate dataAlta, LocalDate dataBaixa) {
        this.nome=nome;
        this.dataAlta=dataAlta;
        this.dataBaixa=dataBaixa;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public LocalDate getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(LocalDate dataAlta) {
        this.dataAlta=dataAlta;
    }

    public LocalDate getDataBaixa() {
        return dataBaixa;
    }

    public void setDataBaixa(LocalDate dataBaixa) {
        this.dataBaixa=dataBaixa;
    }

    

    @Override
    public String toString() {
        return "Nome: " + nome + ", data de alta: " + dataAlta + ", data de baixa: " + dataBaixa ;
    }
    
    
    
}
