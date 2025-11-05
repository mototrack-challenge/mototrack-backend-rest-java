package br.com.fiap.mototrack_backend_java.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;
import org.springframework.stereotype.Service;

@Service
public class RelatorioMotoService {

    @PersistenceContext
    private EntityManager entityManager;

    public String gerarRelatorioMotos(Long idMoto) {
        StoredProcedureQuery query = entityManager.createStoredProcedureQuery("PR_RELATORIO_MOTOS_JSON");

        query.registerStoredProcedureParameter("p_id_moto", Long.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("p_json_out", String.class, ParameterMode.OUT);

        query.setParameter("p_id_moto", idMoto);
        query.execute();

        return (String) query.getOutputParameterValue("p_json_out");
    }
}
