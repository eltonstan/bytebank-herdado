package br.com.bytebank.banco.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteComparacaoString {

	public static void main(String[] args) {
		
		List<Conta> lista = new ArrayList<Conta>();
		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);
		lista.add(cc1);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);
		lista.add(cc3);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);
		lista.add(cc4);
		
		lista.sort(new TitularDaContaComparator()); //j� deixando mais enxuto
		
		for (Conta conta : lista) {
		    System.out.println(conta + ", " + conta.getTitular().getNome());
		}
		
		Collections.sort(lista, new TitularDaContaComparator());
		
		for (Conta conta : lista) {
		    System.out.println(conta + ", " + conta.getTitular().getNome());
		}
		
		Collections.sort(lista);
		
		for (Conta conta : lista) {
		    System.out.println(conta + ", " + conta.getSaldo());
		}
		
		lista.sort(null);
		for (Conta conta : lista) {
		    System.out.println(conta + ", " + conta.getSaldo());
		}

	}

}

class TitularDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {
        String nomeC1 = c1.getTitular().getNome();
        String nomeC2 = c2.getTitular().getNome();
        return nomeC1.compareTo(nomeC2);
    }
}

