public class iphone implements musicPlayer, callPhone, Browser {
    
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }
    
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }
    
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

    public static void main(String[] args) {
        iphone meuIphone = new iphone();

        System.out.println("--- Testando Reprodutor Musical ---");
        meuIphone.tocar();
        meuIphone.selecionarMusica("Oceano - Djavan");
        meuIphone.pausar();
        
        System.out.println("\n--- Testando Aparelho Telefônico ---");
        meuIphone.ligar("92 993135221");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        
        System.out.println("\n--- Testando Navegador na Internet ---");
        meuIphone.exibirPagina("www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}