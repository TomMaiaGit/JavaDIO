package escola;

public class Escola {
	public static void main(String[] args) {
//		Aluno felipe = new Aluno();
//		felipe.nome="Felipe";
//		felipe.idade = 8;
//		
		//System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade + " anos ");
		//RESULTADO NO CONSOLE
		//O aluno Felipe tem 8 anos 	
		
		Aluno felipe = new Aluno();
		
		felipe.setNome("Felipe Silva");
		felipe.setIdade(15);
		felipe.setSexo("Masculino");
		
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos," + " e seu sexo e: " + felipe.getSexo());	
	
	}
}
