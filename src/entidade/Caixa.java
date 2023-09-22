package entidade;

public class Caixa extends Funcionario {
	private Integer caixa=null;
	
	
	public Caixa() {
		
	}

	
	

	public Caixa(String nome, Double salario, Double desconto, Integer caixa) {
		super(nome, salario, desconto);
		this.caixa = caixa;
	}




	public Integer getCaixa() {
		return caixa;
	}

	public void setCaixa(Integer caixa) {
		this.caixa = caixa;
	}




	@Override
	public double calcularSalario() {

		return getSalario()-getDesconto();
	}




	@Override
	public String Formatado() {

		return "Nome: "+getNome()+"Guichê: "+getCaixa()+"Salário Base: "+getSalario()+"Salário Final: "+calcularSalario();
	}




	@Override
	public void verificacao() {
		
	}
	
}
