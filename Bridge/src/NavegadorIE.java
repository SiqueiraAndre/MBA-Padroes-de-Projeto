
public class NavegadorIE extends NavegadorAbstract {
	public NavegadorIE(Website s) {
        super(s);
    }
 
    @Override
    public void estruturar() {
    	opcaoFavoritos("Adicionar aos Favoritos do IE");
        opcaoHistorico("Guardar no Hist�rico do IE");
        opcaoCache("Permitir armazenar Cookies no IE");
        System.out.println("--O IE deu um erro durante a execu��o e precisa ser fechado--");
        System.out.println();
    }
}