package com.mrNaina;

import com.mrNaina.models.Olona;
import com.mrNaina.dao.GenericDao;
import com.mrNaina.dao.GenericDaoImpl;

public class Main {
    public static void main(String[] args) {
    //System.out.println("Hello World!");
        GenericDao<Olona> olonadao = new GenericDaoImpl<>();
        
    //Save 
        // Olona olona = new Olona();
        // olona.setNom("test");
        // olonadao.save(olona);

    //FindById
        Olona foundOlona = olonadao.findById(Olona.class, 13);
        if (foundOlona != null) {
            System.out.println("Found Olona: " + foundOlona.getNom());
        } else {
            System.out.println("Olona not found.");
        }

    //Update
        foundOlona.setNom("updated name");
        olonadao.update(foundOlona);
    }

   
}
