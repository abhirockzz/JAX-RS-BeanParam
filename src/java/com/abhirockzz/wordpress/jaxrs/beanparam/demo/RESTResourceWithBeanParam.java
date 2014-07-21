/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abhirockzz.wordpress.jaxrs.beanparam.demo;

import com.abhirockzz.wordpress.jaxrs.beanparam.demo.model.Book;
import java.util.logging.Logger;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/books")
public class RESTResourceWithBeanParam {
    
    @BeanParam
    private Book book;
    
    @POST
    @Consumes({MediaType.APPLICATION_FORM_URLENCODED})
    
    public Response createBook( ){
        
        //save book
        
        Logger.getLogger("RESTResourceWithBeanParam").info(book.toString());
        
        return Response.ok(book.toString()).build();
    }
    
    /*
    Just a sample method to show life without the @BeanParam annotation
    */
    public Response withoutBeanParam1(@FormParam("") String isbn, 
                                @FormParam("") String name,
                                @FormParam("") String author, 
                                @FormParam("") String publisher){
        
        //create a new Book object using the injected parameters
        
        //Book book = new Book(isbn, name, author, publisher);
        
        //save book
        
        return Response.ok(book.toString()).build();
    }
    
    
     /*
    Just a sample method to show life without the @BeanParam annotation
    */
    public Response withoutBeanParam1(Book book){
        
        
        return Response.ok(book.toString()).build();
    }
}
