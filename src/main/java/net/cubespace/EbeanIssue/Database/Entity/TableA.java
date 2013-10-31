package net.cubespace.EbeanIssue.Database.Entity;

import com.avaje.ebean.annotation.CacheStrategy;

import javax.persistence.*;
import java.util.List;

/**
 * @author geNAZt (fabian.fassbender42@googlemail.com)
 * @date Last changed: 31.10.13 13:18
 */
@Entity
@Table(name="table_a")
@CacheStrategy(readOnly = false, useBeanCache = true, warmingQuery = "order by id")
public class TableA {
    @Id
    private Integer id;

    private String test;
    @OneToMany(cascade = CascadeType.ALL)
    private List<TableB> tableBs;

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

    public List<TableB> getTableBs() {
        return tableBs;
    }

    public void setTableBs(List<TableB> tableBs) {
        this.tableBs = tableBs;
    }
}
