package main;
import facade.AutenticacaoFacade;
import interfaces.Autenticacao;

public class AutenticadorDeConta {

	public static void main(String[] args) {
		
		Autenticacao aut = new AutenticacaoFacade();
		aut.obterUsuario("Guilherme", "Wolner123");
		
		/* N�o ser� exibido nenhum retorno pois este 
		 * projeto abstrai as demais classe para focar 
		 * apenas no uso do padr�o estrutural Facade. */

	}

}
