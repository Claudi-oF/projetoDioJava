package estudosPooJava.edu.claudio.semana3.PilaresPoo.Interfaces.estabelecimento;

import estudosPooJava.edu.claudio.semana3.PilaresPoo.Interfaces.equipamentos.Multifuncional.EquipamentoMultifuncional;
import estudosPooJava.edu.claudio.semana3.PilaresPoo.Interfaces.equipamentos.copiadora.Copiadora;
import estudosPooJava.edu.claudio.semana3.PilaresPoo.Interfaces.equipamentos.digitalizadora.Digitalizadora;
import estudosPooJava.edu.claudio.semana3.PilaresPoo.Interfaces.equipamentos.impressora.Deskjet;
import estudosPooJava.edu.claudio.semana3.PilaresPoo.Interfaces.equipamentos.impressora.Impressora;
import estudosPooJava.edu.claudio.semana3.PilaresPoo.Interfaces.equipamentos.impressora.Laserjet;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    } 
}
