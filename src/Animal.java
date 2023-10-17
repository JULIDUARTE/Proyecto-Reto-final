import com.sun.corba.se.impl.logging.OMGSystemException;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Animal {
    String name;
    int age;
    String specie;
    String race;
    String healthcondition;
    String description;


    Animal(){

    }
    Animal(String name, int age, String specie, String race, String healthcondition, String description){
        this.name = name;
        this.age =  age;
        this.specie = specie;
        this.race = race;
        this.healthcondition = healthcondition;
        this.description = description;




    }
    public void setName(String Name) throws Exception {
        Logger logger = Logger.getLogger("mi aplicacion");
        if (name == null || name.isEmpty()){
            logger.log(Level.SEVERE, "El nombre no puede estar vacío");
        }
    }
    public void update() throws IOException {
        FileHandler fhandler = new FileHandler("C:/Datos/MyLog.log");
        Logger logger = Logger.getLogger("milog");

            SimpleFormatter formatter = new SimpleFormatter();
            fhandler.setFormatter(formatter);
            logger.addHandler(fhandler);
            logger.log(Level.SEVERE, "prueba error");
            fhandler.close();
        }
    }



