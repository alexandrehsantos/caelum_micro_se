package br.com.caelum.eats.pagamento;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient("monolito")
public interface PedidoClient {
	
	@PutMapping("/pedidos/{id}/pago")
	void confirmacaoDePagamento(@PathVariable("id") Long id);
}
