
public class NavegadorFirefox extends NavegadorAbstract {
	public NavegadorFirefox(Website s) {
        super(s);
    }
 
    @Override
    public void estruturar() {
    	opcaoFavoritos("Adicionar aos Favoritos do Firefox");
        opcaoHistorico("Guardar no Hist�rico  do Firefox");
        opcaoCache("Permitir armazenar Cookies  do Firefox");
        System.out.println();
    }
}
