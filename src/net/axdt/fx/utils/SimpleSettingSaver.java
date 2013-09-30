/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.axdt.fx.utils;
import java.io.*;
import java.util.Properties;
/**
 *
 * @author lucas
 */
public class SimpleSettingSaver {
    private String path;
    public SimpleSettingSaver(String filepath){
        path=filepath;
    }
    public void WriteNewSettings(String settingtitle, String settingvalue){
        Properties p = new Properties();
p.put(settingtitle, settingvalue);
try {
    p.store(new FileOutputStream(path+".properties"), null);
    } catch (IOException ex) {
            }     
    }
    public String ReadSavedSettings(String settingtitle){
        InputStream is = this.getClass().getResourceAsStream(path+".properties");
Properties p = new Properties();
try{
    p.load(is);
   }catch(Exception e){
     e.printStackTrace();
   }
return p.getProperty(settingtitle);
    }
}
