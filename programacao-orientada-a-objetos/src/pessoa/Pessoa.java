package pessoa;

public class Pessoa {
	private String name;
	private String cpf;
	private String endereco;
	
	public Pessoa(String name, String cpf, String endereco) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
