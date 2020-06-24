package facade;
import dao.PerfilDAO;
import dao.UsuarioDAO;
import interfaces.Autenticacao;
import modelos.Perfil;
import modelos.Usuario;

public class AutenticacaoFacade implements Autenticacao{

	@Override
	public Perfil obterPerfil(Usuario usuario) {
		PerfilDAO pdao = new PerfilDAO();
		return pdao.obterPerfil(usuario);
	}

	@Override
	public Usuario obterUsuario(String usuario, String senha) {
		UsuarioDAO udao = new UsuarioDAO();
		return udao.obterUsuario(usuario, senha);
	}

}
