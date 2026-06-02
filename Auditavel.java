// Contrato de auditoria — apenas classes que o implementarem terão esse recurso
public interface Auditavel {
    void registrarAcao(String acao);
    void auditarAcoes();
}
