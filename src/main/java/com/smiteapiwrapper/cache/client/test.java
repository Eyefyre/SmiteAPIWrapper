/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smiteapiwrapper.client;

import java.util.Scanner;

/**
 *
 * @author Adam
 */
public class test {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        SmiteClient client = new SmiteClient();
        System.out.println(client.getGodList());
    }
}
