/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mar7;

/**
 *
 * @author ahmed
 */
 class A{
        public int data=40;
        public A(){
        }
        public void msg(){
            System.out.println("Hello Java");
            
        }
    }
public class Mar7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
A obj = new A();
System.out.println(obj.data);
obj.msg();

    }
    
}
