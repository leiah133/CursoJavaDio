package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributos
    private Set<Contato> contatoSet;
//construtor
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();

    }
    //metodos
    public void  adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    public  void exibirContato(){
        System.out.println(contatoSet);
    }

}
