package desafio_cofre;

import java.util.Date;

public class Analise {
	
	public Date data;
    public String descricao;

    public Analise(Date data, String descricao) {
      this.data = data;
      this.descricao = descricao;
    }

	@Override
	public String toString() {
		return "Analise [data=" + data + ", descricao=" + descricao + "]";
	}
    
    
}
