
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela PETSHOP
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"PETSHOP\"")
@XmlRootElement
@CronappSecurity
@CronappSwagger
@JsonFilter("app.entity.Petshop")
@CronappTable(role=CronappTableRole.CLASS)
public class Petshop implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Id", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Name")
    @Column(name = "name", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String name;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Adress")
    @Column(name = "adress", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String adress;


    /**
    * Construtor
    * @generated
    */
    public Petshop(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Petshop setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém name
    * return name
    * @generated
    */
    public java.lang.String getName() {
        return this.name;
    }

    /**
    * Define name
    * @param name name
    * @generated
    */
    public Petshop setName(java.lang.String name) {
        this.name = name;
        return this;
    }
    /**
    * Obtém adress
    * return adress
    * @generated
    */
    public java.lang.String getAdress() {
        return this.adress;
    }

    /**
    * Define adress
    * @param adress adress
    * @generated
    */
    public Petshop setAdress(java.lang.String adress) {
        this.adress = adress;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Petshop object = (Petshop)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}