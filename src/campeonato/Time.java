package campeonato;

public class Time {
    private String nome;
    private String cidade;
    private String uf;
    private int anoFundacao;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int qtedeJogadores;
    
    public Time(String nome, String cidade, 
            String uf, int anoFundacao, int vi, 
            int de, int em, int qtedeJogadores){
        this.nome = nome;
        this.cidade = cidade;
        this.uf = uf;
        this.anoFundacao = anoFundacao;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
        this.qtedeJogadores = qtedeJogadores;
    }

public String apresentar() {
String dados = "";
dados += "\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n";
dados += "\nSALVE AMIGOS do CAMPEONATO VARZEANO!\n";
dados += "O grande time " + this.getNome() + "\n";
dados += "Diretamente de " + this.getCidade() + "," + this.getUf() + "\n";
dados += "Fundado no ano de " + this.getAnoFundacao() + "\n";
dados += "Vitórias: " + this.getVitorias() + "\n";
dados += "Derrotas: " + this.getDerrotas() + "\n";
dados += "Empates: " + this.getEmpates() + "\n";
dados += "\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n";
return dados;

}

public String status() {
String dados = "";
dados += "\n************************************************\n";
dados += "Time: " + this.getNome() + "\n";
dados += "Vitórias: " + this.getVitorias() + "\n";
dados += "Derrotas: " + this.getDerrotas() + "\n";
dados += "Empates: " + this.getEmpates() + "\n";
dados += "\n************************************************\n";
return dados;

}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getQtedeJogadores() {
        return qtedeJogadores;
    }

    public void setQtedeJogadores(int qtedeJogadores) {
        this.qtedeJogadores = qtedeJogadores;
    }
}
