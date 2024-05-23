package iPhone;

import iPhone.Aplicativos.AparelhoTelefonico;
import iPhone.Aplicativos.NavegadorInternet;
import iPhone.Aplicativos.ReprodutorMusical;

public class iphone {
    public static void main(String[] args) {
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligarParaNumero("9999-9999");
        telefone.atenderCelular();
        telefone.desligarLigacao();
        telefone.tocarCorreioDeVoz();

        ReprodutorMusical musica = new ReprodutorMusical();
        musica.tocarMusica();
        musica.pausarMusica();
        musica.selecionarMusica("Musica 1");

        NavegadorInternet browser = new NavegadorInternet();
        browser.exibirPagina("www.google.com");
        browser.adicionarNovaAba();
        browser.atualizarPagina();
    }
}
