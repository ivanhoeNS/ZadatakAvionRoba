package model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

public class Roba {


    public static final String POLJE_NAZIV="naziv";

    public static final String POLJE_OPIS="opis";

    public static final String POLJE_TEZINA="tezina";

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = POLJE_NAZIV)
    private String naziv;
    @DatabaseField(columnName = POLJE_OPIS,canBeNull = false)
    private String opis;

    @DatabaseField(columnName = POLJE_TEZINA,canBeNull = false)
    private Double tezina;

    @DatabaseField(foreign = true, foreignAutoRefresh = true, canBeNull = false)
    private Avion avion;


    @ForeignCollectionField(foreignFieldName = "")
    private ForeignCollection<Roba> robas;

    public Roba() {
    }

    public Roba(String naziv, String opis, Double tezina) {
        this.naziv = naziv;
        this.opis = opis;
        this.tezina = tezina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Double getTezina() {
        return tezina;
    }

    public void setTezina(Double tezina) {
        this.tezina = tezina;
    }

    @Override
    public String toString() {
        return "Roba{" +
                "id=" + id +
                ", naziv='" + naziv + '\'' +
                ", opis='" + opis + '\'' +
                ", tezina=" + tezina +
                ", avion=" + avion +
                ", robas=" + robas +
                '}';
    }
}
