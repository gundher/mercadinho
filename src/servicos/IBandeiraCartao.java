package servicos;

import erro.Personalizado;

public interface IBandeiraCartao {
	String verificarBandeira();
	
	
	
	default String senha(int senha) throws Personalizado {
		if (senha==123) {
			return "Senha v�lida";
		}else {
			throw new Personalizado("Senha Inv�lida");
		}
		
		
	}
	
	

}
