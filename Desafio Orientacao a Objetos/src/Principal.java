import com.objetos.a.orientacao.desafio.modelos.Musica;
import com.objetos.a.orientacao.desafio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitulo("Clau");
        musica1.setInterprete("LINIKER");
        musica1.setAlbum("Índigo Borboleta Anil");
        musica1.setGenero("R&B");
        musica1.setProducao("Júlio Fejuca");
        musica1.setComposicao("LINIKER");
        musica1.setDuracao(4.14);
        musica1.setLancamento(10.2021);
        musica1.reproduzir();
        musica1.curtir();
        musica1.avaliar();
        musica1.exibirFichaTecnica();

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Marina Silva");
        podcast1.setConvidado("Marina Silva");
        podcast1.setHost("Mano Brown");
        podcast1.setDescricao("""             
                Com vocês: Marina Silva, ex-senadora, candidata três vezes a presidente
                da República e hoje ministra do Meio Ambiente e Mudança do Clima""");
        podcast1.setDuracao(133.56);
        podcast1.setLancamento(10.2023);
        podcast1.reproduzir();
        podcast1.curtir();
        podcast1.avaliar();
        podcast1.exibirFichaTecnica();
    }
}
