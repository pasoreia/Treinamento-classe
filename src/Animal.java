abstract class Animal{


    private String nome;
    
    public abstract  void emitirSom();

 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 

    public void dormir(String nome){
        setNome(nome);
        System.out.printf("O animal: %s dormiu zZzzZzz\n", getNome());
    }





}