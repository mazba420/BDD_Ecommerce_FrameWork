package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private Properties prop ;

    /**
     * this method used to load the properties from config.properties file
     * @return it returns properties prop object
     */
    public Properties init_prop(){
        try{
            prop =new Properties();
            FileInputStream ip = new FileInputStream("C:\\Users\\Mazba\\Desktop\\New folder\\Ecommerce_BDD_FrameWork\\src\\test\\java\\config\\config.properties");
            prop.load(ip);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        return prop ;

    }


}
