
public class Main {
	
	public static void main(String [] args) {
		FlyweightFactory factory = new FlyweightFactory();
		 
	    factory.getFlyweight(Files.PDF_2017).moverArquivo("ApolloServer@pasta/diret�rio");
	    factory.getFlyweight(Files.PDF_2017).moverArquivo("JupiterServer@pasta/diret�rio");
	    
	    System.out.println("\n");
	    factory.getFlyweight(Files.PDF_2019).moverArquivo("PlutoServer@pasta/diret�rio/novoDiretorio");
	    factory.getFlyweight(Files.PDF_2019).moverArquivo("JupiterServer@pasta/diret�rio");
	    factory.getFlyweight(Files.PDF_2019).moverArquivo("NeptuneServer@pasta/diret�rio");
	    
	    System.out.println("\n");
	    factory.getFlyweight(Files.FISCAL).moverArquivo("MercuryServer@pasta/diret�rio");
	}
}
