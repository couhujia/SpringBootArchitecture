package hope.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/4/13.
 */
@Entity(name = "role")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date gmt_create;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date gmt_modified;

    protected Role() {

    }

    public Role(String name) {
        this.name = name;
        this.gmt_create = new Date();
        this.gmt_modified = new Date();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Date getGtmCreate() {
        return this.gmt_create;
    }

    public void setGtmModifies(Date gtm_modified) {
        this.gmt_modified = gtm_modified;
    }

    public Date getGtmModified() {
        return this.gmt_modified;
    }

    public long getId() {
        return this.id;
    }

}
