package workplace;
import workflow.CanalNotificacao;
import workflow.Mensagem;
public class Sms implements CanalNotificacao {
    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println("[SMS] {"+mensagem.getTipoMensagem()+"} - "+mensagem.getTexto());
    }
}
