public class Aluno {
    private String nome;
    private int nota, numero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if ((o == null) || (this.getClass() != o.getClass())) //verifica se o objeto a comparar é null ou se são de classes diferentes
            return false;
        else {
            Aluno umAluno = (Aluno) o; //typecast do objeto o, já que sabemos que se entrar neste if é da mesma class que o a comparar
            return(this.nome.equals(umAluno.getNome()) && // compara todas as variáveis
                    this.nota == umAluno.getNota() &&
                    this.numero == umAluno.getNumero());
        }
    }
}
