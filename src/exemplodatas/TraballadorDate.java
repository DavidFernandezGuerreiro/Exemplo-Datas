
package exemplodatas;

import java.util.Date;

/**
 *
 * @author dfernandezguerreiro
 */

/*  1.-Como metemos a data de alta e visualizarla
    2.-Tempo entre as duas datas.
    3.-Anos de antigüedade ata hoxe.
*/
public class TraballadorDate {
    
    private String nome;
    private Date dataAlta;
    private Date dataBaixa;

    public TraballadorDate() {
    }

    public TraballadorDate(String nome, Date dataAlta, Date dataBaixa) {
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

    public Date getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(Date dataAlta) {
        this.dataAlta=dataAlta;
    }

    public Date getDataBaixa() {
        return dataBaixa;
    }

    public void setDataBaixa(Date dataBaixa) {
        this.dataBaixa=dataBaixa;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", data de alta: " + dataAlta + ", data de baixa: " + dataBaixa ;
    } 
    
    
    
}
