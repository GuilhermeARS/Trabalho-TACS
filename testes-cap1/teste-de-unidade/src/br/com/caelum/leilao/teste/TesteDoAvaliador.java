package br.com.caelum.leilao.teste;

import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.servico.Avaliador;
import junit.framework.Assert;

import org.junit.Test;

import br.com.caelum.leilao.dominio.Lance;

public class TesteDoAvaliador {
	
	
	@Test
	public void main() {
		Usuario joao = new Usuario("João");
		Usuario maria = new Usuario("Maria");
		Usuario jose = new Usuario("Jose");
	
	Leilao leilao = new Leilao("Playstation 3 Novo");
	
	leilao.propoe(new Lance(joao, 250.0));
	leilao.propoe(new Lance(jose, 300.0));
	leilao.propoe(new Lance(maria, 400.0));
	
	Avaliador leiloeiro = new Avaliador();
	leiloeiro.avalia(leilao);
	
	double maiorEsperado=400;
	double menorEsperado=250;
	

	Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
	Assert.assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
	
	
	}
}
