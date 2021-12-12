package cl.mallea.bitacoraCapitan.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "document_tag", schema = "bitacoracapitan")
public class DocumentTag implements Serializable {

    //@Column(name = "document_tag_id_tag")
    @JoinColumn(name = "document_tag_id_tag" , nullable = false, updatable = false)
    private Long documentTagIdTag;

    //@Column(name="document_tag_id_document")
    @JoinColumn(name = "document_tag_id_document" , nullable = false, updatable = false)
    private Long documentTagIdDocument;

    public DocumentTag() {
        super();
    }

    public DocumentTag(Long documentTagIdTag, Long documentTagIdDocument) {
        this.documentTagIdTag = documentTagIdTag;
        this.documentTagIdDocument = documentTagIdDocument;
    }


}
