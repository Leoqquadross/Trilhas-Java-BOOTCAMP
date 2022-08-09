package workflow;

import workflow.CanalNotificacao;

public class Teams implements CanalNotificacao {
    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println("[TEAMS] {"+mensagem.getTipoMensagem()+"} - "+mensagem.getTexto());
    }
}
