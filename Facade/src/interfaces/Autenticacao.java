package interfaces;
import modelos.Perfil;
import modelos.Usuario;

public interface Autenticacao {
	public Perfil obterPerfil(Usuario usuario);
	
	public Usuario obterUsuario(String usuario, String senha);
}
