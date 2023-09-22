package entidade;

public class Gerente extends Funcionario {
private Double comissao=null;

public Gerente() {

} 



public Gerente(String nome, Double salario, Double desconto, Double comissao) {
	super(nome, salario, desconto);
	this.comissao = comissao;
}


@Override
public double calcularSalario() {

	return ((getSalario()-getDesconto())+comissao);
}

@Override
public String Formatado() {

	return "Nome: "+getNome()+"Salário Base: "+getSalario()+"Salário Fina: "+calcularSalario();
}

@Override
public void verificacao() {

	
}


}
