/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author matrix007
 */
public class ConnectionFactory {

    private String erro;
    
    //metodo getConnection 
    public Connection getConnection(){
        try {
                      
        return DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdvendas","teste","123");
    }catch(SQLException erro){
        throw new RuntimeException(erro);
     }
        
    }
}
