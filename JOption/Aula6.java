
import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class Aula6 {
    public static void main(String[] args){
        // Exibir mensagem
        JOptionPane.showMessageDialog(null, "exibir mensagem para o usuario");

       // exibir CD de confirmação

       int escolha = JOptionPane.showConfirmDialog(null, "deseja remover o usuario?");

       if (escolha == JOptionPane.YES_OPTION){
        JOptionPane.showMessageDialog(null, "usuario removido");
       }
       else {
        JOptionPane.showMessageDialog(null, "Ação cancelada");
       }

       //solicitar ao usuario que digite um valor

       String nome = JOptionPane.showInputDialog(null, "Digite seu nome?");
       JOptionPane.showMessageDialog(null,"Meu nome é " + nome);

       String preço = JOptionPane.showInputDialog(null, "digite o valor do produto");
       JOptionPane.showMessageDialog(null,"O preço é : " + preço);

       //CD de opções
       String[] opçoes = {"Sim", "Não", "Cancelar"};
       int resposta = JOptionPane.showOptionDialog(null, "Deseja salvar essa alteração", "opção de salvar", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,opçoes,opçoes[0]);

       if (resposta == JOptionPane.YES_OPTION){
        JOptionPane.showMessageDialog(null, "operação realizada");
       }

       else if (resposta == JOptionPane.NO_OPTION){
        JOptionPane.showMessageDialog(null,"Operação não realizada");
       }
}
}

