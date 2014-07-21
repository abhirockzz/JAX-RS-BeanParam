/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abhirockzz.wordpress.jaxrs.beanparam.demo.model;

import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Book {
    
    @FormParam("isbn")
    private String isbn;
    
    @FormParam("name")
    private String name;
    
    @FormParam("author")
    private String author;
    
    @FormParam("publisher")
    private String publisher;

    public Book() {
    }
    
    @Override
    
    public String toString(){
        return "Book [Name : " + name + "  ISBN : " + isbn + "  Author : "+ author +"  Publisher : "+ publisher +" ]";
    }
    
}
