package br.com.caelum.eatspagamento;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class PagamentoDto {

	private Long id;
	private BigDecimal valor;
	private String nome;
	private String numero;
	private String expiracao;
	private String codigo;
	private Pagamento.Status status;
//	private FormaDePagamento formaDePagamento;
	private Long formaDePagamentoId;
//	private PedidoDto pedido;
	private Long pedidoId;

	public PagamentoDto(Pagamento p) {
		this(p.getId(), p.getValor(), p.getNome(), p.getNumero(), p.getExpiracao(), p.getCodigo(), p.getStatus(),
				p.getFormaDePagamentoId(), p.getPedidoId());
	}

}
