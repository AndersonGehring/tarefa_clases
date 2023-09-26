public class Paciente {

        private String nome;
        private double peso;
        private double altura;
        private String nomeMedico;

    public Paciente(String nome, double peso, double altura, String nomeMedico) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.nomeMedico = nomeMedico;
    }

    public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public double calculoIcm(){
        return peso / (altura * altura);
    }
}
