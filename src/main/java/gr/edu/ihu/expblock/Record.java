/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.edu.ihu.expblock;

import static java.awt.SystemColor.text;

/**
 *
 * @author Administrator
 */
public class Record {

    public String id;
    public String name;
    public String surname;
    public String town;
    public String poBox;
    public int origin;
    public int evictions = 0;
    public int survivals = 0;
    public String bKey = "";

    public String title; 
    public String authors;
    public String Fauthor;
    public String venue;
    public String year;

    public String getBlockingKey(MinHash minHash) {
        String bKey;
        if(!Fauthor.isEmpty())
            bKey = minHash.hash(Fauthor);//+ "_" + year;        
        else 
            bKey=year.toString();
        return bKey;
    }

    public String getIdNo() {
        if (this.id.indexOf("_") > 0) {
            return id.substring(1, this.id.indexOf("_"));
        }
        return id.substring(1);
    }
    
    public String getId() {
        return id;
    }

}
