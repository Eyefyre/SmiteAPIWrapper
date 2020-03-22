/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smiteapiwrapper.models;

import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class NamedAPIResourceList {

    private int count;
    private ArrayList<NamedAPIResource> results;

    public NamedAPIResourceList(int count, ArrayList<NamedAPIResource> results) {
        this.count = count;
        this.results = results;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ArrayList<NamedAPIResource> getResults() {
        return results;
    }

    public void setResults(ArrayList<NamedAPIResource> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "NamedAPIResourceList{" + "count=" + count + ", results=" + results + '}';
    }

}
