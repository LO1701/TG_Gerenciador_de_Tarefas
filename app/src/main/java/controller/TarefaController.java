package controller;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.Tarefa;
import util.ConectionFactory;

public class TarefaController {
    Connection conn = null;
    PreparedStatement statement = null;
    String sql;
    
    public void salvar(Tarefa tarefa){
        sql = "INSERT INTO tarefa ( nome" +
                                    "descricao" +
                                    "status" +
                                    "obs" +
                                    "prazo" +
                                    "dataCriacao" +
                                    "dataModificacao" +
                                    "fkProjeto) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            conn = ConectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, tarefa.getNome());
            statement.setString(2, tarefa.getDescricao());
            statement.setString(3, tarefa.getStatus());
            statement.setString(4, tarefa.getObs());
            statement.setDate(5, new Date(tarefa.getPrazo().getTime()));
            statement.setDate(6, new Date(tarefa.getDataCriacao().getTime()));
            statement.setDate(7, new Date(tarefa.getDataModificacao().getTime()));
            statement.setInt(8, tarefa.getIdProjeto());
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar a tarefa", e);
        } finally {
            ConectionFactory.CloseConnection(conn);
        }
        
    }
    
     public void atualizar(Tarefa tarefa){
        
    }
     
    public void deletarById(int idTarefa){
        sql = "DELETE FROM tarefa WHERE idTarefa = ?";
        
        try {
            conn = ConectionFactory.getConnection();
            statement = conn.prepareCall(sql);
            statement.setInt(1, idTarefa);
            statement.execute();
        } catch (SQLException x) {
            throw new RuntimeException("Erro ao deletar a tarefa", x);
        }finally{
            ConectionFactory.CloseConnection(conn);
        }
    }
    
    public List<Tarefa> getAll(int idProjeto){
        return null;
    }
}
