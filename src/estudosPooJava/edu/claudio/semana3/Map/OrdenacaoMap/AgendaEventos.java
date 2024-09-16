package estudosPooJava.edu.claudio.semana3.Map.OrdenacaoMap;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        this.eventos = new HashMap<LocalDate, Evento>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventos);
        System.out.println(eventoTreeMap);
    }

    public void exibirProximoEvento() {
        /* Set<LocalDate> dateSet = eventos.keySet();
        * Collection<Evento> values = eventos.values(); */
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventos);
        for(Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
            if(entry.getKey().isAfter(dataAtual) || entry.getKey().isEqual(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento " + proximoEvento + " acontecera na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEvento(LocalDate.of(2024, 12, 24), "Comer fora", "Noite de natal");
        agenda.adicionarEvento(LocalDate.of(2024, 12, 24), "Comer fora", "Noite de natal");

        agenda.exibirAgenda();

    }

}
