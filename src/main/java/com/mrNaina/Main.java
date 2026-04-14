package com.mrNaina;

import com.mrNaina.models.Olona;
import com.mrNaina.dao.GenericDao;
import com.mrNaina.dao.GenericDaoImpl;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        GenericDao<Olona> olonadao = new GenericDaoImpl<>();

        Olona olona = new Olona();
        olona.setNom("test");
        olonadao.save(olona);

        
    }
}
