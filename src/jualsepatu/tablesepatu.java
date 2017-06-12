/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jualsepatu;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Amar Maruf
 */
@Entity
public class tablesepatu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String namapembeli;
    private String nohp;
    private String alamatpembeli;
    private String mereksepatu;
    private String jenis;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof tablesepatu)) {
            return false;
        }
        tablesepatu other = (tablesepatu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jualsepatu.tablesepatu[ id=" + id + " ]";
    }

    /**
     * @return the namapembeli
     */
    public String getNamapembeli() {
        return namapembeli;
    }

    /**
     * @param namapembeli the namapembeli to set
     */
    public void setNamapembeli(String namapembeli) {
        this.namapembeli = namapembeli;
    }

    /**
     * @return the nohp
     */
    public String getNohp() {
        return nohp;
    }

    /**
     * @param nohp the nohp to set
     */
    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    /**
     * @return the alamatpembeli
     */
    public String getAlamatpembeli() {
        return alamatpembeli;
    }

    /**
     * @param alamatpembeli the alamatpembeli to set
     */
    public void setAlamatpembeli(String alamatpembeli) {
        this.alamatpembeli = alamatpembeli;
    }

    /**
     * @return the mereksepatu
     */
    public String getMereksepatu() {
        return mereksepatu;
    }

    /**
     * @param mereksepatu the mereksepatu to set
     */
    public void setMereksepatu(String mereksepatu) {
        this.mereksepatu = mereksepatu;
    }

    /**
     * @return the jenis
     */
    public String getJenis() {
        return jenis;
    }

    /**
     * @param jenis the jenis to set
     */
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
}
