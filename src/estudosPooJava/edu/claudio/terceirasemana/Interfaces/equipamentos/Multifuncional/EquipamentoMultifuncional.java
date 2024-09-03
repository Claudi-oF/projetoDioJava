package estudosPooJava.edu.claudio.terceirasemana.Interfaces.equipamentos.Multifuncional;

import estudosPooJava.edu.claudio.terceirasemana.Interfaces.equipamentos.copiadora.Copiadora;
import estudosPooJava.edu.claudio.terceirasemana.Interfaces.equipamentos.digitalizadora.Digitalizadora;
import estudosPooJava.edu.claudio.terceirasemana.Interfaces.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL"); 
    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
     
}
