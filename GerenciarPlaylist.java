import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;
public class GerenciarPlaylist {
    public static void main(String[] args) {
        //generics
       // List <Musica> musicas = new LinkedList <>();
        var musicas = new ArrayList<Musica>();
        musicas.add(new Musica());
       // Collections.sort(musicas);
        String menu = "1 - Adicionar musica\n2 - Ver musica\n3 - Avaliar musica\n4 - Excluir musica\n0 - Sair\n";
        
        int op;
        do{
            op = parseInt(showInputDialog(menu));
            switch(op){
                case 1:{
                 //1. Pegar os dados da musica
                String titulo = showInputDialog("Titulo?");
                //2. Construir um objeto Musica
                var musica = new Musica(titulo);
                //3. Adicionar na colecao com add
                musicas.add(musica);
                //4.Avisar o usuario que deu certo
                showMessageDialog(null, "OK, adicionada!");
                break;
                }
            }
        }while (op != 0);
    }
}
