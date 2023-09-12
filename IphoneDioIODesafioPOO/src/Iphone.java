import java.util.ArrayList;
import java.util.List;
import Interfaces.*;

public class Iphone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet {
    private List<String> playlist = new ArrayList<>();
    private String paginaAtual;
    private List<String> abas = new ArrayList<>();

    @Override
    public void tocar(String musica) {
        System.out.println("Tocando música: " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        playlist.stream()
                .filter(m -> m.equals(musica))
                .findFirst()
                .ifPresent(this::tocar);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
        paginaAtual = url;
    }

    @Override
    public void adicionarNovaAba(String url) {
        abas.add(url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página: " + paginaAtual);
    }

    public void adicionarMusica(String musica) {
        playlist.add(musica);
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.adicionarMusica("Música 1");
        iphone.adicionarMusica("Música 2");
        iphone.adicionarMusica("Música 3");

        iphone.selecionarMusica("Música 2");

        iphone.ligar("123-456-789");
        iphone.atender();

        iphone.exibirPagina("www.example.com");
        iphone.adicionarNovaAba("www.google.com");
        iphone.atualizarPagina();
    }
}
