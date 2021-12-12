package cl.mallea.bitacoraCapitan.model;

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
@Table(name = "document", schema = "bitacoracapitan")
public class Document implements Serializable {

    @Id
    @Column(name = "document_id_document")
    private Long documentIdDocument;

    @Column(name = "document_body")
    private String documentBody;

    @Column(name = "document_title")
    private String documentTitle;

    @Column(name = "document_active")
    private Boolean documentoActive;

    @Column(name = "document_creation_date")
    private Date documentCreationDate;


    @ManyToMany
    @JoinTable(name = "document_tag", joinColumns = @JoinColumn(name = "document_tag_id_document"), inverseJoinColumns = @JoinColumn(name = "document_tag_id_tag"))
    private Set<Tag> TagDocuments = new HashSet<>();

    public Document() {
        super();
    }

    public Document(String documentBody, String documentTitle, Boolean documentoActive, Date documentCreationDate) {
        this.documentBody = documentBody;
        this.documentTitle = documentTitle;
        this.documentoActive = documentoActive;
        this.documentCreationDate = documentCreationDate;
    }

}
