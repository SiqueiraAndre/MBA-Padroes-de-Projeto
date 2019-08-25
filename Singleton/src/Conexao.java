
public class Conexao {
	//vari�vel est�tica
		private static Conexao conn;
		
		//Construtor privado 
		private Conexao() {
			
		}
		
		
		//M�todo est�tico para coletar a inst�ncia
		public static Conexao getInstance() {
			if (conn == null)
				conn = new Conexao();
			return conn;
		}
}
