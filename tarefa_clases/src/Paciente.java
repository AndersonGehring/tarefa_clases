/**
 * @author Anderson.Gehring
 */

public class Paciente {

        private String nome;
        private double peso;
        private double altura;
        private String nomeMedico;

    /**
     * método para definir de uma vez só o nome, peso, altura e o nome do médico!
     *
     * @param nome
     * @param peso
     * @param altura
     * @param nomeMedico
     *
     * @version 1.0
     */
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

    /**
     * método para calcular o ICM do paciente atravéz do peso e a altura que foram difitados no Programa
     *
     *
     * @return
     */
    public double calculoIcm(){
        return peso / (altura * altura);
    }
}
