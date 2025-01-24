
package mysql.entity;

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
* Classe que representa a tabela Employees
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"Employees\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("mysql.entity.Employees")
@CronappTable(role=CronappTableRole.AUTO)
public class Employees implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="INTEGER", label="Employee ID")
    @Column(name = "EmployeeID", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer employeeID;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Address")
    @Column(name = "Address", nullable = true, unique = false, length=60, insertable=true, updatable=true)
        
        private java.lang.String address;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="Birth Date")
    @Column(name = "BirthDate", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date birthDate;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="City")
    @Column(name = "City", nullable = true, unique = false, length=15, insertable=true, updatable=true)
        
        private java.lang.String city;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Country")
    @Column(name = "Country", nullable = true, unique = false, length=15, insertable=true, updatable=true)
        
        private java.lang.String country;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ReportsTo", nullable = true, referencedColumnName = "EmployeeID", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "FK_Employees_Employees", foreignKeyDefinition = "FOREIGN KEY (ReportsTo) REFERENCES EMPLOYEES (EmployeeID)"))
        
        private Employees employees;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Extension")
    @Column(name = "Extension", nullable = true, unique = false, length=4, insertable=true, updatable=true)
        
        private java.lang.String extension;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="First Name")
    @Column(name = "FirstName", nullable = false, unique = false, length=10, insertable=true, updatable=true)
        
        private java.lang.String firstName;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="Hire Date")
    @Column(name = "HireDate", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date hireDate;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Home Phone")
    @Column(name = "HomePhone", nullable = true, unique = false, length=24, insertable=true, updatable=true)
        
        private java.lang.String homePhone;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Last Name")
    @Column(name = "LastName", nullable = false, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String lastName;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Notes")
    @Column(name = "Notes", nullable = false, unique = false, length=16777215, insertable=true, updatable=true)
        
        private java.lang.String notes;


    /**
    * @generated
    */
    @CronappColumn(attributeType="IMAGE_DATABASE", label="Photo")
    @Column(name = "Photo", nullable = true, unique = false, length=2147483647, insertable=true, updatable=true)
        
        private byte[] photo;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Photo Path")
    @Column(name = "PhotoPath", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String photoPath;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Postal Code")
    @Column(name = "PostalCode", nullable = true, unique = false, length=10, insertable=true, updatable=true)
        
        private java.lang.String postalCode;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Region")
    @Column(name = "Region", nullable = true, unique = false, length=15, insertable=true, updatable=true)
        
        private java.lang.String region;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Salary")
    @Column(name = "Salary", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Float salary;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Title")
    @Column(name = "Title", nullable = true, unique = false, length=30, insertable=true, updatable=true)
        
        private java.lang.String title;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Title Of Courtesy")
    @Column(name = "TitleOfCourtesy", nullable = true, unique = false, length=25, insertable=true, updatable=true)
        
        private java.lang.String titleOfCourtesy;


    /**
    * Construtor
    * @generated
    */
    public Employees(){
    }

    /**
    * Obtém employeeID
    * return employeeID
    * @generated
    */
    public java.lang.Integer getEmployeeID() {
        return this.employeeID;
    }

    /**
    * Define employeeID
    * @param employeeID employeeID
    * @generated
    */
    public Employees setEmployeeID(java.lang.Integer employeeID) {
        this.employeeID = employeeID;
        return this;
    }
    /**
    * Obtém address
    * return address
    * @generated
    */
    public java.lang.String getAddress() {
        return this.address;
    }

    /**
    * Define address
    * @param address address
    * @generated
    */
    public Employees setAddress(java.lang.String address) {
        this.address = address;
        return this;
    }
    /**
    * Obtém birthDate
    * return birthDate
    * @generated
    */
    public java.util.Date getBirthDate() {
        return this.birthDate;
    }

    /**
    * Define birthDate
    * @param birthDate birthDate
    * @generated
    */
    public Employees setBirthDate(java.util.Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }
    /**
    * Obtém city
    * return city
    * @generated
    */
    public java.lang.String getCity() {
        return this.city;
    }

    /**
    * Define city
    * @param city city
    * @generated
    */
    public Employees setCity(java.lang.String city) {
        this.city = city;
        return this;
    }
    /**
    * Obtém country
    * return country
    * @generated
    */
    public java.lang.String getCountry() {
        return this.country;
    }

    /**
    * Define country
    * @param country country
    * @generated
    */
    public Employees setCountry(java.lang.String country) {
        this.country = country;
        return this;
    }
    /**
    * Obtém employees
    * return employees
    * @generated
    */
    public Employees getEmployees() {
        return this.employees;
    }

    /**
    * Define employees
    * @param employees employees
    * @generated
    */
    public Employees setEmployees(Employees employees) {
        this.employees = employees;
        return this;
    }
    /**
    * Obtém extension
    * return extension
    * @generated
    */
    public java.lang.String getExtension() {
        return this.extension;
    }

    /**
    * Define extension
    * @param extension extension
    * @generated
    */
    public Employees setExtension(java.lang.String extension) {
        this.extension = extension;
        return this;
    }
    /**
    * Obtém firstName
    * return firstName
    * @generated
    */
    public java.lang.String getFirstName() {
        return this.firstName;
    }

    /**
    * Define firstName
    * @param firstName firstName
    * @generated
    */
    public Employees setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
        return this;
    }
    /**
    * Obtém hireDate
    * return hireDate
    * @generated
    */
    public java.util.Date getHireDate() {
        return this.hireDate;
    }

    /**
    * Define hireDate
    * @param hireDate hireDate
    * @generated
    */
    public Employees setHireDate(java.util.Date hireDate) {
        this.hireDate = hireDate;
        return this;
    }
    /**
    * Obtém homePhone
    * return homePhone
    * @generated
    */
    public java.lang.String getHomePhone() {
        return this.homePhone;
    }

    /**
    * Define homePhone
    * @param homePhone homePhone
    * @generated
    */
    public Employees setHomePhone(java.lang.String homePhone) {
        this.homePhone = homePhone;
        return this;
    }
    /**
    * Obtém lastName
    * return lastName
    * @generated
    */
    public java.lang.String getLastName() {
        return this.lastName;
    }

    /**
    * Define lastName
    * @param lastName lastName
    * @generated
    */
    public Employees setLastName(java.lang.String lastName) {
        this.lastName = lastName;
        return this;
    }
    /**
    * Obtém notes
    * return notes
    * @generated
    */
    public java.lang.String getNotes() {
        return this.notes;
    }

    /**
    * Define notes
    * @param notes notes
    * @generated
    */
    public Employees setNotes(java.lang.String notes) {
        this.notes = notes;
        return this;
    }
    /**
    * Obtém photo
    * return photo
    * @generated
    */
    public byte[] getPhoto() {
        return this.photo;
    }

    /**
    * Define photo
    * @param photo photo
    * @generated
    */
    public Employees setPhoto(byte[] photo) {
        this.photo = photo;
        return this;
    }
    /**
    * Obtém photoPath
    * return photoPath
    * @generated
    */
    public java.lang.String getPhotoPath() {
        return this.photoPath;
    }

    /**
    * Define photoPath
    * @param photoPath photoPath
    * @generated
    */
    public Employees setPhotoPath(java.lang.String photoPath) {
        this.photoPath = photoPath;
        return this;
    }
    /**
    * Obtém postalCode
    * return postalCode
    * @generated
    */
    public java.lang.String getPostalCode() {
        return this.postalCode;
    }

    /**
    * Define postalCode
    * @param postalCode postalCode
    * @generated
    */
    public Employees setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
        return this;
    }
    /**
    * Obtém region
    * return region
    * @generated
    */
    public java.lang.String getRegion() {
        return this.region;
    }

    /**
    * Define region
    * @param region region
    * @generated
    */
    public Employees setRegion(java.lang.String region) {
        this.region = region;
        return this;
    }
    /**
    * Obtém salary
    * return salary
    * @generated
    */
    public java.lang.Float getSalary() {
        return this.salary;
    }

    /**
    * Define salary
    * @param salary salary
    * @generated
    */
    public Employees setSalary(java.lang.Float salary) {
        this.salary = salary;
        return this;
    }
    /**
    * Obtém title
    * return title
    * @generated
    */
    public java.lang.String getTitle() {
        return this.title;
    }

    /**
    * Define title
    * @param title title
    * @generated
    */
    public Employees setTitle(java.lang.String title) {
        this.title = title;
        return this;
    }
    /**
    * Obtém titleOfCourtesy
    * return titleOfCourtesy
    * @generated
    */
    public java.lang.String getTitleOfCourtesy() {
        return this.titleOfCourtesy;
    }

    /**
    * Define titleOfCourtesy
    * @param titleOfCourtesy titleOfCourtesy
    * @generated
    */
    public Employees setTitleOfCourtesy(java.lang.String titleOfCourtesy) {
        this.titleOfCourtesy = titleOfCourtesy;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Employees object = (Employees)obj;
        if (employeeID != null ? !employeeID.equals(object.employeeID) : object.employeeID != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((employeeID == null) ? 0 : employeeID.hashCode());
        return result;
    }

}