package model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

public class Avion {
    public static final String POLJE_OZNAKA="oznaka";

    public static final String POLJE_RASPON_KRILA="rasponKrila";

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = POLJE_OZNAKA)
    private String oznaka;
    @DatabaseField(columnName = POLJE_RASPON_KRILA,canBeNull = false)
    private int rasponKrila;



    public Avion( String oznaka, int rasponKrila) {

        this.oznaka = oznaka;
        this.rasponKrila = rasponKrila;
    }


    public Avion() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public int getRasponKrila() {
        return rasponKrila;
    }

    public void setRasponKrila(int rasponKrila) {
        this.rasponKrila = rasponKrila;
    }

    @Override
    public String toString() {
        return  " Id " + id +"Oznaka"+ oznaka + "raspon krila" + rasponKrila ;
    }
}