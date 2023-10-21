package entities;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{


    @Override
    public void ligar() {
        System.out.println("Ligando!");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada!");
    }

    @Override
    public void tocar() {
        System.out.println("Música tocando!");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada");
    }
}
