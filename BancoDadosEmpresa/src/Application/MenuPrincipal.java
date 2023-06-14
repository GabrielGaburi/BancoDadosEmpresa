package Application;

import java.util.ArrayList;

import DadosCadastrais.Cliente;
import DadosCadastrais.Fornecedor;
import DadosCadastrais.Funcionario;
import Interface.Interface1;
import ReceberPagar.Pagar;
import ReceberPagar.Receber;
import Variavel.Endereco;
import Variavel2.Telefone;


public class MenuPrincipal implements Interface1 {

	ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
	ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
	ArrayList<Fornecedor> listaFornecedor = new ArrayList<Fornecedor>();
	ArrayList<Receber> listaReceber = new ArrayList<Receber>();
	ArrayList<Pagar> listaPagar = new ArrayList<Pagar>();

	Cliente cliente = new Cliente();
	Fornecedor fornecedor = new Fornecedor();
	Funcionario funcionario = new Funcionario();
	Receber receber = new Receber();
	Pagar pagar = new Pagar();

	int num;
	char opcao;
	double valorTotal = 0;
	double valorTotal1 = 0;
	String vencimento;
	double receber1 = 0;
	double pagar1 = 0;
	int quant = 10;
	int idCodigo;
	String nomeCodigo = " ";
	double valorReceber;
	double valorPagar;

	public void fakerFuncionario(int quant) {

		for (int i = 1; i <= quant; i++) {

			Funcionario funcionario = new Funcionario();
			Endereco endereco = new Endereco();
			Telefone telefone = new Telefone();
			
			endereco.setLogradouro("Rua das Pitangas " + i);
			endereco.setNumero("66-"+i);
			endereco.setComplemento("Casa" +i);
			endereco.setBairro("Lola "+i);
			endereco.setCidade("Cidade das Malvinas"+i);
			endereco.setEstado("RS");
			endereco.setCep("17123-112"+i);
			
			
			
			telefone.setDdd(i);
			telefone.setNumero(891829812);
			
			funcionario.setId(i);
			funcionario.setNome("a" + i);
			funcionario.setEndereco(endereco);
			funcionario.setTelefone(telefone);
			
			funcionario.setEmail("UNIP" + i + "@gmail.com");
			funcionario.setCpf("666.666.666-0" + i);
			funcionario.setRg("66.666.666-8" + i);
			funcionario.setEmissor("Unip" + i);
			funcionario.setDataAdmissao("30/02/200" + i);
			funcionario.setDataDemissao("31/02/201" + i);
			funcionario.setCpts("Não sei " + i);
			funcionario.setSalario(1800 + i);

			listaFuncionario.add(funcionario);

		}
	}

	public void consultarFuncionarioCpf(int quant) {
		boolean encontrado = false;

		System.out.println("Digíte o CPF:");
		nomeCodigo = leia.next();

		for (Funcionario funcionario : listaFuncionario) {

			if (funcionario.getCpf().equals(nomeCodigo)) {

				funcionario.imprimir();
				encontrado = true;
			}

		}

		if (!encontrado) {
			System.out.println("Funcionário CPF: = " + nomeCodigo + " Não Encontrado !!!");
		}

	}

	public void consultarFuncionarioPosicao(int quant) {
		boolean encontrado = false;
		try {
			System.out.println("Digíte a posição na lista:");
			idCodigo = leia.nextInt();

			for (Funcionario funcionario : listaFuncionario) {

				if (funcionario.getId() == this.idCodigo) {
					funcionario.imprimir();
					encontrado = true;
				}
			}

			if (!encontrado) {
				System.out.println("Funcionário ID= " + idCodigo + " Não Encontrado !!!");
			}
		} catch (Exception ex) {
			System.err.println("ERRO - Valor digitado não é um número inteiro");
		}
	}

	public void consultarFuncionarioNome(int quant) {

		boolean encontrado = false;
		System.out.println("Digíte o nome:");
		nomeCodigo = leia.next();

		for (Funcionario funcionario : listaFuncionario) {
			if (funcionario.getNome().equals(nomeCodigo)) {
				funcionario.imprimir();
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("Funcionário Nome " + nomeCodigo + " Não Encontrado !!!");
		}

	}

	public void alterarFuncionario(int quant) {

		boolean encontrado = false;
		try {
			System.out.println("Digíte o id:");
			idCodigo = leia.nextInt();
		} catch (Exception ex) {
			System.err.println("ERRO - Valor digitado não é um número inteiro");
		}
		for (Funcionario funcionario : listaFuncionario) {
			if (funcionario.getId() == this.idCodigo) {
				funcionario.entrar();
				encontrado = true;

				System.out.println("Alteração concluida com sucesso");
			}
		}
		if (!encontrado) {
			System.out.println("Funcionário ID= " + idCodigo + " Não Encontrado !!!");
		}

	}

	public void removerTodosFuncionarios() {

		listaFuncionario.removeAll(listaFuncionario);
		System.out.println("Todos os itens da lista foram removidos");
	}

	public void fakerFornecedor(int quant) {

		for (int i = 1; i <= quant; i++) {

			Fornecedor fornecedor = new Fornecedor();
			Endereco endereco = new Endereco();
			Telefone telefone = new Telefone();
			
			endereco.setLogradouro("Rua das Palmeiras " + i);
			endereco.setNumero("66-"+i);
			endereco.setComplemento("Casa" +i);
			endereco.setBairro("PalmeirasLandia"+i);
			endereco.setCidade("Palmeiras"+i);
			endereco.setEstado("SP");
			endereco.setCep("17123-112"+i);
			
			
			
			telefone.setDdd(i);
			telefone.setNumero(891829812);
			
			fornecedor.setId(i);
			fornecedor.setNome("Abel" + i);
			fornecedor.setEndereco(endereco);
			fornecedor.setTelefone(telefone);
			fornecedor.setEmail("ferreira" + i + "@gmail.com");
			fornecedor.setCnpj("666.666.666-2" + i);
			fornecedor.setInscricaoEstadual("Não tem " + i + " :c");
			fornecedor.setContato("Allianz Parque");
			fornecedor.setDataCadastro("30/02/180" + i);
			fornecedor.setSite("palmeiras@palmmeirasmeupalmeiras.com " + i);

			listaFornecedor.add(fornecedor);
		}
	}

	public void consultarFornecedorId(int quant) {
		boolean encontrado = false;
		try {
			System.out.println("Digíte o id:");
			idCodigo = leia.nextInt();

			for (Fornecedor fornecedor : listaFornecedor) {

				if (fornecedor.getId() == this.idCodigo) {
					fornecedor.imprimir();
					encontrado = true;
				}
			}
			if (!encontrado) {
				System.out.println("Fornecedor ID= " + idCodigo + " Não Encontrado !!!");
			}
		} catch (Exception ex) {
			System.err.println("ERRO - Valor digitado não é um número inteiro");
		}

	}

	public void consultarFornecedorPosicao() {
		boolean encontrado = false;
		try {
			System.out.println("Digíte a posição na lista:");
			idCodigo = leia.nextInt();
			for (Fornecedor fornecedor : listaFornecedor) {
				if (fornecedor.getId() == this.idCodigo) {
					fornecedor.imprimir();
					encontrado = true;
				}
			}
			if (!encontrado) {
				System.out.println("Fornecedor Posição= " + idCodigo + " Não Encontrado !!!");
			}

		} catch (Exception ex) {
			System.err.println("ERRO - Valor digitado não é um número inteiro");
		}

	}

	public void consultarFornecedorCnpj() {
		boolean encontrado = false;
		System.out.println("Digíte o CNPJ:");
		nomeCodigo = leia.next();
		for (Fornecedor fornecedor : listaFornecedor) {
			if (fornecedor.getCnpj().equals(nomeCodigo)) {
				fornecedor.imprimir();
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println("Fornecedor CNPJ= " + nomeCodigo + " Não Encontrado !!!");
		}

	}

	public void alterarFornecedor() {
		boolean encontrado = false;
		try {
			System.out.println("Digíte o id:");
			idCodigo = leia.nextInt();
			for (Fornecedor fornecedor : listaFornecedor) {
				if (fornecedor.getId() == this.idCodigo) {
					fornecedor.entrar();
				}
			}
			if (!encontrado) {
				System.out.println("Fornecedor ID= " + idCodigo + " Não Encontrado !!!");
			}

		} catch (Exception ex) {
			System.err.println("ERRO - Valor digitado não é um número inteiro");
		}
	}

	public void removerTodosFornecedores() {

		listaFornecedor.removeAll(listaFornecedor);
		System.out.println("Todos os itens da lista foram removidos");

	}

	public void fakerCliente(int quant) {

		for (int i = 1; i <= quant; i++) {

			Cliente cliente = new Cliente();
			Endereco endereco = new Endereco();
			Telefone telefone = new Telefone();
			
			endereco.setLogradouro("Rua dos Lirios " + i);
			endereco.setNumero("66-"+i);
			endereco.setComplemento("Casa" +i);
			endereco.setBairro("Santa Angelina "+i);
			endereco.setCidade("Agudos"+i);
			endereco.setEstado("SP");
			endereco.setCep("17123-112"+i);
			
			
			
			telefone.setDdd(i);
			telefone.setNumero(891829812);
			

			cliente.setId(i);
			cliente.setNome("b" + i);
			cliente.setEndereco(endereco);
			cliente.setTelefone(telefone);
			cliente.setEmail("UNIP_2023" + i + "@gmail.com");
			cliente.setCpf("666.666.666-1" + i);
			cliente.setRg("66.666.666-6" + i);
			cliente.setEmissor("UNip" + i);
			cliente.setLimiteCredito(666666.0 + i);

			listaCliente.add(cliente);

		}
	}

	public void consultarClienteId() {
		boolean encontrado = false;
		try {
			System.out.println("Digíte o id:");
			idCodigo = leia.nextInt();
			for (Cliente cliente : listaCliente) {

				if (cliente.getId() == this.idCodigo) {
					cliente.imprimir();
					encontrado = true;
				}
			}
			if (!encontrado) {
				System.out.println("Cliente ID= " + idCodigo + " Não Encontrado !!!");
			}

		} catch (Exception ex) {
			System.err.println("ERRO - Valor digitado não é um número inteiro");
		}
	}

	public void consultarClientePosicao() {
		boolean encontrado = false;
		try {
			System.out.println("Digíte a posição na lista:");
			idCodigo = leia.nextInt();
			for (Cliente cliente : listaCliente) {
				if (cliente.getId() == this.idCodigo) {
					cliente.imprimir();
					encontrado = true;
				}
			}

			if (!encontrado) {
				System.out.println("Cliente ID= " + idCodigo + " Não Encontrado !!!");
			}

		} catch (Exception ex) {
			System.err.println("ERRO - Valor digitado não é um número inteiro");
		}

	}

	public void consultarClienteNome() {
		boolean encontrado = false;
		System.out.println("Digíte o nome:");
		nomeCodigo = leia.next();
		for (Cliente cliente : listaCliente) {
			if (cliente.getNome().equals(nomeCodigo)) {
				cliente.imprimir();
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("Cliente Nome= " + nomeCodigo + " Não Encontrado !!!");
		}

	}

	public void alterarCliente() {
		boolean encontrado = false;
		try {
			System.out.println("Digíte o id:");
			idCodigo = leia.nextInt();

			for (Cliente cliente : listaCliente) {
				if (cliente.getId() == this.idCodigo) {
					cliente.entrar();
					encontrado = true;
				}
			}

			if (!encontrado) {
				System.out.println("Cliente ID= " + idCodigo + " Não Encontrado !!!");
			}

		} catch (Exception ex) {
			System.err.println("ERRO - Valor digitado não é um número inteiro");
		}
	}

	public void removerCliente() {
		listaCliente.removeAll(listaCliente);
		System.out.println("Todos os itens da lista foram removidos");
	}

	public void fakerReceber(int quant) {

		for (int i = 1; i <= quant; i++) {

			Receber receber = new Receber();

			receber.setId(i);
			receber.setNumero(0 + i);
			receber.setEmissao("10/01/200" + i);
			receber.setVencimento("10/05/200" + i);
			receber.setPagamento("10/04/200" + i);
			receber.setValor(2000 + i);
			receber.setJuros(500 + i);
			receber.setMulta(300 + i);
			receber.setDesconto(700 + i);
			receber.setNotaFiscal("56465435143514351" + i);

			listaReceber.add(receber);

		}
	}

	public void consultarReceberValor() {
		boolean encontrado = false;
		try {
			System.out.println("Digíte o valor:");
			double idValor = leia.nextDouble();

			for (Receber receber : listaReceber) {

				if (receber.getValor() == idValor) {
					receber.imprimir();
					encontrado = true;
				}
			}
			if (!encontrado) {
				System.out.println("Receber Valor= " + idValor + " Não Encontrado !!!");
			}
		} catch (Exception ex) {
			System.err.println("ERRO - Valor digitado não é um número");
		}

	}

	public void consultarReceberNome() {
		boolean encontrado = false;
		System.out.println("Digíte o nome:");
		nomeCodigo = leia.next();

		for (Cliente cliente : listaCliente) {

			if (cliente.getNome().equals(nomeCodigo)) {
				receber.imprimir();
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println("Cliente Nome= " + nomeCodigo + " Não Encontrado !!!");
		}

	}

	public void consultarReceberNumero() {
		boolean encontrado = false;
		try {
			System.out.println("Digíte o número da nota:");
			idCodigo = leia.nextInt();
			for (Receber receber : listaReceber) {
				if (receber.getNumero() == idCodigo) {
					receber.imprimir();
					encontrado = true;
				}
			}
			if (!encontrado) {
				System.out.println("Receber Numero= " + idCodigo + " Não Encontrado !!!");
			}
		} catch (Exception ex) {
			System.err.println("ERRO - Valor digitado não é um número inteiro");
		}

	}

	public void consultarReceberNota() {
		boolean encontrado = false;
		try {
			System.out.println("Digíte o nome:");
			nomeCodigo = leia.next();
			for (Receber receber : listaReceber) {

				if (receber.getNotaFiscal().equals(nomeCodigo)) {
					receber.imprimir();
					encontrado = true;
				}
			}
			if (!encontrado) {
				System.out.println("Receber Nota Fiscal= " + nomeCodigo + " Não Encontrado !!!");
			}

		} catch (Exception ex) {
			System.err.println("ERRO - Valor digitado não é um número inteiro");
		}
	}

	public void alterarReceber() {
		boolean encontrado = false;
		try {
			System.out.println("Digíte o id:");
			idCodigo = leia.nextInt();

			for (Receber receber : listaReceber) {
				if (receber.getId() == this.idCodigo) {
					receber.entrar();
					encontrado = true;
				}
			}
			if (!encontrado) {
				System.out.println("Receber ID= " + idCodigo + " Não Encontrado !!!");
			}
		} catch (Exception ex) {
			System.err.println("ERRO - Valor digitado não é um número inteiro");
		}

	}

	public void removerReceber() {

		listaReceber.removeAll(listaReceber);
		System.out.println("Todos os itens da lista foram removidos");
	}

	public void fakerPagar(int quant) {
		for (int i = 1; i <= quant; i++) {

			Pagar pagar = new Pagar();

			pagar.setId(i);
			pagar.setNumero(0 + i);
			pagar.setEmissao("10/01/200" + i);
			pagar.setVencimento("10/05/200" + i);
			pagar.setPagamento("10/04/200" + i);
			pagar.setValor(1500 + i);
			pagar.setJuros(300 + i);
			pagar.setMulta(200 + i);
			pagar.setDesconto(700 + i);
			pagar.setBoleto("56465435143514351" + i);

			listaPagar.add(pagar);

		}
	}

	public void consultarPagarValor() {
		boolean encontrado = false;
		try {
			System.out.println("Digíte o valor:");
			double idValor = leia.nextDouble();

			for (Pagar pagar : listaPagar) {

				if (pagar.getValor() == idValor) {
					pagar.imprimir();
					encontrado = true;
				}
			}
			if (!encontrado) {
				System.out.println("Pagar Valor= " + idValor + " Não Encontrado !!!");
			}

		} catch (Exception ex) {
			System.err.println("ERRO - Valor digitado não é um número");
		}
	}

	public void consultarPagarCnpj() {
		boolean encontrado = false;
		try {
			System.out.println("Digíte o CNPJ:");
			nomeCodigo = leia.next();
			for (Fornecedor fornecedor : listaFornecedor) {
				if (fornecedor.getCnpj().equals(nomeCodigo)) {
					pagar.imprimir();
					encontrado = true;
				}
			}
			if (!encontrado) {
				System.out.println("Pagar CNPJ= " + nomeCodigo + " Não Encontrado !!!");
			}
		} catch (Exception ex) {
			System.err.println("ERRO - Valor digitado não é um número inteiro");
		}
	}

	public void consultarPagarNumero() {
		boolean encontrado = false;
		System.out.println("Digíte o número:");
		nomeCodigo = leia.next();

		for (Pagar pagar : listaPagar) {
			if (idCodigo == pagar.getNumero()) {
				pagar.imprimir();
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("Pagar Número= " + idCodigo + " Não Encontrado !!!");
		}

	}

	public void consultarPagarBoleto() {
		boolean encontrado = false;
		System.out.println("Digíte o nome:");
		nomeCodigo = leia.next();
		for (Pagar pagar : listaPagar) {
			if (pagar.getBoleto().equals(nomeCodigo)) {
				pagar.imprimir();
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("Pagar Boleto= " + nomeCodigo + " Não Encontrado !!!");
		}

	}

	public void alterarPagar() {
		boolean encontrado = false;
		try {
			System.out.println("Digíte o id:");
			idCodigo = leia.nextInt();
			for (Pagar pagar : listaPagar) {
				if (pagar.getId() == this.idCodigo) {
					pagar.entrar();
					listaPagar.add(pagar);
					encontrado = true;
				}
			}
			if (!encontrado) {
				System.out.println("Pagar ID= " + idCodigo + " Não Encontrado !!!");
			}
		} catch (Exception ex) {
			System.err.println("ERRO - Valor digitado não é um número inteiro");
		}

	}

	public void removerPagar() {
		listaPagar.removeAll(listaPagar);
		System.out.println("Todos os itens da lista foram removidos");
	}

	public void contas() {
		
			System.out.println("Digíte a posição que você quer vericar:");
			int idReceber = leia.nextInt();
			
		
			int idPagar = idReceber;
		
			for (Receber receber : listaReceber) {
				if (receber.getId() == idReceber) {
					valorReceber = receber.getValor() + receber.getJuros() - receber.getMulta();

				}

			}

			for (Pagar pagar : listaPagar) {
				if (pagar.getId() == idPagar) {
					valorPagar = pagar.getValor() + pagar.getJuros() - pagar.getMulta();

				}

			}

			System.out.println("Fluxo de Caixa: " + String.format("%.2f", valorReceber - valorPagar));
		
		
	}

	public void Menu() {
		
		
		
			System.out.println("Digite para escolher entre as opcões: ");
			System.out.println("1 - Funcionários.......: " + listaFuncionario.size());
			System.out.println("2 - Clientes...........: " + listaCliente.size());
			System.out.println("3 - Fornecedores.......: " + listaFornecedor.size());
			System.out.println("4 - Contas a Receber...: " + listaReceber.size());
			System.out.println("5 - Contas a pagar.....: " + listaPagar.size());
			System.out.println("6 - Fluxo de caixa.....: ");
			System.out.println("7 - Sair...............:");
			
				
			num = leia.nextInt();
			
			
			
			do {

				if (num == 1) {

					System.out.println("Você esta na opção Funcionários: ");
					System.out.println("Digite para escolher entre as opcões: ");
					System.out.println("a - Incluir...............................:");
					System.out.println("b - Alterar pelo ID.......................:");
					System.out.println("c - Consultar pelo CPF....................:");
					System.out.println("d - Consultar pela posição da lista.......:");
					System.out.println("e - Consultar pelo Nome...................:");
					System.out.println("f - Excluir...............................:");
					System.out.println("g - Voltar................................:");

					opcao = leia.next().charAt(0);

					if (opcao == 'a') {

						fakerFuncionario(this.quant);
						System.out.println("Você incluiu itens na lista:");
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

					} else if (opcao == 'b') {

						alterarFuncionario(quant);
						System.out.println("Você alterou itens na lista:");
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

					}

					else if (opcao == 'c') {

						consultarFuncionarioCpf(quant);
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

					} else if (opcao == 'd') {
						consultarFuncionarioPosicao(quant);
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

					} else if (opcao == 'e') {
						consultarFuncionarioNome(quant);
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

					} else if (opcao == 'f') {
						removerTodosFuncionarios();
						System.out.println("Você removeu itens na lista:");
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

					} else if (opcao == 'g') {
						Menu();
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

					}

				}

				else if (num == 2) {
					System.out.println("Você esta na opção Cliente:");
					System.out.println("Digite para escolher entre as opcões: ");
					System.out.println("Digite para escolher entre as opcões: ");
					System.out.println("a - Incluir...............................:");
					System.out.println("b - Alterar pelo ID.......................:");
					System.out.println("c - Consultar pelo ID.................... :");
					System.out.println("d - Consultar pela posição da lista.......:");
					System.out.println("e - Consultar pelo Nome...................:");
					System.out.println("f - Excluir...............................:");
					System.out.println("g - Voltar................................:");

					opcao = leia.next().charAt(0);

					if (opcao == 'a') {

						fakerCliente(this.quant);
						System.out.println("Você incluiu itens da lista:");
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

					} else if (opcao == 'b') {
						alterarCliente();
						System.out.println("Você alterou itens da lista: ");
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					}

					else if (opcao == 'c') {

						consultarClienteId();
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

					} else if (opcao == 'd') {
						consultarClientePosicao();
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					} else if (opcao == 'e') {
						consultarClienteNome();
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					} else if (opcao == 'f') {
						removerCliente();
						System.out.println("Você removei itens na lista:");
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					} else if (opcao == 'g') {
						Menu();
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					}

				}

				else if (num == 3) {

					System.out.println("Você esta na opção Fornecedor:");
					System.out.println("Digite para escolher entre as opcões: ");
					System.out.println("a - Incluir...............................:");
					System.out.println("b - Alterar pelo ID.......................:");
					System.out.println("c - Consultar pelo ID.................... :");
					System.out.println("d - Consultar pela posição da lista.......:");
					System.out.println("e - Consultar pelo Nome...................:");
					System.out.println("f - Excluir...............................:");
					System.out.println("g - Voltar................................:");

					opcao = leia.next().charAt(0);

					if (opcao == 'a') {

						fakerFornecedor(this.quant);
						System.out.println("Você incluiu itens na lista:");
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

					} else if (opcao == 'b') {
						alterarFornecedor();
						System.out.println("Você alterou itens na lista:");
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

					}

					else if (opcao == 'c') {

						consultarFornecedorId(quant);
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

					} else if (opcao == 'd') {
						consultarFornecedorPosicao();
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

					} else if (opcao == 'e') {
						consultarFornecedorCnpj();
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

					} else if (opcao == 'f') {
						removerTodosFornecedores();
						System.out.println("Você removeu itens na lista:");
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					} else if (opcao == 'g') {
						Menu();
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					}
				}

				else if (num == 4) {

					System.out.println("Você esta na opção Receber:");
					System.out.println("Digite para escolher entre as opcões: ");
					System.out.println("a - Incluir...............................:");
					System.out.println("b - Alterar pelo ID.......................:");
					System.out.println("c - Consultar pelo Nome do Cliente........:");
					System.out.println("d - Consultar pelo Número.................:");
					System.out.println("e - Consultar pelo Valor..................:");
					System.out.println("f - Consultar pela Nota Fiscal............:");
					System.out.println("g - Excluir...............................:");
					System.out.println("h - Voltar................................:");

					opcao = leia.next().charAt(0);

					if (opcao == 'a') {

						fakerReceber(this.quant);
						System.out.println("Você incluiu itens na lista:");
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

					} else if (opcao == 'b') {
						alterarReceber();
						System.out.println("Você alterou itens na lista: ");
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					}

					else if (opcao == 'c') {

						consultarReceberNome();
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					} else if (opcao == 'd') {

						consultarReceberNumero();
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					} else if (opcao == 'e') {

						consultarReceberValor();
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					} else if (opcao == 'f') {

						consultarReceberNota();
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					} else if (opcao == 'g') {

						removerReceber();
						System.out.println("Você removeu itens na lista:");
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					} else if (opcao == 'h') {
						Menu();
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					}

				}

				else if (num == 5) {

					System.out.println("Você esta na opção Pagar:");
					System.out.println("Digite para escolher entre as opcões: ");
					System.out.println("a - Incluir...............................:");
					System.out.println("b - Alterar pelo ID.......................:");
					System.out.println("c - Consultar pelo CNPJ...................:");
					System.out.println("d - Consultar pelo Número.................:");
					System.out.println("e - Consultar pelo Valor..................:");
					System.out.println("f - Consultar pelo Boleto.................:");
					System.out.println("g - Excluir...............................:");
					System.out.println("h - Voltar................................:");

					opcao = leia.next().charAt(0);

					if (opcao == 'a') {

						fakerPagar(this.quant);
						System.out.println("Você incluiu itens na lista:");
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

					} else if (opcao == 'b') {

						alterarPagar();
						System.out.println("Você alterou itens na lista:");
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

					}

					else if (opcao == 'c') {

						consultarPagarCnpj();
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

					} else if (opcao == 'd') {

						consultarPagarNumero();
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

					} else if (opcao == 'e') {

						consultarPagarValor();
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

					} else if (opcao == 'f') {

						consultarPagarBoleto();
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

					} else if (opcao == 'g') {

						removerPagar();
						System.out.println("Você removeu itens na lista");
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

					} else if (opcao == 'h') {
						Menu();
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					}

				}

				else if (num == 6) {

					contas();
					Menu();
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				}

				else if (num == 7) {
					System.out.println("FIM");
					break;
					

				}
				
				
			
			
			} while (num > 0 && num < 7);
		while (num <= 0 || num > 7) {
			
			System.err.println("CÓDIGO INVALIDO, DIGÍTE NOVAMENTE!!!");
			Menu();
			
		}
		
					
			
				
		
	}

	public static void main(String[] args) {

		MenuPrincipal menu = new MenuPrincipal();

		menu.Menu();

	}

	@Override
	public void entrar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub

	}

}
