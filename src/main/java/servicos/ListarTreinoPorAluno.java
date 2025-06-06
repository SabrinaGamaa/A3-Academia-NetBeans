package servicos;

import java.awt.Component;
import java.time.format.DateTimeFormatter;
import modelos.Treino;
import repositorio.TreinoRepositorio;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelos.Aluno;
import repositorio.AlunoRepositorio;

public class ListarTreinoPorAluno {

    public final void listarTreinosPorIdAluno(Component Tela, DefaultTableModel modelo, JTextField txtIdAluno){       
        modelo.setRowCount(0); 
        
        String idTreinoStr = txtIdAluno.getText();
        
        if (idTreinoStr.isEmpty()){
            JOptionPane.showMessageDialog(Tela, "ID do Aluno é obrigatório!");
            return;
        }
        
        try {
            
            Long idTreino = Long.parseLong(idTreinoStr.trim());
            List<Treino> treinos = new TreinoRepositorio().listarTreinoAluno(idTreino);            

            if (treinos.isEmpty()){
                JOptionPane.showMessageDialog(Tela, "Nenhum treino encontrado para o Aluno ID " + idTreino);
            } else {   
                for (Treino treino : treinos) {
                    Aluno alunos = new AlunoRepositorio().listarAlunoPorId(treino.getAlunoId());
                    if (alunos != null) {
                        modelo.addRow(new Object[] {
                            treino.getId(),
                            treino.getAlunoId(),
                            alunos.getNome(),
                            treino.getTipoTreino(),
                            treino.getDataInicio().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")),
                            String.valueOf(treino.getDuracao().toMinutes() + " minutos"),
                            treino.getDescricao()
                        });
                    }
                    else {
                        modelo.addRow(new Object[] {
                            treino.getId(),
                            treino.getAlunoId(),
                            "Aluno Desconhecido",
                            treino.getTipoTreino(),
                            treino.getDataInicio().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")),
                            String.valueOf(treino.getDuracao().toMinutes() + " minutos"),
                            treino.getDescricao()
                        });
                    }
                }
            }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(Tela, "ID inválido. Por favor, digite apenas números.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(Tela, "Erro ao carregar treino: " + e.getMessage());
        }
    }

}
