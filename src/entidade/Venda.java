package entidade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enumerados.Pago;
import enumerados.StatusVenda;
import enumerados.TipodePagamento;

public class Venda {
public List<ItenVenda> item = new ArrayList<>();
private Cliente cliente=null;
private Pago pago=null;
private StatusVenda status=null;
private TipodePagamento tipodePagamento=null;
private Date now = new Date();
private Integer number=null;
private Integer parcelas=null;
private Double desconto=null;

}
