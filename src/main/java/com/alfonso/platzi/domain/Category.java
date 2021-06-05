package com.alfonso.platzi.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class Category {
    private Long categoryId;
    private String category;
    private boolean active;

    public Category() {
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", category='" + category + '\'' +
                ", active=" + active +
                '}';
    }
}
