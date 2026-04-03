package aprendizado.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade, Seminario[] seminarios){
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("Professor: "+this.nome);
        if (seminarios == null) return;
        System.out.println("|Seminários cadastrados|");
        for (Seminario seminario:seminarios){
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if(seminario.getAlunos() == null) continue;
                System.out.println("|Alunos|");
                for (Aluno aluno:seminario.getAlunos()){
                    System.out.println("Aluno: "+aluno.getNome()+" Idade: "+aluno.getIdade());
                }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios(){
        return this.seminarios;
    }

    public void setSeminarios(Seminario[] seminarios){
        this.seminarios = seminarios;
    }

}
