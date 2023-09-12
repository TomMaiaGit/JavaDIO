package interfacee.equipamentos.multifuncional;

import interfacee.equipamentos.copiadora.copiadora;
import interfacee.equipamentos.digitalizadora.digitalizadora;
import interfacee.equipamentos.impressora.impressora;

public class EquipamentoMultifuncional implements impressora, copiadora, digitalizadora {
	@Override
	public void impressão() {
		System.out.println("Imprimindo-Multifuncional");
	}
	@Override
	public void copiar() {
		System.out.println("Copiando-Multifuncional");
	}
	@Override
	public void digitalizar() {
		System.out.println("Digitalizando-Multifuncional");
	}
}
