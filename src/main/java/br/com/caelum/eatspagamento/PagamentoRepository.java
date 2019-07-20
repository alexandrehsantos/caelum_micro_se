package br.com.caelum.eatspagamento;

import org.springframework.data.jpa.repository.JpaRepository;

interface PagamentoRepository extends JpaRepository<Pagamento, Long> {

}
