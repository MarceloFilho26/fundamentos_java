package exercicio_string;

public class exercicio03 {
	public static void main(String[] args) {
		String texto01 = "Será que são iguais?";
		String texto02 = "Será que são iguais?";
		
		boolean b1 = texto01.equals(texto02);
		System.out.print(b1 == true ? "Textos iguais!" : "Nao sao iguais!" );
	}
}
