/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.usingbound;

import java.util.Scanner;

/**
 *
 * @author ratchaphum
 */
public class UsingBound {

    public static void main(String[] args) {
         System.out.print ("Enter Score ");
    ScoreSoure obj = new ScoreSoure();
    Subscriber obj1 = new Subscriber ();
    Subscriber obj2= new Subscriber ();
    obj.addPropertyChangeListener(obj1); obj.addPropertyChangeListener(obj2);

    Scanner inp = new Scanner (System.in);
    
    
    String scoreLine;
    
    System.out.print("Enter Score ");
    scoreLine = inp.nextLine();
    while (!scoreLine.equals ("")) {
        obj.setSomeData(scoreLine);
        System.out.print ("Enter Score ");
        scoreLine = inp.nextLine();
    }
    }
}
