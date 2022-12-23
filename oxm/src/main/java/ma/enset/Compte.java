package ma.enset;

import jakarta.xml.bind.annotation.*;

import java.util.Date;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code;
    private double solde;
   // @XmlTransient   //  Ignore this atribute when converting to xml
    private Date date_creation;
    @XmlAttribute  // change type as an attribute
    private Type type;

    public Compte(int code, double solde, Date date_creation, Type type) {
        this.code = code;
        this.solde = solde;
        this.date_creation = date_creation;
        this.type = type;
    }
    public Compte(){}

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", solde=" + solde +
                ", date_creation=" + date_creation +
                ", type=" + type +
                '}';
    }
}
