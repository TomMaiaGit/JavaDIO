package apps_polimorfismo;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();	
	//somente os filhos conhecem este método, devido está como protect
	//e os filhos no mesmo da classe pai.
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}	
}
