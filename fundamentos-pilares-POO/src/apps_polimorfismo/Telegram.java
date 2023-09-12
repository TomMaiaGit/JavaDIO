package apps_polimorfismo;

public class Telegram extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Enviando msg pelo Telegram");
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo msg pelo telegram");
	}
	

}
