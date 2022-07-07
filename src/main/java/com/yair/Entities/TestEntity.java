package com.yair.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test")
public class TestEntity {
    @Id
    private long testId;

    @Column(name = "description")
    private String description;

    public TestEntity() {
    }

    public TestEntity(long testId, String description) {
        this.testId = testId;
        this.description = description;
    }

    public long getTestId() {
        return testId;
    }

    public void setTestId(long testId) {
        this.testId = testId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "TestEntity{" +
                "testId=" + testId +
                ", description='" + description + '\'' +
                '}';
    }
}

