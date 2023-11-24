/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author owner
 */
public class SingletonPatternDemo {
    public static void main( String[] args){
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
    
}
