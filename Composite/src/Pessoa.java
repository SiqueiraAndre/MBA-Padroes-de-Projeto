
public abstract class Pessoa {
	protected String nome;
	 
    public void showNome() {
        System.out.println(nome);
    }
 
    public String getNome() {
        return nome;
    }
 
    public void terFilho(Pessoa filho) throws Exception {
        throw new Exception(nome + " n�o pode ter filhos - Somente mulheres podem engravidar");
    }
 
    public Pessoa getFilho(String nomeFilho) throws Exception {
        throw new Exception(" � homem e por isso, n�o esteve em gesta��o - n�o localizada lista de filhos");
    }
}
