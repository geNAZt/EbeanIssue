package net.cubespace.EbeanIssue.Database.Entity;

import com.avaje.ebean.annotation.CacheStrategy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author geNAZt (fabian.fassbender42@googlemail.com)
 * @date Last changed: 31.10.13 13:18
 */
@Entity
@Table(name="table_b")
@CacheStrategy(readOnly = false, useBeanCache = true, warmingQuery = "order by id")
public class TableB {
    @Id
    private Integer id;

    private String test;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
