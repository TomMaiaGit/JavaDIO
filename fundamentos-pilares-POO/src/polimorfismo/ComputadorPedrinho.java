package polimorfismo;

import apps_polimorfismo.FacebookMessenger;
import apps_polimorfismo.MSNMessenger;
import apps_polimorfismo.ServicoMensagemInstantanea;
import apps_polimorfismo.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
//criando uma variavel que smi que incia o servico com valor Null
		ServicoMensagemInstantanea smi = null;
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
	//Como exemplo de escolha do app de msg criamos a variavel appEscolhido
		String appEscolhido="tlg"; 
	//A condição que determina qual será o app escolhido e
	//e criar um novo objeto da classe do app.
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
	//Após o objeto ser instanciado pode ser acionado os metodos desse obj.
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}
