package abstracao;

public class MSNMessenger extends ServicoMensagemInstantanea{
	@Override
	public void enviarMensagem() {
		System.out.println("Enviando msg pelo MSN");
	}
	@Override
	public void receberMensagem() {
		System.out.println("Enviando msg pelo MSN");
	}
}
