package threads;

public class CriadorThreads extends Thread {
	
	
   private String nome;
   private int valorInicial;
   private int valorFinal;
   
   
   
   
	
	public String getNome() {
	return nome;
}




public void setNome(String nome) {
	this.nome = nome;
}




public int getValorInicial() {
	return valorInicial;
}




public void setValorInicial(int valorInicial) {
	this.valorInicial = valorInicial;
}




public int getValorFinal() {
	return valorFinal;
}




public void setValorFinal(int valorFinal) {
	this.valorFinal = valorFinal;
}




	public CriadorThreads(String nomeThread, int valorIni , int valorFin) {
		this.nome = nomeThread;
		this.valorInicial = valorIni;
		this.valorFinal = valorFin;
		
		System.out.println(" A "+nomeThread+" Os valores que são diviveis por 3 e 5 são:\n");
		
		for (int i = valorIni; i <= valorFin;i++) {
			 if (i % 3 ==0 && i % 5 ==0) {
				 System.out.println(i);
			 }
			
		}
		
	}
	

}
