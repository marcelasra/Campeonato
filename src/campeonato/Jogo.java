package campeonato;
import java.util.Random;

public class Jogo {
    
    private Time desafiado;
    private Time desafiante;
    private boolean aprovado;
    
    public void marcarJogo(Time t1, Time t2){
        if((t1.getQtedeJogadores() >= 9 && t2.getQtedeJogadores() >=9) && t1 != t2){
            this.setAprovado(true);
            this.setDesafiado(t1);
            this.setDesafiante(t2);
        } else{
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            System.out.println("Jogo Anulado");
        }
    }
    public void jogar() {
        if (this.isAprovado()) {
            System.out.println("### Time da CASA ");
            System.out.println(this.getDesafiado().apresentar());
            System.out.println("### Time VISITANTE ");
            System.out.println(this.getDesafiante().apresentar());
            
            Random rd = new Random();
            int vencedor = rd.nextInt(3);
            
            System.out.println("----- Resultado do Jogo ------");
            switch (vencedor) {
                case 0:
                    System.out.println("--> Empate");
                    this.getDesafiado().empatarJogo();
                    this.getDesafiante().empatarJogo();
                    break;
                    
                case 1:
                    System.out.println("Ganhou: " + this.getDesafiado().getNome());
                    this.getDesafiado().ganharJogo();
                    this.getDesafiante().perderJogo();
                    break;
                    
                case 2:
                    System.out.println("Ganhou: " + this.getDesafiante().getNome());
                    this.getDesafiante().ganharJogo();
                    this.getDesafiado().perderJogo();
                    break;
            }
            System.out.println("---------------------------------");
        }
    }

    public Time getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Time desafiado) {
        this.desafiado = desafiado;
    }

    public Time getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Time desafiante) {
        this.desafiante = desafiante;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
