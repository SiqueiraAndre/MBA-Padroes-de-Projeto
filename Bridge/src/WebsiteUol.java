
public class WebsiteUol implements Website {
	
	@Override
	public void opcaoFavoritos(String descricao) {
		System.out.println(descricao + " - P�gina UOL");
	}
	@Override
	public void opcaoHistorico(String descricao) {
		System.out.println(descricao + " - P�gina UOL");
	}
	@Override
	public void opcaoCache(String descricao) {
		System.out.println(descricao + " - Cache UOL");
	}
}
