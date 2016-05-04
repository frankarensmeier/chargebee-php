/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chargebee.filter;

/**
 *
 * @author sangeetha
 * @param <T>
 * @param <U>
 */
public class BooleanFilter<T,U extends ListRequest> {

    U req;
    String paramName;

    public BooleanFilter(String paramName, U req) {
        this.paramName = paramName;
        this.req = req;
    }

    public U is(T value) {
        req.params.addOpt(paramName + "[is]", value);
        return req;
    }
    
    public U isPresent(T value) {
        req.params.addOpt(paramName + "[is_present]", value);
        return req;
    }
}
