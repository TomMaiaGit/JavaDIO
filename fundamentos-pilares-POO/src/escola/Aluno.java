package escola;

// Esta forma de criação de objetos segue a convenção JavaBeans, que pede
//public class Aluno {
//	String nome;
//	int idade;
//}

//arquivo Aluno.java
public class Aluno {
	private String nome;
	private int idade;
	private String sexo;
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	

}