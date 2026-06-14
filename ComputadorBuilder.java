public class ComputadorBuilder {



    static class Computador {
        private String processador;
        private String ram;
        private String armazenamento;
        private String placaDeVideo;
        private String sistemaOperacional;

  
        private Computador() {}

        @Override
        public String toString() {
            return "Processador: " + processador + "\n" +
                   "RAM: " + ram + "\n" +
                   "Armazenamento: " + armazenamento + "\n" +
                   "Placa de vídeo: " + (placaDeVideo != null ? placaDeVideo : "N/A") + "\n" +
                   "Sistema operacional: " + (sistemaOperacional != null ? sistemaOperacional : "N/A");
        }
    }

  
    private Computador computador;

    public ComputadorBuilder() {
        this.computador = new Computador();
    }

    public ComputadorBuilder comProcessador(String processador) {
        computador.processador = processador;
        return this;
    }

    public ComputadorBuilder comRam(String ram) {
        computador.ram = ram;
        return this;
    }

    public ComputadorBuilder comArmazenamento(String armazenamento) {
        computador.armazenamento = armazenamento;
        return this;
    }

    public ComputadorBuilder comPlacaDeVideo(String placaDeVideo) {
        computador.placaDeVideo = placaDeVideo;
        return this;
    }

    public ComputadorBuilder comSistemaOperacional(String sistemaOperacional) {
        computador.sistemaOperacional = sistemaOperacional;
        return this;
    }

    public Computador build() {
        Computador resultado = this.computador;
        this.computador = new Computador(); // reseta para o próximo build
        return resultado;
    }
}
