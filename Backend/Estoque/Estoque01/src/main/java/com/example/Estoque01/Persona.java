
package com.example.Estoque01;

import javax.persistence.*;

@Entity
@Table(name = "personas")
public class Persona {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
     @Column
    private String cod;
      @Column
    private String name;
    @Column
    private String descr;
      @Column
     private int quant;
    @Column 
    private String cat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    /**
     * @return the cod
     */
    public String getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(String cod) {
        this.cod = cod;
    }

    /**
     * @return the desc
     */
    public String getDescr() {
        return descr;
    }

    
    public void setDescr(String descr) {
        this.descr = descr;
    }

    /**
     * @return the quant
     */
    public int getQuant() {
        return quant;
    }

    /**
     * @param quant the quant to set
     */
    public void setQuant(int quant) {
        this.quant = quant;
    }

    /**
     * @return the cat
     */
    public String getCat() {
        return cat;
    }

    /**
     * @param cat the cat to set
     */
    public void setCat(String cat) {
        this.cat = cat;
    }
    
    
}