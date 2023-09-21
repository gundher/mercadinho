package entidade;

import java.util.ArrayList;
import java.util.List;

import enumerados.Pago;
import enumerados.StatusVenda;
import enumerados.TipodePagamento;

public class Venda {
public List<ItenVenda> item = new ArrayList<>();
private Cliente cliente;
private Pago pago;
private StatusVenda status;
private TipodePagamento tipodePagamento;
}
