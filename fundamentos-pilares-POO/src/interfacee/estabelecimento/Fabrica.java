package interfacee.estabelecimento;

import interfacee.equipamentos.copiadora.copiadora;
import interfacee.equipamentos.digitalizadora.digitalizadora;
import interfacee.equipamentos.impressora.Deskjet;
import interfacee.equipamentos.impressora.impressora;
import interfacee.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main (String[] args) {
	EquipamentoMultifuncional mult = new EquipamentoMultifuncional();
	impressora imp = mult;
	digitalizadora dig = mult;
	copiadora copi = mult;
		imp.impressão();
		dig.digitalizar();
		copi.copiar();
	}
}
