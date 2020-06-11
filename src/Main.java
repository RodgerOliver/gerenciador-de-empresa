import javax.swing.*;
import java.util.ArrayList;

public class Main {
	private static String app_name = "gerenciador-de-empresa v.1.0";

	public static void main(String[] args){

		JOptionPane.showMessageDialog(null,
				"Olá! Bem vindo ao Gerenciador de Empresa! A seguir você irá criar uma empresa",
		app_name, 1);

		/* recebe tipo de empresa */
		String tipos_empresas[] = {"Empresa do Setor Primário", "Empresa do Setor Secundário", "Empresa do Setor Terciário"};
		JComboBox tipo_empresa_field = new JComboBox(tipos_empresas);
		tipo_empresa_field.setSelectedIndex(0);

		Object[] form_tipo_empresa = {
			"Qual é o tipo da sua empresa?", tipo_empresa_field
		};

		int action = JOptionPane.showConfirmDialog(null, form_tipo_empresa, app_name, JOptionPane.OK_CANCEL_OPTION);
		Main.validacaoMessageDialog(action);

		/* tipo empresa */
		String tipo_empresa = (String)tipo_empresa_field.getSelectedItem();

		/* recebe informações do endereço */
		JTextField rua_field    = new JTextField();
		JTextField numero_field = new JTextField();
		JTextField bairro_field = new JTextField();
		JTextField cidade_field = new JTextField();
		JTextField estado_field = new JTextField();
		JTextField pais_field   = new JTextField();

		Object[] form_endereco = {
			"Rua:"    , rua_field,
			"Número:" , numero_field,
			"Bairro:" , bairro_field,
			"Cidade"  , cidade_field,
			"Estado:" , estado_field,
			"País"    , pais_field
		};

		action = JOptionPane.showConfirmDialog(null, form_endereco, app_name, JOptionPane.OK_CANCEL_OPTION);
		Main.validacaoMessageDialog(action);

		String rua    = rua_field.getText();
		int numero    = Integer.parseInt(numero_field.getText());
		String bairro = bairro_field.getText();
		String cidade = cidade_field.getText();
		String estado = estado_field.getText();
		String pais   = pais_field.getText();

		/* criar objeto endereço */
		Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado, pais);

		/* recebe informações da empresa */
		JTextField nome_empresa_field    = new JTextField();
		JTextField materiaPrima_field    = new JTextField();
		JTextField produtoFinal_field    = new JTextField();
		JTextField tipoDeLoja_field      = new JTextField();
		JTextField servicoPrestado_field = new JTextField();

		if(tipo_empresa.equals(tipos_empresas[0])) {
			Object[] form_empresa = {
				"Nome:", nome_empresa_field,
				"Matéria Prima:", materiaPrima_field,
				"Produto Final", produtoFinal_field
			};
			action = JOptionPane.showConfirmDialog(null, form_empresa, app_name, JOptionPane.OK_CANCEL_OPTION);
			Main.validacaoMessageDialog(action);


		} else if(tipo_empresa.equals(tipos_empresas[1])) {
			Object[] form_empresa = {
				"Nome:", nome_empresa_field,
				"Tipo de Loja:", materiaPrima_field,
				"Exemplos: farmácia, supermercado, restaurante, bar."
			};
			action = JOptionPane.showConfirmDialog(null, form_empresa, app_name, JOptionPane.OK_CANCEL_OPTION);
			Main.validacaoMessageDialog(action);


		} else if(tipo_empresa.equals(tipos_empresas[2])) {
			Object[] form_empresa = {
				"Nome:", nome_empresa_field,
				"Serviço Prestado:", servicoPrestado_field
			};
			action = JOptionPane.showConfirmDialog(null, form_empresa, app_name, JOptionPane.OK_CANCEL_OPTION);
			Main.validacaoMessageDialog(action);

		}

		String nome_empresa    = nome_empresa_field.getText();
		String materiaPrima    = materiaPrima_field.getText();
		String produtoFinal    = produtoFinal_field.getText();
		String tipoDeLoja      = tipoDeLoja_field.getText();
		String servicoPrestado = servicoPrestado_field.getText();

		/* criar objeto empresa */
		Empresa empresa = null;
		if(tipo_empresa.equals(tipos_empresas[0])) {
			empresa = new EmpresaSetorPrimario(nome_empresa, endereco, materiaPrima, produtoFinal);

		} else if(tipo_empresa.equals(tipos_empresas[1])) {
			empresa = new EmpresaSetorSecundario(nome_empresa, endereco, tipoDeLoja);

		} else if(tipo_empresa.equals(tipos_empresas[2])) {
			empresa = new EmpresaSetorTerciario(nome_empresa, endereco, servicoPrestado);
		}

		JOptionPane.showMessageDialog(null, empresa.dados(), app_name, 1);

		/* array de funcionários */
		ArrayList<Funcionario> funcionarios = new ArrayList<>();

		/* ações dentro da empresa */
		String acoes[] = {"Contratar Funcionário", "Listar Funcionários",  "Atualizar Usuário", "Demitir Funcionários"};
		JComboBox acao_field = new JComboBox(acoes);
		acao_field.setSelectedIndex(0);

		Object[] form_actions = {
			"Qual ação deseja tomar? ", acao_field
		};

		while(true) {
			action = JOptionPane.showConfirmDialog(null, form_actions, app_name, JOptionPane.OK_CANCEL_OPTION);
			String acao = (String)acao_field.getSelectedItem();

			Main.validacaoMessageDialog(action);

			boolean contratar = true;
			if(acao.equals(acoes[0])) {
				Funcionario funcionario = Main.instanciarFuncionario();
				for(int i = 0; i < funcionarios.size(); i++) {
					if(funcionario.getCpf().equals(funcionarios.get(i).getCpf())) {
						JOptionPane.showMessageDialog(null, "Erro: Um funcionário com esse CPF já está cadastrado!", app_name, 1);
						contratar = false;
					}
				}
				if(contratar) {
					funcionarios.add(funcionario);
				}

			} else if(acao.equals(acoes[1])) {
				for(int i = 0; i < funcionarios.size(); i++) {
					JOptionPane.showMessageDialog(null, funcionarios.get(i).dados(), app_name, 1);
				}

			} else if(acao.equals(acoes[2])) {
				String funcionario_cpf = Main.showInputDialog("Qual o CPF do funcionário que deseja atualizar os dados?");
				Funcionario funcionario = null;

				int i;
				boolean atualizar = false;
				for(i = 0; i < funcionarios.size(); i++) {
					if(funcionario_cpf.equals(funcionarios.get(i).getCpf())) {
						funcionario = funcionarios.get(i);
						atualizar = true;
						break;
					}
				}
				if(atualizar) {
					Funcionario funcionario_atualizado = Main.instanciarFuncionario(funcionario);
					funcionarios.remove(i);
					funcionarios.add(funcionario_atualizado);
					JOptionPane.showMessageDialog(null, "Sucesso: O funcionário foi atualizado!", app_name, 1);
				} else {
					JOptionPane.showMessageDialog(null, "Erro: CPF não encontrado.", app_name, 1);
				}

			} else if(acao.equals(acoes[3])) {
				String funcionario_cpf_remover = Main.showInputDialog("Qual o CPF do funcionário que deseja demitir?");

				boolean erro = true;

				for(int i = 0; i < funcionarios.size(); i++) {
					if(funcionario_cpf_remover.equals(funcionarios.get(i).getCpf())) {
						JOptionPane.showMessageDialog(null, "Sucesso: Funcionário "+ funcionarios.get(i) +" foi demitido!", app_name, 1);
						funcionarios.remove(i);
						erro = false;
						break;
					}
				}
				if(erro) {
					JOptionPane.showMessageDialog(null, "Erro: CPF não encontrado.", app_name, 1);
				}
			}
		}
	}

	public static void validacaoMessageDialog(int option){
		/* exit if Cancel*/
		if(option != 0) {
			JOptionPane.showMessageDialog(null, "Programa Fechado", app_name, 1);
			System.exit(0);
		}
	}

	public static Funcionario instanciarFuncionario(){

		String option_sim_nao[] = {"Sim", "Não"};

		JTextField nome_fucionario_field      = new JTextField();
		JTextField sobrenome_fucionario_field = new JTextField();
		JTextField idade_field                = new JTextField();
		JTextField cpf_field                  = new JTextField();
		JTextField cargo_field                = new JTextField();
		JTextField salario_field              = new JTextField();
		JComboBox beneficioMedico_field       = new JComboBox(option_sim_nao);
		beneficioMedico_field.setSelectedIndex(0);

		Object[] form_funcionario = {
			"Nome:", nome_fucionario_field,
			"Sobrenome:", sobrenome_fucionario_field,
			"Idade:", idade_field,
			"CPF:", cpf_field,
			"Cargo:", cargo_field,
			"Salário:", salario_field,
			"Beneficio Médico:", beneficioMedico_field
		};

		int action = JOptionPane.showConfirmDialog(null, form_funcionario, app_name, JOptionPane.OK_CANCEL_OPTION);
		Main.validacaoMessageDialog(action);

		String beneficioMedico_string = (String)beneficioMedico_field.getSelectedItem();
		boolean beneficioMedico = false;
		if(beneficioMedico_string.equals(option_sim_nao[0])) {
			beneficioMedico = true;
		}

		String nome_fucionario      = nome_fucionario_field.getText();
		String sobrenome_fucionario = sobrenome_fucionario_field.getText();
		int idade                   = Integer.parseInt(idade_field.getText());
		String cpf                  = cpf_field.getText();
		String cargo                = cargo_field.getText();
		Double salario              = Double.parseDouble(salario_field.getText());
		boolean ativo = true;

		return new Funcionario(nome_fucionario, sobrenome_fucionario, idade, cpf, cargo, salario, beneficioMedico, ativo);
	}

	public static Funcionario instanciarFuncionario(Funcionario funcionario){

		String option_sim_nao[] = {"Sim", "Não"};

		JTextField nome_fucionario_field      = new JTextField(funcionario.getNome());
		JTextField sobrenome_fucionario_field = new JTextField(funcionario.getSobrenome());
		JTextField idade_field                = new JTextField(String.valueOf(funcionario.getIdade()));
		JTextField cpf_field                  = new JTextField(funcionario.getCpf());
		JTextField cargo_field                = new JTextField(funcionario.getCargo());
		JTextField salario_field              = new JTextField(String.valueOf(funcionario.getSalario()));
		JComboBox beneficioMedico_field       = new JComboBox(option_sim_nao);
		beneficioMedico_field.setSelectedIndex(0);

		Object[] form_funcionario = {
			"Nome:", nome_fucionario_field,
			"Sobrenome:", sobrenome_fucionario_field,
			"Idade:", idade_field,
			"CPF:", cpf_field,
			"Cargo:", cargo_field,
			"Salário:", salario_field,
			"Beneficio Médico:", beneficioMedico_field
		};

		int action = JOptionPane.showConfirmDialog(null, form_funcionario, app_name, JOptionPane.OK_CANCEL_OPTION);
		Main.validacaoMessageDialog(action);

		String beneficioMedico_string = (String)beneficioMedico_field.getSelectedItem();
		boolean beneficioMedico = false;
		if(beneficioMedico_string.equals(option_sim_nao[0])) {
			beneficioMedico = true;
		}

		String nome_fucionario      = nome_fucionario_field.getText();
		String sobrenome_fucionario = sobrenome_fucionario_field.getText();
		int idade                   = Integer.parseInt(idade_field.getText());
		String cpf                  = cpf_field.getText();
		String cargo                = cargo_field.getText();
		Double salario              = Double.parseDouble(salario_field.getText());
		boolean ativo = true;

		return new Funcionario(nome_fucionario, sobrenome_fucionario, idade, cpf, cargo, salario, beneficioMedico, ativo);
	}

	public static String showInputDialog(String mensagem){
		return JOptionPane.showInputDialog(null, mensagem, app_name, 1);
	}
}
