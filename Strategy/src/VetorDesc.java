
public class VetorDesc extends Vetor {

	@Override
	public void percorrerLista() {
		for(int i=TAMANHO-1; i >= 0; i--) {
			System.out.println("Posi��o "+i+" - Valor "+ list.get(i));
		}
	}

}
