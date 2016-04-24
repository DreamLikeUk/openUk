package com.dream.like.uk.domain.entities;

import com.dream.like.uk.domain.entities.CategoryEntity;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by natalia on 4/24/16.
 */

public class CategoryEntityTest {
    @Test
    @Transactional
    @Rollback(true)
    public void testAddCategory() {
        CategoryEntity category = new CategoryEntity();
        category.setDescription("jfhhfd");
        category.setName("Фразеологія");
        category.setId(1);

        Assert.notNull("Category description is not empty", category.getDescription());
        Assert.notNull("Category name is not empty", category.getName());
}
