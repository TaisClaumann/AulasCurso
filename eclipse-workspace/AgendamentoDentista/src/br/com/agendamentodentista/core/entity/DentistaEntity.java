package br.com.agendamentodentista.core.entity;

public class DentistaEntity extends PessoaEntity{
	
	private String numeroCarteiraTrabalho;
	

	

	@Override
	public String getNome() {
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		super.setNome(nome);
	}

	@Override
	public String getCpf() {
		return super.getCpf();
	}

	@Override
	public void setCpf(String cpf) {
		super.setCpf(cpf);
	}

	@Override
	public String getRg() {
		return super.getRg();
	}

	@Override
	public void setRg(String rg) {
		super.setRg(rg);
	}

	@Override
	public String getDataNascimento() {
		return super.getDataNascimento();
	}

	@Override
	public void setDataNascimento(String dataNascimento) {
		super.setDataNascimento(dataNascimento);
	}

	@Override
	public String getEndereco() {
		return super.getEndereco();
	}

	@Override
	public void setEndereco(String endereco) {
		super.setEndereco(endereco);
	}

	@Override
	public String getTelefone() {
		return super.getTelefone();
	}

	@Override
	public void setTelefone(String telefone) {
		super.setTelefone(telefone);
	}

	@Override
	public Long getCodigo() {
		return super.getCodigo();
	}

	@Override
	public void setCodigo(Long codigo) {
		super.setCodigo(codigo);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	public String getNumeroCarteiraTrabalho() {
		return numeroCarteiraTrabalho;
	}

	public void setNumeroCarteiraTrabalho(String numeroCarteiraTrabalho) {
		this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
	}

}
