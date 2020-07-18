package com.prac.spring.swagger.api.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "books")
public class Book implements Serializable
{

    private static final long serialVersionUID = -1L;
    @Id
    @GeneratedValue
    @ApiModelProperty(value = "Auto genrated value")
    private int bookId;
    @ApiModelProperty(value = "this is book name")
    private String bookName;
    private double bookPrice;

    public int getId() {
        return bookId;
    }

}
