package com.pamokos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Ruta on 2017-03-10.
 */
public class naujas {
    public static void main(String[] args){
        try{
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/rsc",
                    "root",
                    "");

        } catch (Exception e) {
            System.out.print(e);


        }
    }
}
