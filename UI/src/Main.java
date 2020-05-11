package UI.src;

import org.w3c.dom.Text;

public class Main {
    public static void main(String[] args) {
        UIControl[] controls = {new TextBox(), new CheckBox()};
        for(var control : controls )
            control.render();
        


        // var point1 = new Point(1, 2);
        // var point2 = new Point(1, 2);
        // System.err.println(point1.hashCode());
        // System.err.println(point2.hashCode()); 
        
        
        // var control = new UIControl(true);
        // var textBox = new TextBox();
        // show(control);
        // var textBox = new TextBox();
        // textBox.setText("Hello World");
        // System.out.println(textBox); 
  
    }

   /* public static void show(UIControl control){
        if(control instanceof TextBox){
            var textBox = (TextBox)control; 
            textBox.setText("Hello World");
        }
        System.out.println(control);
    }
    */
}