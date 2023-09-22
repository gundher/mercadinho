package servicos;

public abstract class AbstractService implements IBandeiraCartao {
	private Integer setor=null;

	

	
	
	public AbstractService(Integer setor) {
		this.setor = setor;
	}


	
	
	public Integer getSetor() {
		return setor;
	}

	public void setSetor(Integer setor) {
		this.setor = setor;
	}
	

}
