/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author A-13
 */
public interface DataStorage {
    void writeData(String data);
    String readData();
}
