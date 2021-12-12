package cl.mallea.bitacoraCapitan.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tag", schema = "bitacoracapitan")
public class Tag implements Serializable {

    @Id
    @Column(name = "tag_id_tag")
    private Long tagIdTag;

    @Column(name = "tag_name")
    private String tagName;

    @Column(name = "tag_creation_date")
    private Date tagCreationDate;

    @Column(name = "tag_active")
    private Boolean tagActive;

    @Column(name = "tag_code")
    private String tagCode;


    @ManyToMany
    @JoinTable(name = "document_tag", joinColumns = @JoinColumn(name = "document_tag_id_tag"), inverseJoinColumns = @JoinColumn(name = "document_tag_id_document"))
    @JsonBackReference
    private Set<Document> DocumentTags = new HashSet<>();


    public Tag() {
        super();
    }

    public Tag(String tagName, Date tagCreationDate, Boolean tagActive, String tagCode) {
        this.tagName = tagName;
        this.tagCreationDate = tagCreationDate;
        this.tagActive = tagActive;
        this.tagCode = tagCode;
    }

}
