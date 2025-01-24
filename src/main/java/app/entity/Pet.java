
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
* Classe que representa a tabela PET
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"PET\"")
@XmlRootElement
@CronappSecurity
@CronappSwagger
@JsonFilter("app.entity.Pet")
@CronappTable(role=CronappTableRole.CLASS)
public class Pet implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Age")
    @Column(name = "age", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String age;


    /**
    * @generated
    */
    @OneToOne
    @JoinColumn(name="fk_petshop", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Petshop petshop;


    /**
    * Construtor
    * @generated
    */
    public Pet(){
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
    public Pet setId(java.lang.String id) {
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
    public Pet setName(java.lang.String name) {
        this.name = name;
        return this;
    }
    /**
    * Obtém age
    * return age
    * @generated
    */
    public java.lang.String getAge() {
        return this.age;
    }

    /**
    * Define age
    * @param age age
    * @generated
    */
    public Pet setAge(java.lang.String age) {
        this.age = age;
        return this;
    }
    /**
    * Obtém petshop
    * return petshop
    * @generated
    */
    public Petshop getPetshop() {
        return this.petshop;
    }

    /**
    * Define petshop
    * @param petshop petshop
    * @generated
    */
    public Pet setPetshop(Petshop petshop) {
        this.petshop = petshop;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Pet object = (Pet)obj;
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