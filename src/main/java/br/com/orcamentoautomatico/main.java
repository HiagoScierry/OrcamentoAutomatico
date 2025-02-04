/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.orcamentoautomatico;

import br.com.orcamentoautomatico.models.log;
import br.com.orcamentoautomatico.modules.log.adapter.CSVLog;
import br.com.orcamentoautomatico.modules.log.adapter.JSONLog;

/**
 *
 * @author hiago
 */
public class main {

    public static void main(String[] args) {
        log log = new log("Insercao", "classe referida insercao", "Mikalateia");
        
        JSONLog jsonLog = new JSONLog();
        CSVLog csvLog = new CSVLog();
        
        csvLog.escreverMensagem(log);
        jsonLog.escreverMensagem(log);
    }
}
