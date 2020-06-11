/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author jackl
 */
public class Instance {

    private static Instance unique;

    private Instance() {

    }

    public static boolean alreadyInstance() {
        if (unique == null) {
            unique = new Instance();
            System.out.println("Proving...");
            return true;
        } else {
            return false;
        }
    }

    public static Instance getInstance() {
        if (unique == null) {
            unique = new Instance();
        }
        return unique;
    }
}
